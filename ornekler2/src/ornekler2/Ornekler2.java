
package ornekler2;
public class Ornekler2 {
  
    
    //c ile başlayan kelimeleri bulan kod
    
    
    
    static void harfBul(String cumle[],char harf){
     
        harf='c';
      
        for(int i=0;i<7;i++){
     if(cumle[i].charAt(0)==harf){
    
         System.out.println(cumle[i]+" c ile başlar");
          }
    }
    }
    public static void main(String[] args) {
        String cumle[]={
         "ceyda ","esma","beyza","ceylan","açıkgöz","cemile","merve"  
        };
    char harf;
      harf='c';
        harfBul(cumle,harf);
        
        
    }
    
}
