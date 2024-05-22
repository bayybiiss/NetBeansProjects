

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EBook {
    Kullanıcı Kullanıcı;
    AnaSayfa AnaSayfa;
    String isim,mail;
    String KullanıcıAdı;
    String şifre,guvenlik;
    int cevap;
    int istek;


    // KayıttlıKullanıcı KayıtlıKullanıcı;
    public void KullanıcıEkle() {
        Scanner keyboard = new Scanner(System.in);//"ISO-8859-9"
        System.out.println("kayıt olmak ister misiniz?");
        int istek = keyboard.nextInt();
        PrintWriter girdi = null;
        ArrayList<String> guvenlikSorusu = new ArrayList<>();
        guvenlikSorusu.add("İlk evcil hayvanınızın ismi nedir");
        guvenlikSorusu.add("En sevdiğiniz yemek");
        guvenlikSorusu.add("En sevdiğiniz spor");

        if (istek == 1) {
            System.out.println("REWSH 'e HOŞGELDİNİZ ");
            String bosluk = keyboard.nextLine();
            System.out.print("İsim : ");
            String isim = keyboard.nextLine();
            System.out.print("Kullanıcı adı : ");
            String KullanıcıAdı = keyboard.nextLine();
            System.out.print("E-posta : ");
            String mail = keyboard.nextLine();
            System.out.print("Şifre : ");
            String şifre = keyboard.nextLine();
            System.out.println("Güvenlik Sorusu seçiniz");
            System.out.println("1) İlk evcil hayvanınızın ismi nedir"); //0
            System.out.println("2) En sevdiğiniz yemek"); //1
            System.out.println("3) En sevdiğiniz spor"); //2
             cevap = keyboard.nextInt();
            String deneme1 = keyboard.nextLine();
            System.out.println("Cevabınız : ");
            String guvenlik = keyboard.nextLine();
            Kullanıcı = new Kullanıcı(isim, KullanıcıAdı, mail, şifre, guvenlik);
            File dosya = new File("C:\\Users\\Asus\\Desktop\\kullanıcı\\ " + KullanıcıAdı + ".txt");
            try {
                girdi = new PrintWriter(new FileOutputStream(dosya, true));
            } catch (FileNotFoundException ex) {
                System.out.println(KullanıcıAdı + ".txt dosyası oluşturulurken hata oldu");
                System.exit(0);
            }
            girdi.print(isim + "\n" + KullanıcıAdı + "\n" + mail + "\n" + şifre + "\n" + guvenlik);
            girdi.close();
            System.out.println("kayıt olma işlemi başarıyla tamamlandı");
            String guvenlik1;
            String kullanıcıAdı;
            String sifre;
            int cevap1 = 0;

            System.out.println("kayıtlı kullanıcı mısınız:");
            Scanner klavye = new Scanner(System.in);
            int kayıtlı = klavye.nextInt();
            String düzeltme = klavye.nextLine();
            if (kayıtlı == 1) {
                System.out.println("kullanıcı adını giriniz: ");
                kullanıcıAdı = klavye.nextLine();
                System.out.println("şifrenizi giriniz: ");
                sifre = klavye.nextLine();
                try {
                    Scanner s = new Scanner(new File("C:\\Users\\Asus\\Desktop\\kullanıcı\\ " + KullanıcıAdı + ".txt"));
                    while (s.hasNextLine()) {
                        System.out.println(s.nextLine());
                    }
                    //s.close();
                } catch (IOException e) {
                    System.out.println("hata:" + e);
                }
                if (kullanıcıAdı.equals(KullanıcıAdı) && şifre.equals(sifre)) {
                    System.out.println("başarılı giriş yaptınız.");
                } else {
                    System.out.println("kullanıcı adı veya şifreyi yanlış girdiniz.");
                    System.out.println("Şifreyi Sıfırla");
                    cevap1 = klavye.nextInt();
                    if (cevap1 == 1) {
                        System.out.println(guvenlikSorusu.get(cevap - 1));
                        String deneme = klavye.nextLine();
                        guvenlik1 = klavye.nextLine();
                        if (guvenlik1.equals(guvenlik)) {
                            guvenlik = guvenlik1;
                            System.out.print("Yeni şifrenizi giriniz : ");

                            şifre = klavye.nextLine();
                            System.out.println("Şifre sıfırlama başarılı");

                        }
                    } else {
                        System.out.println("Hatalı giriş");
                        sifre = klavye.nextLine();
                    }
                }
            }
        }



    }}


