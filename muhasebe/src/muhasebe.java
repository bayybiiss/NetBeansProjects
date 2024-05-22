
import java.util.Scanner;


public class muhasebe {
   

   
    
    
    public static void main(String[] args) {



Scanner klavye= new Scanner(System.in);

int bakiye, islemler, cmiktar,ymiktar;

String sifre="abs";
String ad="beyza";

System.out.print("Kullanici Adı: ");
        String kullaniciAdi = klavye.nextLine();
        System.out.print("Parolanızı Giriniz: ");
        String parola = klavye.nextLine();

        if (kullaniciAdi.equals(ad) && parola.equalsIgnoreCase(sifre)) {

            System.out.println("giris basarili");
        

System.out.println("Lütfen işlem yapmak istediğiniz türü seçer misiniz ?");
bakiye=2200;
System.out.println("-Bakiye Sorgulamak İçin 1'e Basın");
System.out.println("-Hesaptan Para Çekmek İçin 2'ye Basın.");
System.out.println("-Hesaba Para Yatırmak İçin 3'e Basın.");
System.out.println("-Sitemden Güvenli Çıkış  İçin 4'e Basın.");

islemler=klavye.nextInt();
/*
* Müşterinin yapabileceği max işlemler yukarıda sınırlandırılıyor.(Bu programda max 4 işlem yapabiliyor.)
*/

/*

* Aşağıda ise İşlemler gerçekleştirilmektedir.
*/
switch(islemler)
{

case 1: System.out.println("Güncel Bakiyeniz:"+bakiye+"TL'dir.");

break;
case 2: System.out.println("Çekmek istediğiniz Tutarı Giriniz:");
cmiktar=klavye.nextInt();


if (cmiktar<=bakiye)
{
    System.out.println("İşleminiz tamamlanmıştır.İşlem sonrası bakiyeniz:"+(bakiye-cmiktar)+"TL'dir");    
   
}
else { 
        System.out.print("Yetersiz bakiye");
        }                
 break;   

case 3:  System.out.println("Yatirmak istediğiniz tutarı giriniz");   
ymiktar=klavye.nextInt();   
System.out.println("İşleminiz tamamlanmıştır.İşlem sonrası bakiyeniz:"+(bakiye+ymiktar+"TL'dir")); 
  break;  

case 4: System.out.println("Sistemden Çıkılıyor.. ");   break;   

default: { 
    System.out.println("Geçersiz tuşlama yaptınız. Lütfen tekrar deneyiniz.");
}   

    
}
        }

else {
        System.out.println("hatali giris");
        }


    
}
}


