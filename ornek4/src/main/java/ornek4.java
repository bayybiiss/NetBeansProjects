import java.util.Scanner;

public class ornek4 {
    public static void main(String[] args) {
int sayi ;


     Scanner bas = new Scanner (System.in);

System.out.println("Kaç Basamaklı Olsun:");

    sayi =bas.nextInt();

      for (int i = sayi; i >=0; i--){

        for (int k =0; k <= sayi -i; k++) {

     System.out.print(" ");}

      for (int j =0; j <2*i-1; j++){

     System.out.print("*");}

     System.out.print("\n");}

         }

    }
