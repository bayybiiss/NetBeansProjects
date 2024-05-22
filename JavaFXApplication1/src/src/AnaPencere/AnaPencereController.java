package AnaPencere;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Optional;
import java.util.ResourceBundle;


import com.jfoenix.controls.JFXTextField;
import com.jfoenix.effects.JFXDepthManager;

import DatabaseBaglanti.DatabaseConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AnaPencereController implements Initializable
{
	@FXML
	private StackPane rootPane;
	
	@FXML
	private HBox book_info;
	@FXML
	private HBox member_info;
	
	@FXML
	private TextField idText;
	
	@FXML
	private TextField uyeIdText;
	
	@FXML
	private Text kitapIsmi;
	
	@FXML
	private Text kitapYazari;
	
	@FXML
	private Text kitapDurumu;
	
	@FXML
	private Text uyeText;
	
	@FXML
	private Text iletisimText;
	
	@FXML
	private JFXTextField kitapIdJ;
	
	@FXML
	private ImageView uyeResim;
	
	 @FXML
	    private ListView<String> issueDataList;
	 
	 Boolean oduncVer=false;
	
	Connection conn=null;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		conn=DatabaseConnection.BaglantiKur();
		JFXDepthManager.setDepth(book_info, 1);//bu k�s�m Hbox a derinlik veriyor g�rsellik kat�yor.
		JFXDepthManager.setDepth(member_info, 1);
		
	}
	
	
	@FXML
	public void loadUyeEkle() throws IOException
	{
		loadWindow("/UyeEkle/UyeEkle.fxml", "Yeni �ye Ekle");
	}
	
	@FXML
	public void loadKitapEkle() throws IOException
	{
		loadWindow("/KitapEkle/AddBook.fxml", "Yeni Kitap Ekle");
	}
	
	@FXML
	public void loadUyeTablosu() throws IOException
	{
		loadWindow("/UyeListele/UyeListele.fxml", "�ye Listesi");
	}
	
	@FXML
	public void loadAyarlar() throws IOException
	{
		loadWindow("/Ayarlar/Ayarlar.fxml", "Genel Ayarlar");
	}
	
	@FXML
	public void loadKitapTablosu() throws IOException
	{
		loadWindow("/KitapListele/KitapListele.fxml", "Kitap Listesi");
	}
	
	void loadWindow(String loc,String title) throws IOException
	{
		Parent parent=FXMLLoader.load(getClass().getResource(loc));
		Stage stage=new Stage(StageStyle.DECORATED);
		stage.setTitle(title);
		stage.setScene(new Scene(parent));
		stage.show();
	}
	
	
	
	@FXML
	public void loadKitapBilgisi(ActionEvent event) throws SQLException
	{
		PreparedStatement ps=null;
		ResultSet rs=null;
		boolean flag=false;
		String id=idText.getText();
		String sorgu="SELECT * FROM BOOK WHERE ID=?";
		
		ps=conn.prepareStatement(sorgu);
		ps.setString(1, id);
		
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			String kitapAdi=rs.getString("TITLE");
			String kitapYazar=rs.getString("AUTHOR");
			String kitapDurum=rs.getString("ISAVAIL");
			kitapIsmi.setText(kitapAdi);
			kitapYazari.setText(kitapYazar);
			if(kitapDurum.equals("yes"))
			{
			kitapDurumu.setText("�d�n� Al�nabilir");
			}
			else if(kitapDurum.equals("no") )
			{
			kitapDurumu.setText("�d�n� Al�namaz");
			}
			
			
			flag=true;
			
		}
		if(!flag)
		{
			kitapIsmi.setText("Bulunamad�...");
			kitapYazari.setText("Bulunamad�...");
		}
		
		
	}
	
	
	@FXML
	public void loadUyeBilgisi(ActionEvent event) throws SQLException, FileNotFoundException
	{
		PreparedStatement ps=null;
		ResultSet rs=null;
		boolean flag=false;
		String id=uyeIdText.getText();
		
		String sorgu="SELECT * FROM MEMBER WHERE ID=?";
		
		ps=conn.prepareStatement(sorgu);
		ps.setString(1, id);
		
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			String uyeAdi=rs.getString("NAME");
			String uyeTel=rs.getString("MOBILE");
			
			uyeText.setText(uyeAdi);
			iletisimText.setText(uyeTel);
			
			
		}
		flag=true;
		
		if(!flag)
		{
			uyeText.setText("Bulunamad�...");
			iletisimText.setText("Bulunamad�...");
		}
		
		
	}
	
	
	@FXML
	public void IssueTablosuKur(ActionEvent event) throws SQLException
	{
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		PreparedStatement ps2=null;
		ResultSet rs2=null;
		
		PreparedStatement ps3=null;
		ResultSet rs3=null;
		
		String uyeId=uyeIdText.getText();
		String kitapId=idText.getText();
		//alt k�s�m �d�n� verilirken are you sure ekran�n� olu�turan kod par�as�
		Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("�d�n� Verme ��lemi");
		alert.setHeaderText(null);
		alert.setContentText(uyeText.getText()+" adl� ki�iye "+"\n "+kitapIsmi.getText()+" isimli kitab� �d�n� vermek istedi�inize emin misiniz ?");
		
		Optional<ButtonType> response=alert.showAndWait();
		
		if(response.get()==ButtonType.OK)
		{
			 String uygunMu="SELECT * FROM BOOK  WHERE ID=?";
			 ps3=conn.prepareStatement(uygunMu);	 
			 ps3.setString(1, kitapId);
			 rs3=ps3.executeQuery();
			 
			 while(rs3.next())
			 {
				
			 if(rs3.getString("ISAVAIL").equals("yes"))
			 {
			 String sorgu="INSERT INTO ISSUE(BOOK_ID,MEMBER_ID) VALUES(?,?)";
			 ps=conn.prepareStatement(sorgu);
			 ps.setString(1, kitapId);
			 ps.setString(2, uyeId);
			 rs=ps.executeQuery();
			 
			 String sorgu2="UPDATE BOOK SET ISAVAIL=? WHERE ID=?";
			 ps2=conn.prepareStatement(sorgu2);
			 ps2.setString(1, "no");
			 ps2.setString(2, kitapId);
			 rs2=ps2.executeQuery();
			 
			 if(rs!=null && rs2!=null)
			 {
				Alert alert1=new Alert(Alert.AlertType.INFORMATION);
				alert1.setTitle("Ba�ar�l�!");
				alert1.setHeaderText(null);
				alert1.setContentText("�d�n� verme i�lemi ba�ar�yla sonland�...");
				alert1.showAndWait();
			 }
			 else
			 {
					Alert alert1=new Alert(Alert.AlertType.ERROR);
					alert1.setTitle("BA�ARISIZ!!!");
					alert1.setHeaderText(null);
					alert1.setContentText("BA�ARISIZ OLUNDU!!!");
					alert1.showAndWait();
			 }
			 
			 }
			 else
			 {
				 Alert alert1=new Alert(Alert.AlertType.ERROR);
					alert1.setTitle("BA�ARISIZ!!!");
					alert1.setHeaderText(null);
					alert1.setContentText("Bu kitap zaten �d�n� verilmi�");
					alert1.showAndWait();
			 }
			 }
			 
		}
		
		
		
		else
		{
			Alert alert1=new Alert(Alert.AlertType.INFORMATION);
			alert1.setTitle("�d�n� verme iptal edildi");
			alert1.setHeaderText(null);
			alert1.setContentText("�d�n� verme iptal edildi");
			alert1.showAndWait();
		}
		
		
	}
	
	
	@SuppressWarnings({ "deprecation", "unused" })
	@FXML
	private void loadKitapBilgisi2P(ActionEvent event) throws SQLException
	{
		ObservableList<String> issueData=FXCollections.observableArrayList();
		 oduncVer=false;
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		String bookID=kitapIdJ.getText();
		String sorgu="SELECT * FROM ISSUE WHERE BOOK_ID=?";
		
		 ps=conn.prepareStatement(sorgu);
		 ps.setString(1, bookID);
		 rs=ps.executeQuery();
		 
		 while(rs.next())
		 {
			 String kid=bookID;
			 String mid=rs.getString("MEMBER_ID");
			 java.sql.Timestamp kissueTime=rs.getTimestamp("ISSUE_TIME");
			 int renewCount=rs.getInt("RENEW_COUNT");
			 issueData.add("-�D�N� VER�LME B�LG�LER�-");
			 issueData.add("�d�n� Verme Tarihi ve Saati: "+kissueTime.toString());
			 issueData.add("Uzatma Say�s�: "+renewCount);
			 
			 issueData.add("-K�TAP B�LG�LER�-");
			 String bookSorgu="SELECT * FROM BOOK WHERE ID=?";
			 PreparedStatement ps1=null;
			 ResultSet rs1=null;
			 ps1=conn.prepareStatement(bookSorgu);
			 ps1.setString(1, kid);
			 rs1=ps1.executeQuery();
			 while(rs1.next())
			 {
				 issueData.add("Kitap Ad� :"+rs1.getString("TITLE"));
				 issueData.add("Kitap ID :"+rs1.getString("ID"));
				 issueData.add("Kitap Yazar� :"+rs1.getString("AUTHOR"));
				 issueData.add("Kitap YAYINCISI :"+rs1.getString("PUBLISHER"));
				 
			 }
			 
			 issueData.add("-�YE B�LG�LER�-");
			 String memberSorgu="SELECT * FROM MEMBER WHERE ID=?";
			 PreparedStatement ps2=null;
			 ResultSet rs2=null;
			 ps2=conn.prepareStatement(memberSorgu);
			 ps2.setString(1, mid);
			 rs2=ps2.executeQuery();
			 while(rs2.next())
			 {
				 issueData.add("�ye Ad� :"+rs2.getString("NAME"));
				 issueData.add("�ye ID :"+rs2.getString("ID"));
				 issueData.add("�ye Telefon :"+rs2.getString("MOBILE"));
				 issueData.add("�ye E-Mail :"+rs2.getString("MAIL"));
				 
			 }
			 oduncVer=true;
			 
			 
		 }
		
		 if(oduncVer==false)
		 {
			 Alert alert1=new Alert(Alert.AlertType.INFORMATION);
				alert1.setTitle("KITAP BULUNAMADI");
				alert1.setHeaderText(null);
				alert1.setContentText("Bu kitap hen�z �d�n� verilmedi...");
				alert1.showAndWait();
		 }
		 
		 issueDataList.getItems().setAll(issueData);
		
	}
	
	
	@FXML
	 private void sonlandirOperasyon(ActionEvent event) throws SQLException 
	 {
		if(!oduncVer)
		{
			Alert alert1=new Alert(Alert.AlertType.ERROR);
			alert1.setTitle("KITAP HATASI");
			alert1.setHeaderText(null);
			alert1.setContentText("Bu Kitap �d�n� Verilmedi�i ��in �d�n� S�resi Sonland�r�lam�yor!");
			alert1.showAndWait();
			return;
		}
		
		
		Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("�d�n� Verme ��lemi");
		alert.setHeaderText(null);
		alert.setContentText("�d�n� s�resini sonland�rmak istedi�inize emin misiniz ?");
		
		Optional<ButtonType> response=alert.showAndWait();
		
		if(response.get()==ButtonType.OK)
		{
		String id=kitapIdJ.getText();
		String ac1="DELETE FROM ISSUE WHERE BOOK_ID=?";
		String ac2="UPDATE BOOK SET ISAVAIL=? WHERE ID=?";
		
		 PreparedStatement ps=null;
		 ResultSet rs=null;
		 ps=conn.prepareStatement(ac1);
		 ps.setString(1, id);
		 rs=ps.executeQuery();
		
		 PreparedStatement ps2=null;
		 ResultSet rs2=null;
		 ps2=conn.prepareStatement(ac2);
		 ps2.setString(1, "yes");
		 ps2.setString(2,id );
		 rs2=ps2.executeQuery();
		 
		 if(rs!=null && rs2!=null)
		 {
			Alert alert1=new Alert(Alert.AlertType.INFORMATION);
			alert1.setTitle("K�TAP TESL�M ALINDI...");
			alert1.setHeaderText(null);
			alert1.setContentText("Kitap �d�n� S�resi Sonland�r�ld�...");
			alert1.showAndWait();
		 }
		 else
		 {
				Alert alert1=new Alert(Alert.AlertType.ERROR);
				alert1.setTitle("BA�ARISIZ!!!");
				alert1.setHeaderText(null);
				alert1.setContentText("BA�ARISIZ OLUNDU!!!");
				alert1.showAndWait();
		 }
		}
		
		
	 }
	
	
	
	@FXML
	private void oduncYenile(ActionEvent event) throws SQLException
	{
		if(!oduncVer)
		{
			Alert alert1=new Alert(Alert.AlertType.ERROR);
			alert1.setTitle("KITAP HATASI");
			alert1.setHeaderText(null);
			alert1.setContentText("Bu Kitap �d�n� Verilmedi�i ��in �d�n� S�resi YEN�LENEM�YOR!");
			alert1.showAndWait();
			return;
		}
		
		Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("�d�n� S�re Yenileme ��lemi");
		alert.setHeaderText(null);
		alert.setContentText("�d�n� s�resini yenilemek istedi�inize emin misiniz ?");
		
		Optional<ButtonType> response=alert.showAndWait();
		
		if(response.get()==ButtonType.OK)
		{
			String renewCountBestenKucukMu="SELECT * FROM ISSUE WHERE BOOK_ID=?";
			PreparedStatement ps1=null;
			 ResultSet rs1=null;
			 ps1=conn.prepareStatement(renewCountBestenKucukMu);
			 ps1.setString(1,  kitapIdJ.getText());
			 rs1=ps1.executeQuery();
			 while(rs1.next())
			 {
				 if(rs1.getInt("RENEW_COUNT")>=5)
				 {
					 Alert alert1=new Alert(Alert.AlertType.ERROR);
						alert1.setTitle("SURE YENILENEMEDI");
						alert1.setHeaderText(null);
						alert1.setContentText("Ayn� Kitap 5 defadan fazla �d�n� al�namaz!");
						alert1.showAndWait();
						return;
				 }
			 }
			
			
			
			
			String sorgu="UPDATE ISSUE SET ISSUE_TIME=CURRENT_TIMESTAMP,RENEW_COUNT=RENEW_COUNT+1 WHERE BOOK_ID=?";
			 PreparedStatement ps=null;
			 ResultSet rs=null;
			 ps=conn.prepareStatement(sorgu);
			 ps.setString(1,  kitapIdJ.getText());
			 rs=ps.executeQuery();
			 
			 if(rs!=null)
			 {
				 Alert alert5=new Alert(Alert.AlertType.INFORMATION);
					alert5.setTitle("�d�n� S�re yenileme ��lemi");
					alert5.setHeaderText(null);
					alert5.setContentText("�d�n� s�resi ba�ar� ile yenilendi ");
					alert5.showAndWait();
			 }
			 else
			 {
				 Alert alert1=new Alert(Alert.AlertType.ERROR);
					alert1.setTitle("KITAP HATASI");
					alert1.setHeaderText(null);
					alert1.setContentText("YEN�LENEMED�!!!");
					alert1.showAndWait();
			 }
			
		}
		
		
	}
	
	
	
	@FXML
	private void programiKapat(ActionEvent event)
	{
		((Stage)rootPane.getScene().getWindow()).close();
	}
	
	
	
	@FXML
	private void hakkimda(ActionEvent event) throws IOException
	{
		Parent parent=FXMLLoader.load(getClass().getResource("/AnaPencere/Hakkimda.fxml"));
		Stage stage=new Stage(StageStyle.DECORATED);
		stage.setTitle("Hakk�nda");
		stage.setScene(new Scene(parent));
		stage.show();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
