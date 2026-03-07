abstract class Kendaraan{
    private String merk;
    private int kecepatan;

    public Kendaraan(String merk, int kecepatan){
        this.merk = merk;
        this.kecepatan = kecepatan;
    }

    public String getMerk(){
        return merk;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }

    void tampilInfo(){
        System.out.println("Merk : " + merk);
        System.out.println("Kecepatan : " + kecepatan);
    }

    abstract void bergerak();
}

class Mobil extends Kendaraan{
    public Mobil(String merk, int kecepatan){
        super(merk, kecepatan);
    }

    @Override
    void bergerak(){
        System.out.println(getMerk() + " sedang melaju di jalan");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 50);

        mobil.tampilInfo();

        System.out.println("Mengubah dengan setter: ");
        mobil.setKecepatan(100);
        mobil.tampilInfo();
    }
}

