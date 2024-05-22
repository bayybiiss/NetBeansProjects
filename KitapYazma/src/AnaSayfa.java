

import java.util.ArrayList;
import java.util.Scanner;

public class AnaSayfa {


    Scanner keyboard = new Scanner(System.in);

    ArrayList<String> kitapListe = new ArrayList<>();
    ArrayList<String> kitapAdi = new ArrayList<>();
    int cevap;
    public void start() {
        kitapAdi.add("İçimizdeki Şeytan  -  Sebahattin Ali"); 
        kitapAdi.add("Anka Arslan  -  İlayda Gök"); 
        kitapAdi.add("Gökyüzünde  -  İlyas Demir");
        kitapAdi.add("Hacker  -  Melis Sude Özbay");
        kitapAdi.add("Yaban  -  Yakup Kadri Karaosmanoğlu");
        kitapAdi.add("Aden Uyanış  -  Bahadır Özsoy");
        kitapAdi.add("Aşk-ı Memnu  -  Halit Ziya Uşaklıgil");
        kitapAdi.add("Mahfi Başlangıç  -  Derin Tok");
        for ( int i=0 ; i< kitapListe.size() ; i++){
            int temp =0;
            System.out.println(kitapAdi.get(i));
            System.out.println("Kutuphaneye ekle ?");
            cevap =keyboard.nextInt(); // Kütüphaneye eklenecek kitaplar konsoldan 1 ve 0 değerleriyle belirlenir
            if(cevap == 1){
                temp ++;
                kitapListe.add(kitapAdi.get(i));  // Girilen deper 1 ise kitap kütüphaneye eklenilir. 1 = buton olacak şekilde
                // arayüz yapılacaktır.
            }
        }

        listBook(kitapListe);
        searchBook(kitapListe);
    }

    public void listBook(ArrayList<String> kitapListe) {

    }
    public void searchBook(ArrayList<String> kitapListe){

    }}
