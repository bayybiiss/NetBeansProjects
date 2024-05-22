
public class Kullanıcı {
    String isim,mail;
    String KullanıcıAdı;
    String şifre,guvenlik;
    Kullanıcı(String isim ,String KullanıcıAdı,String mail,String şifre,String guvenlik)
    {   this.isim=isim;
        this.mail=mail;
        this.KullanıcıAdı=KullanıcıAdı;
        this.şifre=şifre;
        this.guvenlik = guvenlik;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getŞifre() {
        return şifre;
    }

    public void setŞifre(String şifre) {
        this.şifre = şifre;
    }

    public String getKullanıcıAdı() {
        return KullanıcıAdı;
    }

    public void setKullanıcıAdı(String kullanıcıAdı) {
        KullanıcıAdı = kullanıcıAdı;
    }

    public String getGuvenlik() {
        return guvenlik;
    }

    public void setGuvenlik(String guvenlik) {
        this.guvenlik = guvenlik;
    }
}

