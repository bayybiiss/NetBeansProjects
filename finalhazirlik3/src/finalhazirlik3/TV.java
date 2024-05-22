
package finalhazirlik3;


public class TV {
    int kanal=1;
    int ses=1;
    boolean ac=false;
    
    
    public TV(){
        
    }
    
    public void ac(){
        ac=true;
    }
    public void kapat(){
        ac=false;
    }
    public void kanalAyarla(int yenikanal){
        if(ac && yenikanal>=1 && yenikanal<=120){
            kanal=yenikanal;
        }
    }
    
    public void sesAyarla(int yenises){
        if(ac && yenises>=1 && yenises<=7){
            ses=yenises;
        }
    }
    public void kanalArttirma(){
 
        if(ac && kanal<120){
        kanal++;
    }
}
    public void kanalAzaltma(){
        if(ac && kanal>1){
        kanal--;
        }
    }
    
    public void sesArttirma(){
        if(ac && ses<7){
            ses++;
        }
    }
    
    public void sesAzaltma(){
        if(ac && ses>1){
            ses--;
        }
    }
}
