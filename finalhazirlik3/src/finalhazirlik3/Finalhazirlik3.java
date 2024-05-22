
package finalhazirlik3;


public class Finalhazirlik3 {


    public static void main(String[] args) {

        Cember1 c1=new Cember1();
        System.out.println("yaricapi: "+c1.yaricap+" olan cemberin alani: "+c1.alan());
        Cember1 c2=new Cember1(5.0);
        System.out.println("yaricapi "+c2.yaricap+" olan cemberin alani: " +c2.alan());
        c2.yaricap=4.0;
        System.out.println("yaricapi "+c2.yaricap+" olan cemberin alani: " +c2.alan());
        
        System.out.println("");
        System.out.println("++++++++  ikinci ornek   +++++++++++++++++");
        System.out.println("");
        
        TV tv1=new TV();
        tv1.ac();
        System.out.println("kanaliniz : "+tv1.kanal+" ses seviyeniz : "+tv1.ses);
        tv1.kanalAyarla(9);
        System.out.println("kanaliniz : "+tv1.kanal+" ses seviyeniz : "+tv1.ses);
        tv1.kanalArttirma();
        System.out.println("kanaliniz : "+tv1.kanal+" ses seviyeniz : "+tv1.ses);
        tv1.kanalArttirma();
        System.out.println("kanaliniz : "+tv1.kanal+" ses seviyeniz : "+tv1.ses);
        tv1.kanalAzaltma();
        System.out.println("kanaliniz : "+tv1.kanal+" ses seviyeniz : "+tv1.ses);
        tv1.sesArttirma();
        System.out.println("kanaliniz : "+tv1.kanal+" ses seviyeniz : "+tv1.ses);
        tv1.sesAyarla(6);
        System.out.println("kanaliniz : "+tv1.kanal+" ses seviyeniz : "+tv1.ses);
        tv1.sesAzaltma();
        
        System.out.println("kanaliniz : "+tv1.kanal+" ses seviyeniz : "+tv1.ses);
        
        
        
        
        
        
    }
    
}
