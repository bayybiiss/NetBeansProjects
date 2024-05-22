/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
public class javaapplication14 {

   int oyNo;
   String isim;
   static String farklılıkAdı="Matematik";
   javaapplication14(int oyNo,String isim){
       this.oyNo=oyNo;
       this.isim=isim;
   }
   
  void bilgileriGoster() {
        System.out.println(oyNo+" "+isim+" "+farklılıkAdı);
    }


class testjavaapplication14{
   public  void main(String[]args){
        javaapplication14 nesne1=new javaapplication14(111,"serpil");
    javaapplication14 nesne2=new javaapplication14(112,"aslan");
              
               bilgileriGoster();
                 
    }

}
}