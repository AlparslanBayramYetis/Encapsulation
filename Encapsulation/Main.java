package Encapsulation;

public class Main {
    //encapsulation private yapmamız demek
public static void main(String[] args) {

   // Abone abone = new Abone();
    GelismisAbone abone = new GelismisAbone("Alp",20 ,"Aydın");

    //Abone.java daki herhangi bir değeri değiştirdiğimizde bütün hepsine tek tek girip değiştirmemiz gerekecekti
    //eğer projemiz çok fazla büyürse bu bize çok sıkıntı çıkarır.

    /*
     abone.isim = "Alparslan Bayram Yetiş";
    abone.bakiye = 200;//Public yaptığımız için böyle rastgele bir değer veremiyecektik
    abone.sehir= "Aydın";
    */
    //Bunlardan herhangi bir tanesine değer vermeseydik hatalı çalışırdı
    // eğer encapsulation yapsaydık unutamazdık


    abone.Bakiyeogren();
    abone.DogalgazKullan(200);

}


}
