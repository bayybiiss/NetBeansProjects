
package coptoplayicisi;

import java.util.Arrays;


public class CopToplayicisi {

   
    public static void main(String[] args) {

       /* for(int i=0; i<10; i++){
            Elma e = new Elma(i);
        }
        System.gc();
        for(int i=10; i<21; i++){
            Elma e =new Elma(i);
        }*/
        
        int[] liste = {1, 4, 99, 2, 5, -3, 6, 2,-49,52};//Dizi'mizi oluşturuyoruz
 
        for (int i = 0; i < liste.length-1; i++) { //Dizimizin değerlerini sırası ile alıyoruz
 
            int sayi = liste[i]; //sıradaki değeri sayi değişkenine atıyoruz
            int temp = i; //sayi 'nin indeksini temp değerine atıyoruz
 
            for (int j = i+1; j < liste.length ; j++) { //dizimizde i' den sonraki elemanlara bakıyoruz
                if(liste[j]<sayi){ //sayi değişkeninden küçük sayı var mı
                    sayi = liste[j]; //varsa sayi değişkenimizide değiştiriyoruz
                    temp = j; //indeks değerinide değiştiriyoruz
                }
            }
 
            if(temp != i){ //temp değeri başlangıç değeri ile aynı değil ise , yani list[i]'nin değerinden küçük sayı varsa onları yer değiştiriyoruz
                liste[temp] = liste[i];
                liste[i] = sayi;
            }
 
        }
 
        for (int sayi:liste) {
            //Bu kısım sıralama ile ilgili değil sadece sıralamanın doğru calısıp calısmadıgını kontrol etmek için
            System.out.println(sayi);
 
        }
            
        int dizi[]={6,5,3,1,8,7,2,4};
		Arrays.sort(dizi);//dizi sıralandı
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
        int array1[]={9,4,2,6,3,7};
	int array2[]=new int[5];
        System.arraycopy(array1, 1, array2, 0, 4);
        for (int i = 0; i < array2.length; i++) {
			System.out.println("Dizi'nin "+i+". eleamanı: "+array2[i]);
		}
                
                
        
    
    }
    
}
