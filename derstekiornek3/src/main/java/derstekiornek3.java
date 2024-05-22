
import java.util.Scanner;

public class derstekiornek3 {
    public static double  hesap(int a,int b, String islem){
        int cik;
        float bol;
        if(islem.equals("T")){
        return a+b;
        }
        else if(islem.equals("F")){
        int cık;
        if(a>b){
            cık=a-b;
        }
        else cık=b-a;
        return cık;}
        
        else if(islem.equals("B"))
        {
           bol=a/b;
           return bol;
        }
        
        else if(islem.equals("C")){
            return a*b;
        }
        return 0;
    
    }

    public static void main(String[] args){
     String karar="E";
        while(karar.equalsIgnoreCase("E")){
      Scanner klavye = new Scanner (System.in);  
        System.out.println("yapmak istediginiz islemi seciniz");
      System.out.println("tolpam:T    cıkarma:F   bolme:B   carpma:C girin");
      String islem = klavye.next();
        System.out.println("sayilarinizi giriniz");
      int a=klavye.nextInt();
      int b=klavye.nextInt();
      
        System.out.println(hesap(a,b,islem));
        
        System.out.println("devam edicekseniz E harfine basiniz");
       Scanner cevap=new Scanner(System.in);
       karar=cevap.nextLine();
  
    }
        
        }
}
    


