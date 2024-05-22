import java.util.Random;
import java.util.Scanner;

public class son {

    private static String String;         
          public static void main(String [] args){
    
    Scanner klavye = new Scanner(System.in);
String kelimeler = null, hata = null;
String[] bos = {" * ", " * ", " * ", " * "};
int say = 0;
String[] kelime = {"bilgisayar", "program", "insan", "esma","bal"};
int d = 0;
     System.out.println("kelimenin harflerini tahmin ediniz");
Random rand = new Random();
        kelimeler = kelime[rand.nextInt(5)];
for(int i=0; i<bos.length; i++)
     {
         System.out.print("*");
     }
         System.out.println("");
         
for (int i = 0; i < bos.length; i++) {

System.out.print(bos[i]); }

for (int i = 0; i < 15; i++) {

if (say == kelimeler.length()) {

System.out.println("Tebrikler Kazandınız Kelime = " + kelimeler);

break;

} else {

System.out.println( " \ntahmininizi giriniz");

String a = klavye.next();

String /*toLowerCase*/ = a.toLowerCase();

for (int j = 0; j < 5; j++) {

if (a.charAt(0) == kelimeler.charAt(j)) {

System.out.println("girilen harf kelimede mevcuttur");

bos[j] = a;

d = 1;

say++;

}

}

if (d == 0) {

hata += a;

System.out.println("girilen harf kelimede mevcut degildir ");

} d = 0;

for (int k = 0; k < bos.length; k++) {

System.out.print(bos[k]); }

System.out.println("");

} }

if (say != kelimeler.length()) {

System.out.println("KAZANAMADINIZ. Kelime = " + kelimeler + " di.");

}

         
}
}
