
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
public class fibonaci {

     static int f(int n){
        if (n==1 || n==2){
            return 1;
        }
        return f(n-1)+f(n-2);
    }
    public static void main(String[] args) {

        Scanner klv=new Scanner(System.in); 
        int a;
        System.out.println("adim sayisini giriniz");
        a=klv.nextInt();
        
        for(int i=1; i<=a; i++){
            System.out.print(f(i)+" ");
        }
    }
    
}
