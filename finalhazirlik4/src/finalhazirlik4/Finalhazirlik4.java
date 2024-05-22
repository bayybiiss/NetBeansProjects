/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalhazirlik4;

/**
 *
 * @author Excalibur
 */
public class Finalhazirlik4 {
int gun;

public void gunEkle(int gun){
    this.gun+=gun;
}
public void ekranaBas(){
    System.out.println("gun : "+gun);
}

    public static void main(String[] args) {

        Finalhazirlik4 fh4= new Finalhazirlik4();
        fh4.gunEkle(2);
        fh4.gunEkle(3);
        fh4.ekranaBas();
    
    }
    
}
