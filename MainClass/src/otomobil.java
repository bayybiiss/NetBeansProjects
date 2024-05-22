
public class otomobil {
    
    private int motorgucu;
    private String renk;
    
    
    public otomobil(){
        
    }
    public otomobil(int motorgucu,String renk){
        super();
        this.motorgucu=motorgucu;
        this.renk=renk;
    }
    
    public String yakitTuru(){
        
        return "benzin";
    }
    
    public String vitesTuru(){
        return "otomatik";
    }
    
    public int getMotorgucu(){
        return motorgucu;
    }
    public void setMotorgucu(int motorgucu){
        this.motorgucu=motorgucu;
    }
    public String getRenk(){
        return renk;
    }
    public void setRenk(String renk){
        this.renk=renk;
    }
    
    
}
