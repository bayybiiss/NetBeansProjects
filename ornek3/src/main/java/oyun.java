import java.util.Scanner;


public class oyun {
    
     public static void main(String [] args){
     
         Scanner klavye=new Scanner(System.in);
         String kelime="programlama";
         int uzunluk=kelime.length();
         char karakter='*';
         int tahmin=0,anahtar=0,dogru=0;
         String eldevar[] = new String[kelime.length()];
         
     for(int i=0; i<uzunluk; i++)
     {
         System.out.print("*");
     }
     
         System.out.println("");
         
         
         for (int t =0; t < uzunluk  ; t++)
         {
             System.out.println("tahmini harfinizi girinizb");
         
         String harf=klavye.next();
        for (int i = 0; i < kelime.length(); i++)

                        {

                                if (kelime.charAt(i) == harf.charAt(0))
   
                                {
                                
                                eldevar[i] = harf+" ";
                                        anahtar = 1;
                                        dogru++;
                                        if (dogru == kelime.length()) { 
                                            System.out.println("kelime:"+kelime); 
                                           
                                }
         
         
                        }
                                if (anahtar == 1) { anahtar = 0; tahmin--; }
                        for (i = 0; i < kelime.length(); i++)
                        {
                                System.out.print(eldevar[i]);

                        }
                        System.out.println();
                }
                if (dogru != kelime.length()) { System.out.println("Uzgunum... Dogru yanit " + kelime); }
}
}
}
