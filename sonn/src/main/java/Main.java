import java.util.Random;
import java.util.Scanner;
public class Main {

    private static String String;
public static void main(String[] args) {
Scanner klavye = new Scanner(System.in);
String kelimeler = null, hata = null;
String[] bos = {" - ", " - ", " - ", " - "};
int say = 0;
String[] kelime = {"esma", "masa", "kurt", "mavi", "deri", "kedi"};
int d = 0;
Random t = new Random();
kelimeler = kelime[t.nextInt(6)];
    for (String bo : bos) {
        System.out.print(bo);}
System.out.println("");
for (int i = 0; i < 15; i++) {
if (say == kelimeler.length()) {
System.out.println("Tebrikler Kazandınız Kelime = " + kelimeler); break;
} else {
System.out.println( " tahmininizi giriniz");
String a = klavye.next();
String /*toLowerCase*/ = a.toLowerCase();
for (int j = 0; j < 4; j++) {
if (a.charAt(0) == kelimeler.charAt(j)) {
System.out.println("girilen harf kelimede mevcuttur " + a.charAt(0));
bos[j] = a;
d = 1;
say++;}}
if (d == 0) {
hata += a;
System.out.println("kelimede böyle bir harf mevcut degildir" + hata);
} d = 0;
    for (java.lang.String bo : bos) {
        System.out.print(bo);
    }
System.out.println("");
} }
if (say != kelimeler.length()) {
System.out.println("KAZANAMADINIZ. Kelime = " + kelimeler + " di.");}
}
}