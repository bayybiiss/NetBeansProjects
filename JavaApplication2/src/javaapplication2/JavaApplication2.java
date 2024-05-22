/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        

        int dizi[]=new int[10];
        int ort=0, top=0,sayac=0, sayacc=0 ;
        int ortalama=0;
        int toplam=0;
      
        for(int i=0; i<=9;i++)
        {
        System.out.println("kontrol ediecek sayiyi giriniz:");
        
        Scanner klavye=new Scanner (System.in);
        dizi[i]=klavye.nextInt();
        if(dizi[i]%2==0)
        {
            top+=dizi[i];
            sayac++;
            ort=top/sayac;
           
        }
         
        else {
        toplam+=dizi[i];
            sayacc++;
            ortalama=toplam/sayacc;
            
        }
        }
        System.out.println("cift sayilarinizin ortalamasi"+ort);
        System.out.println("tek sayilarinizin ortalamasi"+ortalama);
    }
}
    
    

