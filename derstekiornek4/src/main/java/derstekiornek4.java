
import java.util.Scanner;

//büyüklüğü 10 olan tek boyutlu diiz oluştur bu diziye  girilen sayının tek mi 
//çift mi olduğunu bul tek ve çift olnaların ortalamalarını ayrı ayı hesapla ekrana yazdır
public class derstekiornek4 {
    public static void main(String[] args){
        int dizi[]=new int[10];
        int ort=0, top=0,sayac=0, sayacc=0 ;
        int ortalama=0;
        int toplam=0;
      
        for(int i=0; i<=9;i++)
        {
        System.out.println("kontrol ediecek sayiyi giriniz:");
        
        Scanner klavye=new Scanner (System.in);
        dizi[i]=klavye.nextInt();
        if(dizi[i]%2==0)
        {
            top+=dizi[i];
            sayac++;
            ort=top/sayac;
            System.out.println("cift sayilarinizin ortalamasi"+ort);
        }
        else {
        top+=dizi[i];
            sayacc++;
            ortalama=toplam/sayacc;
            System.out.println("cift sayilarinizin ortalamasi"+ortalama);
        }
        }
    
    }
}
