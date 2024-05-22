
package yigindugumu;
import java.util.Scanner;
/**
 *
 * @author Excalibur
 */
public class Yigin {
    private Yigindugumu ust;
    public Yigin(){
        ust=null;
    }

    public boolean isEmpty()
    {
        if(ust==null)
            return true;
        else 
            return false;
    }
    
    public void Push(int eleman)
    {
        Yigindugumu x =new Yigindugumu(eleman);
        x.sonraki=ust;
        ust=x;
    }
    
    public void Pop(){
        if(isEmpty()){
            System.out.println("Stack bos");
        }
        Yigindugumu temp=ust;
        
        ust=ust.sonraki;
        System.out.println(temp.sayi+"yigindan cikarildi");
    }
    
    public void listele(){
        if(isEmpty()){
            System.out.println("Stack bos");
        }
        Yigindugumu temp=ust;
        while(temp.sonraki!=null){
            System.out.println(temp.sayi+"\n");
            temp=temp.sonraki;
        }
        System.out.println(temp.sayi+"\n");
    }
    
    public void Peek(){
        //yiginin ilk elelmanini döndür
        if(isEmpty()){
            
            System.out.println("stack bos");
        }
        System.out.println("\n yiginin en ustundeki degeri"+ust.sayi);
    }

}
