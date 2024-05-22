
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Kutuphane extends AnaSayfa{

    @Override
    public void listBook(ArrayList<String> kitapListe1) {
        Scanner keyboard = new Scanner(System.in,"ISO-8859-9");
        kitapListe1.addAll(kitapListe);
        System.out.println("kutuphanedeki kitaplar :\n"+kitapListe1 +"\n");
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =0; i<kitapListe1.size();i++){
            System.out.println(kitapListe1.get(i));
            System.out.println("Kitap sil");
            cevap= keyboard.nextInt();
            if(cevap ==1){  //Cevap =1 olduğunda kitap silinecektir

                // String path = "C:/Users/senaa/Desktop/deneme/kitap_adi.txt";

                File dosya = new File("C:/Users/Asus/Desktop/EBook/");
                if(dosya.delete())
                    System.out.println("Dosya silinmiştir.");
            }

                System.out.println("Oku : ");
                cevap= keyboard.nextInt();
                if (cevap==1){   // cevap =1 olduğunda kitap okumak için showBook a gönderilir.
                    showBook(kitapListe1.get(i)); break;
                }
            }}

    private void showBook(String kitap) {
        try
        {
            Scanner s = new Scanner(new File("C:/Users/Asus/Desktop/EBook/"+kitap+".txt"));
            while(s.hasNextLine())
            {
                System.out.println(s.nextLine());
            }
            s.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }}
