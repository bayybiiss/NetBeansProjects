import java.util.Scanner;
import java.util.Random;


public class odev2soru4 {
   public static void main(String[] args) {
       int navigasyon[][]={{1,1,0,0,0},{0,1,1,0,0},{0,0,1,1,0},{0,0,0,1,1}};
       for (int i=0;i<4;i++){
           for(int j=0;j<5;j++){
               System.out.print(navigasyon[i][j]+"  ");
           }
           System.out.println(" ");
       }
       System.out.println(" ");
       yolBul(navigasyon);
   }
   public static void yolBul(int[][] navigasyon){
       for (int i=0;i<4;i++) {
           for (int j = 0; j < 5; j++) {
               if (1==navigasyon[i][j]) {
                   System.out.print(i);
                   System.out.print(j+" ");
               }
           }
       }
   }
}
