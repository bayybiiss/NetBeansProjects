
import java.util.Scanner;


public class asalsayi1 {

   
    public static void main(String[] args) {

    int sayi;
    Scanner klv=new Scanner(System.in);
    
        System.out.println("asalligi arastirilacak sayiyi giriniz");
    
    sayi=klv.nextInt();
    
    boolean asal=true;
    
    
    if (sayi==1){
        System.out.println("sayi asal degildir");
        return;
    }
    if(sayi<1){
        System.out.println("gecersiz sayi");
    }
    
    for(int i=2;i<sayi;i++){
        if(sayi%i==0){
            asal=false;
        }
    }
    
    
    if(asal){
        System.out.println("sayi asaldir");
    }
    else{
        System.out.println("sayi asal degildir");
    }
    
    }
    
}
