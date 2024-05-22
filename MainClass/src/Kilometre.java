
public class Kilometre extends otomobil {
    private int km;
    
    public Kilometre(){
        
    }
    public Kilometre(int km){
        super();
        this.km=km;
    }
            
    public Kilometre(int motorgucu,String renk,int km){
        super(motorgucu,renk);
        this.km=km;
    }
    
    public String vitesTuru(){
        return "manuel";
    }
    public int getKm(){
        return km;
    }
    public void setKm(int km){
        this.km=km;
    }
    
}
