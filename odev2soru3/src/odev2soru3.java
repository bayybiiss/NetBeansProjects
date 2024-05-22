import java.util.Random;


public class odev2soru3 {

  

   
    public static void main(String[] args) {
        diziOlustur();
        
    }
    
    public static char[] diziOlustur(){
        
        
         Random r=new Random();
        
         
         char[] options={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','y','z'};
        
        char [] dizi=new char[100];
       
        for(int i=0; i<dizi.length;i++){
            dizi[i]=options[r.nextInt(options.length)];
        
        }
          System.out.println(dizi);
          
          
          System.out.println("=========================dizinin 25li olarak ayrılması====================================");
                   
          
          for(int z=0;z<25;z++){
              System.out.print(dizi[z]+" ");
          }
          System.out.println("");
          
         for(int a=25;a<50;a++){
             System.out.print(dizi[a]+" ");
         }
         
         System.out.println("");
         
         for(int b=50; b<75;b++){
             System.out.print(dizi[b]+" ");
         }
         System.out.println("");
          
         for(int c=75;c<100;c++){
             System.out.print(dizi[c]+" ");
         }
         System.out.println("");
          System.out.println("=========================dizinin icindeki karakterlerin adedi====================================");
          
          
       
          for(int j=0;j<options.length;j++){
          int tane=0;
          for(int i=0; i<dizi.length; i++){
          if(options[j]==dizi[i]){
            ++tane;
        }
    }
            System.out.println(options[j]+"\tmetin içinde\t"+ tane+"\ttanedir");  
          
        
        }


          
          
          System.out.println("===================karakterleri ve sayilarini 10lu verme=========================");
          
          
          
                for(int j=0;j<10;j++){
                int tane=0;
                for(int i=0; i<dizi.length; i++){
                if(options[j]==dizi[i]){
                 ++tane;
             }
         }
                    System.out.print(" "+options[j]+" "+tane+"\t");
                    
                }
                System.out.println("");
               
                for(int j=10;j<20;j++){
                int tane=0;
                for(int i=0; i<dizi.length; i++){
                if(options[j]==dizi[i]){
                 ++tane;
              }
          }
                    System.out.print(" "+options[j]+" "+tane+"\t");
         
                }
                 System.out.println("");
                
                for(int j=20;j<options.length;j++){
                int tane=0;
                for(int i=0; i<dizi.length; i++){
                if(options[j]==dizi[i]){
                 ++tane;
             }
          }
                    System.out.print(" "+options[j]+" "+tane+"\t");
         
                }
                
                
          
        return null;
    
}
}
