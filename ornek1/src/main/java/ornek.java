import java.util.Scanner;
import java.util.Date;

public class ornek {
    public static void main(String[]args){
        
        Scanner klavye=new Scanner(System.in);
        
        System.out.println("Adiniz:");
        String isim1=klavye.next();
       
        System.out.println("Soyadiniz:");
        String isim2=klavye.next();
       
        System.out.println("Kac kg domates:");
        float i=klavye.nextFloat();
        
        System.out.println("Kac kg biber:");
        float b=klavye.nextFloat();
        
        System.out.println("Kac kg patlican:");
        float p=klavye.nextFloat();
        Date objDate=new Date();
       
        System.out.println("Musteri Adi:" +isim1+ "  " +isim2+ "\nSiparis Tarihi:" +objDate.toString());
        
        System.out.println("\nSiparis Detaylari");
       
        System.out.println("Domates \tBiber \t Patlican");
        
        System.out.println(i+ "\t \t" +b+ "\t" +p);
        
        System.out.println("\nAfiyet Olsun");
    }
}
