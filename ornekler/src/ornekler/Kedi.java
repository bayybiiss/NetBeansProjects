/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornekler;

abstract class Kedi extends Hayvan{
    protected int ayakSayisi=4;
    public void yakalaAv(){
        System.out.println("Kedi sinifi av yakaladi");
    }
    public abstract void takipEt();
    
  
}
