
package javaapplication29;

//dizinin en büyük elemanını veren kod
public class JavaApplication29 {

    public static void main(String[] args) {
int dizi[]={
  1,2,3,-1,99,4  
};
    int i=0;
    int sayi=dizi[0];
    
    while(i<6){
        if(dizi[i]>sayi)
            sayi=dizi[i];
        i++;
    }
        System.out.println("sayi="+sayi);
            
    }
    
}
