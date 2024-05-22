
package stackdizi;

/**
 *
 * @author Excalibur
 */
public class StackDizi {

    int kapasite;
    int []s;
    int ust;
    
    public StackDizi(int kapasite){
        this.kapasite=kapasite;
        s=new int [kapasite];
        ust=-1;
    }
    
    boolean dolumu(){
        if(ust==kapasite-1){
            return true;
        }
        else return false;
        
    }
    
    boolean bosmu(){
        return ust==-1;
    }
    
    void push (int x){
        if(!dolumu()){
            ust=ust+1;
            s[ust]=x;
            System.out.println(x);
        }
    }

    int pop(){
        if(!bosmu()){
            ust=ust-1;
            System.out.println(s[ust+1]);
            return s[ust+1];
        }
        return -1;
    }
    public static void main(String[] args) {

        int size=5;
        StackDizi s=new StackDizi(size);
        System.out.println("yıgına elemaan eklenir: ");
        s.push(10);
        s.push(13);
        s.push(5);
        s.push(8);
        s.push(5);
        
        System.out.println("yıgından eleman cikariyoruz");
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    
    }
    
}
