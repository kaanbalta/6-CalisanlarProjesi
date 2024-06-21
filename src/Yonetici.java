public class Yonetici extends Calisan{

    private int sorumluKisisayısı;
    public Yonetici(String ad, String soyad, int id,int sorumluKisisayısı) {
        super(ad, soyad, id);
        this.sorumluKisisayısı = sorumluKisisayısı;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Sorumlu kişi sayısı : " + sorumluKisisayısı);
    }
    public void zamYap(int miktar){
        System.out.println(getAd() + " çalışanlara " + miktar + " kaar zam yapıyor");
    }

}
