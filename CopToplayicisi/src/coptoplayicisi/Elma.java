
package coptoplayicisi;


public class Elma {
    
    int i=0;
    Elma(int i){
        this.i=i;
        System.out.println("elma nesnesi olusturuluyor : "+i);
    }
    
    public void finalize(){
        System.out.println("elma nesnesi yok ediliyor : "+i);
    }
    
    
}
