import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;

public class javaconnect {
    Connection conn;
    
    
    
    
    public static Connection ConnecrDB(){
    
    
        String url ="jdbc:sqlite:C:\\Users\\Excalibur\\OneDrive\\Belgeler\\NetBeansProjects\\Proje\\kutuphane.db";
        Connection conn=null;
    
        try{
            Class.forName("org.sqlite.JDBC");
    
            conn = DriverManager.getConnection(url);
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    
    
    
    
    
    
    
    
    
}
