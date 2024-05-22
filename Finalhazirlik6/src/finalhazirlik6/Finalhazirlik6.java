
package finalhazirlik6;


public class Finalhazirlik6 {

    public static int x;
    public int y;
    
    
    public static void ekranaBas(Finalhazirlik6 f){
        System.out.println("static degisken x : "+x +" static degisken y : "+f.y);
    }
    
    
    
    public static void main(String[] args) {
        Finalhazirlik6 f1=new Finalhazirlik6();
        f1.y=4;
        Finalhazirlik6 f2=new Finalhazirlik6();
        f2.y=8;
        x=7;
        ekranaBas(f1);
        ekranaBas(f2);
       
    }

    
}
