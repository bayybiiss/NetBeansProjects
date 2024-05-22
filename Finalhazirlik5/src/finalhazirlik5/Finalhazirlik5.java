package finalhazirlik5;


public class Finalhazirlik5 {

    int yumurta_sayisi=0;
    
    Finalhazirlik5 yumurtaKoy(){
        yumurta_sayisi++;
        return this;
    }
    
     void goster(){
            System.out.println("sepetteki yumurta sayiniz : "+yumurta_sayisi);
    }
    
    
    public static void main(String[] args) {
       
        Finalhazirlik5 fh5= new Finalhazirlik5();
        fh5.yumurtaKoy().yumurtaKoy().yumurtaKoy().goster();
        
        fh5.yumurtaKoy();
        fh5.goster();
        
    }
    
}
