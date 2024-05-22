
package dosyaıslemleri;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class DosyaIslemleri {

 
    public static void main(String[] args)throws FileNotFoundException {

        File dosya1=new File("C:\\Users\\Excalibur\\OneDrive\\Belgeler\\deneme1.txt");
        File dosya2=new File("C:\\Users\\Excalibur\\OneDrive\\Belgeler\\deneme2.txt");
        
            int satir1=0;
            String [] veriler1 = new String [25];
            int i=0;
            String veriler2 []=new String [20];
            int y=0;
            int satir2=0;
        if(dosya1.exists()&& dosya2.exists()){
            System.out.println("dosyalar var");
            
            Scanner oku1 = new Scanner(dosya1); 
            Scanner oku2 = new Scanner(dosya2); 
            
            while(oku1.hasNextLine()){
               // System.out.println(oku1.nextLine());
                veriler1[i]=oku1.nextLine();
                
                while(oku2.hasNextLine()){             
                   // System.out.println(oku2.nextLine());
                    veriler2[y]=oku2.nextLine();
                if(veriler1[i].equals(veriler2[y])){
                    String path="C:\\sonuc.txt";
                    File dd=new File(path);
                    try{
                        if(!dd.exists()){
                            dd.createNewFile();
                            System.out.println("yeni dosya yazildi");
                        }else {
                            System.out.println("dosya mevcut");
                        }
                    }catch(IOException e){
                        System.out.println(e.getMessage());
                    }
                }                   
                y++;    
            }
                i++;
                
            }
            
            System.out.println("satir1 : "+satir1);
        
       
        
        
        
        System.out.println("++++++++++++++++++++++++++++++++++++");
        
        
    //     File dosya2=new File("C:\\Users\\Excalibur\\OneDrive\\Belgeler\\deneme2.txt");
       // if(dosya2.exists()){
           // System.out.println("dosya var");
            
            
            
            
        
      //  for(i=0;i<satir1;i++){
            /*for(y=0;y<satir2;y++){
                if(veriler1[i]==veriler2[y]){
                    String path="C:\\sonuc.txt";
                    File dd=new File(path);
                    try{
                        if(!dd.exists()){
                            dd.createNewFile();
                        }else {
                            System.out.println("dosya mevcut");
                        }
                    }catch(IOException e){
                        System.out.println(e.getMessage());
                    }
                }
            }*/
     //   }
        
        
        
        
        }
        else{
            System.out.println("dosya yok");
        }
        
    }
        
       
        
        
    }
    

