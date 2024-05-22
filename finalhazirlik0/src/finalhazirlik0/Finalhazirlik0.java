
package finalhazirlik0;

import java.util.Date;
import java.util.Random;

public class Finalhazirlik0 {


    public static void main(String[] args) {
       Date tarih= new Date();
        System.out.println("zaman : "+tarih.toString());
        System.out.println("zaman : "+tarih.getTime());
        
        
        Random r1= new Random();
        System.out.println("random sayiniz : "+r1.nextInt());
        Random r2 =new Random(3);
        System.out.println("sayiniz : "+r2.nextInt());
        
        
        Kahve kh=Kahve.siparisGarson(5);
        
    }
    
}
