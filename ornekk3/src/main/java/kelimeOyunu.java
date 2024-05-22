//import java.util.Scanner;
import java.util.Random;
public class kelimeOyunu {

    private static Object kelime;

public static void main(String[] args){
    
    String [] Kelime = {"bilgisayar","programlama","malatya","bal"};
    int i,tahmin=0,anahtar=0,dogru=0;
    Random rand = new Random();
    String RandomWord = Kelime[rand.nextInt(Kelime.length)];
    
    
    int uzunluk = RandomWord.length();
     String letters [] = new String [uzunluk];
     String [] templateArray = new String [letters.length];
     
     
     System.out.println("kelimenin harflerini tahmin ediniz");
      
      for (int t =0; t <uzunluk  ; t++) {
   
   
   System.out.print(" *"); 
   
 }
  System.out.println();
  System.out.println();
     
    for (int t =0; t < uzunluk  ; t++) {
     
     while(tahmin<6){

                        System.out.println("Bir harf giriniz (Kalan hakkiniz "+(5 -tahmin) +") : ");

                        String harf = klavye.readLine();

                        tahmin++;

                        for (i = 0; i < kelime.length(); i++)

                        {

                                if (kelime.charAt(i) == harf.charAt(0))

                                {

                                        //eldevar = harf+" ";

                                        anahtar = 1;

                                        dogru++;

                                        if (dogru == kelime.length()) {
                                            System.out.println("kelime " +RandomWord+"...Tebrikler..."); break finish; }

                                }

                        }

                        if (anahtar == 1) { anahtar = 0; tahmin--; }

                        for (i = 0; i < kelime.length(); i++)

                        {

                                System.out.print(eldevar);



                        }

                        System.out.println();

                }

                if (dogru != kelime.length()) { System.out.println("Uzgunum... Dogru yanit " + kelime); }

     }
}
    
}
