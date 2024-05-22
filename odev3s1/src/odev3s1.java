
import java.util.Scanner;
import java.util.Random;
public class odev3s1 {
	//Mayın Tarlasının Görüntüsünü Bastıran Fonksiyon
   public static void TarlaBastir(char x[][]) {
	   
	   for(int i=0;i<x[0].length;i++) {
		   System.out.print(" | "+i);
	   }
	   System.out.println(" |");
	   for(int i=0;i<=4*(x.length)+1;i++) {
		   System.out.print("_");
	   }
	   System.out.println();
	for(int i=0;i<x.length;i++) { 
		
		System.out.print(i+"| ");
		
		for(int j=0;j<x[0].length;j++) {
			System.out.print(x[i][j]+" | ");
		}
		System.out.println();
		
	}
	
   }
   
   //Tarlanın  Görünümünü Ve Random Olarak Mayınları Yerleştiren Fonksiyon
	public static void TarlaOlustur(boolean x[][],char TarlaGorunus[][]) {
	   Random rnd=new Random();
	  
           
           
           for(int i=0;i<x.length;i++) {
		   for(int j=0;j<x[0].length;j++) {
			   x[i][j]=false;
			   TarlaGorunus[i][j]='x';
		   }
	   }
	   int MayinSayac=0;
	   while(MayinSayac<15) {
		   MayinSayac=0;
		   int tempsatir=rnd.nextInt(10);
		   int tempsutun=rnd.nextInt(10);
		   x[tempsatir][tempsutun]=true;
		   for(int i=0;i<x.length;i++) {
			   for(int j=0;j<x[0].length;j++) {
				   if(x[i][j]==true) {
					   MayinSayac++;
				   }
			   }
		   }
		   
	   }
		
	}
	
	//Satır Hatalı Giriş Kontrolü
	public static int SatirKontrol(int Satir,Scanner Imput) {
		while((Satir>=10)||(Satir<0)) {
			System.out.println("Satir Hatali!");
			System.out.print("Lutfen Satir Girin (0-9): ");
			Satir=Imput.nextInt();
		}
		return Satir;
	}
	
	//Sütün Hatalı Giriş Kontrolü
	public static int SutunKontrol(int Sutun,Scanner Imput) {
		while((Sutun>=10)||(Sutun<0)) {
			System.out.println("Sutun Hatali!");
			System.out.print("Lutfen Sutun Girin (0-9):");
			Sutun=Imput.nextInt();
		}
		return Sutun;
	}
	
	// Oynanış Fonksiyonu Satır Ve Sütün Sayılarını Alıp Mayın Kontrolüne Göre true-false Değer Döndüren  Fonksiyon
	public static boolean Oyna(boolean MayinKonum[][],char TarlaGorunum[][],Scanner Imput) {
		TarlaBastir(TarlaGorunum);
		System.out.println();
		int Satir,Sutun;
                int puan=0;
		System.out.print("Lutfen Satir Girin (0-9):");
		Satir=Imput.nextInt();
		Satir=SatirKontrol(Satir,Imput);
	
        System.out.println();
		System.out.print("Lutfen Sutun Girin (0-9):");
		Sutun=Imput.nextInt();
		Sutun=SutunKontrol(Sutun,Imput);
		
		//Önceden Girilmiş  Konumların Girilmesini Engelleyen Fonksiyon
	    while(TarlaGorunum[Satir][Sutun]=='0') {
	    	System.out.println();
	    	System.out.println("Bu Konumu Daha Once Girdiniz!");
	    	System.out.print("Lutfen Satir Girin (0-9):");
			Satir=Imput.nextInt();
			Satir=SatirKontrol(Satir,Imput);
		
	        System.out.println();
			System.out.print("Lutfen Sutun Girin (0-9):");
			Sutun=Imput.nextInt();
			Sutun=SutunKontrol(Sutun,Imput);
	    }
		if(MayinKonum[Satir][Sutun]==true) {
                    puan=puan-10;
			for(int i=0;i<TarlaGorunum.length;i++) {
				for(int j=0;j<TarlaGorunum[0].length;j++) {
					if(MayinKonum[i][j]==true) {
						TarlaGorunum[i][j]='*';
					}else {
						TarlaGorunum[i][j]='x';
					}
				}
			}
			System.out.println();
			TarlaBastir(TarlaGorunum);
			System.out.println();
			System.out.println("Mayina Bastin Oyunu Kaybettin! Puaniniz:"+puan);
			return false;
		}else {
			TarlaGorunum[Satir][Sutun]='0';
                        puan+=10;
                        System.out.println("puaniniz:"+puan);
			return true;
		}
	}
	
	
	public static void main(String[] args) {
		
    Scanner Imput=new Scanner (System.in);//Kullanıcıdan Değer Alamızı Sağlayan Class
    
        int a,b;
           
            System.out.print("matrisin satir sayisi :");
            a=Imput.nextInt();
            System.out.println();

            System.out.print("matrisin sutun sayisi :");
            b=Imput.nextInt();
            System.out.println();
           
    
    
    boolean [][]MayinKonum=new boolean[a][b];//	Mayınların Konumunu Tutuğumuz MultiArray
    
    char [][]TarlaGorunum=new char[a][b];//Mayın Tarlasının Görünümünü Tutan Array
    
    TarlaOlustur(MayinKonum,TarlaGorunum);//Tarlayı Oluşturan Fonksiyonun Çağırıldığı Yer
    
   boolean Kontrol=true;
   int HamleSayisi=0;
   
   
   //Oyunun Tekrar Döngüsü Ve Kazanma Kontrolü
   
    while(Kontrol) {
    	HamleSayisi++;
        
    Kontrol=Oyna(MayinKonum,TarlaGorunum,Imput);
    if(HamleSayisi==86) {
    	System.out.println("Hic Mayina Basmadiniz Oyunu Kazandiniz!");
    	Kontrol=false;
    }
    }
    
   System.out.println("Hamle Sayisi="+(HamleSayisi-1));
	}
	
	

}
