
package yigindugumu;

import java.util.Scanner;


public class Yigindugumu {

    int sayi;
    Yigindugumu sonraki;
    
    Yigindugumu (int sayi){
        this.sayi=sayi;
        sonraki=null;
    }

    public static void main(String[] args) {

        Yigin y= new Yigin();
        Scanner s =new Scanner(System.in);
        int secim,sayi;
            while (true){
                System.out.println("Yığın (Stack)\n");
                System.out.println("1-->elemanEkle(Push)\n");
                System.out.println("2-->elemanCikar(Pop)\n");
                System.out.println("3-->Listele(Display)\n");
                System.out.println("4-->Peek\n");
                System.out.println("5-->Exit\n");
                
                System.out.println("Seçiminizi yapiniz : \n");
                secim=s.nextInt();
                switch(secim){
                    case 1: System.out.println("eklenecek sayi \n");
                            sayi=s.nextInt();
                            y.Push(sayi);
                            break;
                    case 2:
                            y.Pop();
                        break;
                    case 3:
                            y.listele();
                        break;
                    case 4:
                            y.Peek();
                        break;
                    case 5:
                            System.out.println("programdan cikiliyor");
                        break;
                            
                }
            }
        
    }
    
}
