
package ciftyonlubagliliste;

/**
 *
 * @author Excalibur
 */
public class CiftYonluBagliListe {

    Node bas;
    Node son;
    
    public CiftYonluBagliListe(){
        bas=null;
        son=null;
    }
    
    public void basaEkle(Node yeni){
        if(bas==null){
            bas=yeni;
            son=yeni;
        }
        else{
            yeni.next=bas;
            bas.prev=yeni;
            bas=yeni;
        }
    }
    
    public void sonaEkle(Node yeni){
        if(bas==null){
            bas=yeni;
            son=yeni;
        }
        else{
            yeni.prev=son;
            son.next=yeni;
            son=yeni;
        }
    }
    
    public void bastanSil(){
        if(bas.next==null){
            son=null;
        }
        else{
            bas.next.prev=null;
            bas=bas.next;
        }
    }
    
    public void sondanSil(){
        if(son.prev==null){
            bas=null;
        }
        else{
            son.prev.next=null;
            son=son.prev;
        }
    }
    
    public void arayaEkle(int nereye,Node eklencekSayi){
        Node yedek=bas;
        while(yedek.veri!=nereye){
            yedek=yedek.next;
            if(yedek==null){
                System.out.println("Hic eleman yok");
            }
        }
    if(yedek==son){
        eklencekSayi.next=null;
        son=eklencekSayi;
    }
    else{
        eklencekSayi.next=yedek.next;
        yedek.next.prev=eklencekSayi;
    }
    eklencekSayi.prev=yedek;
    yedek.next=eklencekSayi;
    }
    
    public void girilenSil(int aranan){
        Node gecici=bas;
        while(gecici.veri!=aranan){
            gecici=gecici.next;
            if(gecici==null){
                System.out.println("bos");
            }
        }
        if(gecici==bas){
            bas=gecici.next;
        }
        else{
            gecici.prev.next=gecici.next;
        }
    }
    
    String listele(){
        Node yedek=bas;
        String liste="";
        while(yedek!=null){
            liste=liste+yedek.veri+"-->";
            yedek=yedek.next;
        }
        return liste;
    }
    
    public static void main(String[] args) {
    CiftYonluBagliListe liste=new CiftYonluBagliListe();
    Node yeni=new Node(5);
    liste.basaEkle(yeni);
    yeni=new Node(6);
    liste.sonaEkle(yeni);
    yeni=new Node(12);
    liste.sonaEkle(yeni);
    liste.girilenSil(5);
        System.out.println(liste.listele());
    
    }
    
}
