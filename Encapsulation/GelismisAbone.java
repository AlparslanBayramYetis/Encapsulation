package Encapsulation;

public class GelismisAbone {
    private String isim;
    private int bakiye = 120 ;
    private String Sehir;

    GelismisAbone(String isim, int bakiye, String Sehir) {
        this.isim = isim;
        if(bakiye <=120 && bakiye >=0) {
            this.bakiye = bakiye;
        }
        this.Sehir = Sehir;
    }
    void DogalgazKullan(int miktar){
        if(bakiye - miktar < 0){
            System.out.println("Yeterli bakiyeniz yok");
        }
        else{
            bakiye -= miktar;

            if(this.bakiye == 0){
                System.out.println("Bakiyenizin tamamını kullandınız");

            }
            else {
                System.out.println("Yeni bakiye " + bakiye);
            }
        }
    }
    void Bakiyeogren(){
        System.out.println("Bakiyeniz " +bakiye);
    }
}
