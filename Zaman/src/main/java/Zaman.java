
public class Zaman {
    
    int saat;
    int dakika;
    int saniye;
    
    /*
    
    her çağrıldığında nesneyi bir sonraki saniyeye götüreen program
    saniye 59,dakika59,saat ise 23 den büyük olamaz
    
    */
    
  void ilerle()
    {
        saniye++;
        if(saniye==60){
            saniye=0;
            dakika++;
            
            if(dakika==60){
                dakika=0;
                saat++;
                
                if(saat==24){
                    saat=0;
                    
                }
            }
        }
        
        
        
    }
  
void zamaniYaz(){
    System.out.println("Zaman="+saat+":"+dakika+":"+saniye);
}
}
