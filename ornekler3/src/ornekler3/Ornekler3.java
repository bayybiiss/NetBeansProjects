
package ornekler3;


public class Ornekler3 {

   
    
    static void basamakBul(int randomSayi){
        
     
        int sayac=0;
        while(randomSayi>0){
            randomSayi/=10;
            sayac++;
        }
        System.out.println("sayi "+sayac+" basamaklidir");
        
    }
    public static void main(String[] args) {

        int randomSayi=(int)(Math.random()*(1000));
        
        System.out.println("sayiniz="+randomSayi);
        
       basamakBul(randomSayi);
        
    }
    
}
