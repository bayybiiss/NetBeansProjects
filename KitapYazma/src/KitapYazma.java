
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class KitapYazma extends AnaSayfa {


    public void WriteBook(String kitapad,String icerik) throws IOException{
        // TODO code application logic here
        //PrintWriter cikti = null;
        // PrintWriter kitap_adi=null;
        
        {
            String kitap_adi = kitapad;

            File dosya = new File(kitap_adi+".txt");

            try
            {
                FileWriter cikti = new FileWriter(kitap_adi+".txt");
            cikti.write(icerik);
            
            String kitap = icerik;             
            System.out.println("girilen cümle "+kitap_adi+".txt dosyasına yazıldı.");
            cikti.close();
            }
            catch(IOException hata)
            {
                System.out.println(kitap_adi+".txt dosyası oluşturulurken hata oldu");
                
            }

            
            
        }

}

    void WriteBook() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}