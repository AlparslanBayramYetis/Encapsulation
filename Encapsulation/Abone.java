package Encapsulation;
//Doğalgaz abonesi
public class Abone {

    public String isim;
    public int bakiye;
    public String sehir;

    //genelde constructorlar kullanılmaz bu örneklerde

    void DogalgazKullan(int miktar){
        if(this.bakiye - miktar < 0){
            System.out.println("Yeterli bakiyeniz yok");
        }
        else{
            this.bakiye -= miktar;

            if(this.bakiye == 0){
                System.out.println("Bakiyenizin tamamını kullandınız");

            }
            else {
                System.out.println("Yeni bakiye " + bakiye);
            }
        }
    }
    void Bakiyeogren(){
        System.out.println("Bakiyeniz " + bakiye);
    }
}
