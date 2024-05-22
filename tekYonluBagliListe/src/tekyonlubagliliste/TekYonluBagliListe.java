
package tekyonlubagliliste;

/**
 *
 * @author Excalibur
 */
public class TekYonluBagliListe {

    Dugum bas;
    Dugum son;
    
    public TekYonluBagliListe(){
        bas=null;
        son=null;
    }
    public void basaEkle(Dugum yeni){
        if(bas==null){
            bas=yeni;
            son=yeni;
        }
        else{
            yeni.ileri=bas;
            bas=yeni;
        }
    }
    public void sonaEkle(Dugum yeni){
        if(bas==null){
            bas=yeni;
            son=yeni;
        }
        else{
            son.ileri=yeni;
            son=yeni;
        }
    }
    public void bastanSil(){
        bas=bas.ileri;
        if(bas==null){
            son=null;
        }  
    }
    public void sondanSil(){
        Dugum gecici=bas;
        Dugum once=null;
        while(gecici!=son){
            once=gecici;
            gecici=gecici.ileri;
        }
        if(once==null){
            bas=null;
        }
        else{
            once.ileri=null;
            son=once;
        }
      
    }
    String listele(){
        Dugum yedek=bas;
        String liste ="";
        while(yedek!=null){
            liste=liste+yedek.sayi+"--->";
            yedek=yedek.ileri;
        }
        return liste;
    }
            
    
    public static void main(String[] args) {

        
        TekYonluBagliListe liste=new TekYonluBagliListe();
        Dugum a=new Dugum(5);
        liste.basaEkle(a);
        a=new Dugum(6);
        liste.basaEkle(a);
        a=new Dugum(9);
        liste.sonaEkle(a);
        liste.bastanSil();
        liste.sondanSil();
        System.out.println(liste.listele());
    
    
    }
    
}
