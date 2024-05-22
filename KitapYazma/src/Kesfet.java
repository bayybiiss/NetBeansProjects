import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Kesfet extends AnaSayfa{

    public void searchBook(ArrayList<String>kitapAdi){
       // kitapListe2.addAll(kitapAdi);

        Scanner keyboard = new Scanner(System.in);

        int cevap=0;
        System.out.println("***  GÖZ AT ETİKETLERİ  *****");
        System.out.println("Klasik");
        System.out.println(kitapAdi.get(4)); //"Yaban  -  Yakup Kadri Karaosmanoğlu"
        System.out.println("oku:");
        cevap = keyboard.nextInt();
        if(cevap ==1){
            try
            {Scanner s = new Scanner(new File("C:/Users/Asus/Desktop/EBook/"+kitapAdi.get(4)+".txt"));
                while(s.hasNextLine())
                {System.out.println(s.nextLine());}
                s.close();}

            catch(IOException e)
            {
                System.out.println(e);
            }}
        System.out.println(kitapAdi.get(6)); //Aşk-ı Memnu  -  Halit Ziya Uşaklıgil
        System.out.println("oku:");
        cevap = keyboard.nextInt();
        if(cevap ==1){
            try
            {Scanner s = new Scanner(new File("C:/Users/Asus/Desktop/EBook/"+kitapAdi.get(6)+".txt"));
                while(s.hasNextLine())
                {System.out.println(s.nextLine());}
                s.close();}
            catch(IOException e)
            {
                System.out.println(e);
            }}
        System.out.println("Romantik");
        System.out.println(kitapAdi.get(2));//"Gökyüzünde  -  İlyas Demir"
        System.out.println("oku:");
        cevap = keyboard.nextInt();
        if(cevap ==1){
            try
            {Scanner s = new Scanner(new File("C:/Users/Asus/Desktop/EBook/"+kitapAdi.get(2)+".txt"));
                while(s.hasNextLine())
                {System.out.println(s.nextLine());}
                s.close();}
            catch(IOException e)
            {
                System.out.println(e);
            }}
        System.out.println(kitapAdi.get(7));//"Mahfi Başlangıç  -  Derin Tok"
        System.out.println("oku:");
        cevap = keyboard.nextInt();
        if(cevap ==1){
            try
            {Scanner s = new Scanner(new File("C:/Users/Asus/Desktop/EBook/"+kitapAdi.get(7)+".txt"));
                while(s.hasNextLine())
                {System.out.println(s.nextLine());}
                s.close();}
            catch(IOException e)
            {
                System.out.println(e);
            }}
        System.out.println("Macera");
        System.out.println(kitapAdi.get(3));//"Hacker  -  Melis Sude Özbay"
        System.out.println("oku:");
        cevap = keyboard.nextInt();
        if(cevap ==1){
            try
            {Scanner s = new Scanner(new File("C:/Users/Asus/Desktop/EBook/"+kitapAdi.get(3)+".txt"));
                while(s.hasNextLine())
                {System.out.println(s.nextLine());}
                s.close();}
            catch(IOException e)
            {
                System.out.println(e);
            }}
        System.out.println(kitapAdi.get(1));//"Anka Arslan  -  İlayda Gök"
        System.out.println("oku:");
        cevap = keyboard.nextInt();
        if(cevap ==1){
            try
            {Scanner s = new Scanner(new File("C:/Users/Asus/Desktop/EBook/"+kitapAdi.get(1)+".txt"));
                while(s.hasNextLine())
                {System.out.println(s.nextLine());}
                s.close();}
            catch(IOException e)
            {
                System.out.println(e);
            }}
        System.out.println("Fantastik");
        System.out.println(kitapAdi.get(0));//"İçimizdeki Şeytan  -  Sebahattin Ali"
        System.out.println("oku:");
        cevap = keyboard.nextInt();
        if(cevap ==1){
            try
            {Scanner s = new Scanner(new File("C:/Users/Asus/Desktop/EBook/"+kitapAdi.get(0)+".txt"));
                while(s.hasNextLine())
                {System.out.println(s.nextLine());}
                s.close();}
            catch(IOException e)
            {
                System.out.println(e);
            }}
        System.out.println(kitapAdi.get(5));//Aden Uyanış  -  Bahadır Özsoy""
        System.out.println("oku:");
        cevap = keyboard.nextInt();
        if(cevap ==1){
            try
            {Scanner s = new Scanner(new File("C:/Users/Asus/Desktop/EBook/"+kitapAdi.get(5)+".txt"));
                while(s.hasNextLine())
                {System.out.println(s.nextLine());}
                s.close();}
            catch(IOException e)
            {
                System.out.println(e);
            }}
    }}

