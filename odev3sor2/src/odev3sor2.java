
import java.util.Random;
import java.util.Scanner;


public class odev3sor2 {


    public static void main(String[] args) {

        Random rand = new Random();
        Scanner klavye = new Scanner(System.in);
        int[] sayi = new int[10];

        for (int i = 0; i < sayi.length; i++) {

            sayi[i] = rand.nextInt(10);
            System.out.print(sayi[i]+" ");
        }
        System.out.println();
        System.out.print("Degistirilcek pozisyon degeri giriniz:");
        int degisilcek = klavye.nextInt();
        Degis(sayi,degisilcek);
    
    }

    public static int Degis(int[] dizi,int pozisyon){
        Scanner klavye = new Scanner(System.in);

        while (true){

            for (int i = 0; i < dizi.length ; i++) {

                if (pozisyon == i){
                    dizi[i] = -1;
                }
            }
            System.out.println("Degistirilmis dizi:");

            for (int i = 0; i < dizi.length; i++) {
                System.out.print(dizi[i]+" ");
            }
            System.out.println();
            System.out.print("Tekrarlamak için:E Çıkmak için:H basınız:");
            String cevap = klavye.nextLine();

            if (cevap.equals("E") ){

                System.out.print("Desgistirmek istediginiz pozisyon degeri giriniz:");
                pozisyon = klavye.nextInt();
            }
            else{
                break;
            }

        }

        return dizi[pozisyon];
    }
    
}
