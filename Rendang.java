package TugasAbstraksi;

public class Rendang extends Makanan {
    int kaloriPerPcs;
    int jumlahPerPorsi;

    public Rendang(String nama, int harga, int kaloriPerPcs, int jumlahPerPorsi){
        super(nama, harga);
        this.kaloriPerPcs = kaloriPerPcs;
        this.jumlahPerPorsi = jumlahPerPorsi;
    }

    @Override
    public String infoMakanan() {
        return "nama: " + nama + "\nharga: " + harga;
    }

    @Override
    public String jumlahKalori() {
        return "jumlah kalori: " + (kaloriPerPcs*jumlahPerPorsi);
    }
}
