import java.util.Scanner;
public class sondan {
    public static void main(String[] args) {

        int i,c,d,e,f,g;
        int a=(99+(int) (Math.random()*901));   
        Scanner klavye=new Scanner(System.in);
        String karar="E"; 
        int sayac=0;
        while(karar.equalsIgnoreCase("E")){ 
    System.out.println("oyun oynamaya devam etmek ister misiniz?");
            System.out.println("Cevabiniz evet ise E, hayir ise H giriniz");
            Scanner verilenCevap=new Scanner(System.in);
            karar=verilenCevap.nextLine();     
            
            do{
            System.out.println("tahmini uc basamaklı sayinizi giriniz");
            int sayi=klavye.nextInt();       
            System.out.println("bilgisayarin urettigi sayi:");
            System.out.println(a);
            sayac++;}
        
            while(i==e && c==f && d==g);
        i=sayi%100;
        c=(sayi%100)/10;
        d=(sayi%100)%10;
        
        e=a%100;
        f=(a%100)/10;
        g=(a%100)%10;
        
       
        
        if(i==e) System.out.println("E");
        else if(Math.abs(e-i)<=2) System.out.println("Y");
        else if(Math.abs(e-i)>=2) System.out.println("U");
        
        if(c==f) System.out.println("E");
        else if(Math.abs(f-c)<=2) System.out.println("Y");
        else if(Math.abs(f-c)>=2) System.out.println("U");
        
        if(d==g) System.out.println("E");
        else if(Math.abs(g-d)<=2) System.out.println("Y");
        else if(Math.abs(g-d)>=2) System.out.println("U");
            
            
        
      //  while(i==e && c==f && d==g);
            System.out.println("tebrikler"+ sayac +".denemede sayiyi buldunuz");
        
           /* System.out.println("oyun oynamaya devam etmek ister misiniz?");
            System.out.println("Cevabiniz evet ise E, hayir ise H giriniz");
            Scanner verilenCevap=new Scanner(System.in);
            karar=verilenCevap.nextLine();     */
      }
        System.out.println("game over");}
}

