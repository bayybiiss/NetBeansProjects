/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ozyineleme;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class Ozyineleme {

    static int toplam(int sayi){
        if(sayi==1){
            return 1;
        }
        return sayi+ toplam(sayi-1);
    }
    public static void main(String[] args) {
        System.out.println("sayinizi girin");
        Scanner klavye= new Scanner(System.in);
        int sayi=klavye.nextInt();
        System.out.println("girdiğiniz sayiya kadar olan tüm sayilarin toplami ");
        System.out.println(toplam(sayi));
    }
    
}
