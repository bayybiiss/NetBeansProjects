
package dosyaıslemeleri2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class DosyaIslemeleri2 {

    
    public static void main(String[] args) {

        try { 
        BufferedReader girisAkimi = new BufferedReader(new FileReader("deneme1.txt")); 
        BufferedReader girisAkimi1 = new BufferedReader(new FileReader("deneme2.txt")); 
        
        String satir = null;
        int sayac = 0;
        satir = girisAkimi.readLine( );
            while (satir != null) {
                sayac++;
                    System.out.print("deneme1.txt dosyasinin " + sayac);
                    System.out.print("satirinda:" + sayac);
                    System.out.println("\"" + satir + "\" yazmaktadir. ");
                    satir = girisAkimi.readLine( );
}
        girisAkimi.close( );
}
            catch(FileNotFoundException e)
                {
                System.out.print("ornek.txt dosyasi bulunamadi");
                System.out.println("veya acilamadi.");
                }

            catch(IOException e)
                {
                System.out.print("ornek.txt dosyasindan veri girisinde");
                System.out.println(" hata olustu."); 
                }
    }
    
}
