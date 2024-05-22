
public class insan {
    int tckimlikno;
    int yas;
    String isim;


    public insan(long tckimlikno){

        this.tckimlikno = (int) tckimlikno;
        System.out.println(tckimlikno);
    }
    public insan(String isim,int yas){
        this.isim = isim;
        this.yas = yas;
        System.out.println(isim +" "+yas);
    }
}
