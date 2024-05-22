import static java.lang.Math.E;
import java.util.Scanner;
import java.util.Random;

public class verilenCevap {
    public static void main(String[] args) {
int i,c,d,e,f,g;
//char karar = 0;
int a=(99+(int) (Math.random()*901));
        //    System.out.println(a);

    Scanner klavye=new Scanner(System.in);
     //   System.out.println("oyun oynamak ister misiniz? \n cevabiniz evet ise E, hayir ise H giriniz.");
      //    karar=klavye.nextLine().charAt(0);
        //switch(karar){
        String karar="E"; 
        while(karar.equalsIgnoreCase("E")){ 
    //case'E' -> {
      
            System.out.println("oyun oynamak isteer misiniz?");
    Scanner verilenCevap=new Scanner(System.in);
    karar=verilenCevap.nextLine();
        System.out.println("tahmini uc basamaklı sayinizi giriniz");
        int sayi=klavye.nextInt();
        
        System.out.println("bilgisayarin urettigi sayi:");
         System.out.println(a);
        
        
        i=sayi%100;
        c=(sayi%100)/10;
        d=(sayi%100)%10;
        
        
        e=a%100;
        f=(a%100)/10;
        g=(a%100)%10;
        
        if(i==e) System.out.println("E");
        else if(e-i<=2) System.out.println("Y");
        else if(e-i>=2) System.out.println("U");
        
        if(c==f) System.out.println("E");
        else if(f-c<=2) System.out.println("Y");
        else if(f-c>=2) System.out.println("U");
        
        if(d==g) System.out.println("E");
        else if(g-d<=2) System.out.println("Y");
        else if(g-d>=2) System.out.println("U");
        
       
        System.out.println("game over");}
    //default -> System.out.println("game over");
}
}
