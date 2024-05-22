
package kaldigecti;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class Kaldigecti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner klavye=new Scanner(System.in);
  
  float vize[]=new float[30];
  float sınav[]=new float[30];
  float sonuc[]=new float[30];
 float viz,sın,ort;
  
 for(int z=0; z<30; z++)
 {
     System.out.println(+(z+1)+". ogrencinin vize notunu giriniz");
 vize[z]=klavye.nextInt();
     System.out.println(+(z+1)+". ogrencinin final notunu giriniz");
 sınav[z]=klavye.nextInt();
 sonuc[z]=vize[z]*4/10+sınav[z]*6/10;
 
 if(sonuc[z]>60){
      System.out.println((z+1)+". kişi"+sonuc[z]+"ortalama ile gecti");
      
  }
  else if(sonuc[z]<50){
      System.out.println((z+1)+".kişi"+sonuc[z]+"ortalaama ile kaldı");
  }
  else {
      System.out.println((z+1)+".kişi"+sonuc[z]+"ortalama ile sorunlu gecti");
  }
 
 }
 
 
 
    }
}