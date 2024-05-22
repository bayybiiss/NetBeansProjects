
import java.util.Random;
import java.util.Scanner;


public class mayintarlasi {

       public static void matrisUret(){
        
            Scanner klv=new Scanner (System.in);
           
           
        int a,b,i,j,puan=0;

Random r=new Random();
    

System.out.println("Oyun alaninizin buyuklugunu giriniz");
System.out.print("matrisinizin satir sayisi :");
a=klv.nextInt();
System.out.println();

System.out.print("matrisinizin sutun sayisi :");
b=klv.nextInt();
System.out.println();

int [][] mata=new int[a][b];


System.out.println("============================================");

for(i=0;i<a;i++){
for(j=0;j<b;j++){

mata[i][j]=r.nextInt(2);
   
}

}
          
        while (true){
 int satir,sutun;
  
      System.out.println("secmek istediginiz alanin satir ve sutun degerleri giriniz");
       satir=klv.nextInt();
       sutun=klv.nextInt();
           

            if (mata[satir][sutun] == 1){

                System.out.println("Oyun Bitti.Puanınız:"+puan);
                break;
            }
            else {
                System.out.println("Hala hayattasın...Devam");
                puan += 10;
            }
       }
        
        
        System.out.println("============================================");
System.out.println("oyun alaniniz ");
for(i=0;i<a;i++){
for(j=0;j<b;j++){

    System.out.print(mata[i][j]);
}
        System.out.println("");
}
        
       }
      
      public static void main(String[] args) {
       
     matrisUret();
    }
    
}
