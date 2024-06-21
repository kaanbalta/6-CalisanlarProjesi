public class Yazlimci extends Calisan{

    private String diller;
    public Yazlimci(String ad, String soyad, int id,String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    }

    public void formatAt(String isletimSistemi){
        System.out.println(getAd() + isletimSistemi + " u yüklüyor");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Bildiği diller : " + diller);
    }
}
