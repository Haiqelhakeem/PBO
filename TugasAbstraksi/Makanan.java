package TugasAbstraksi;

public abstract class Makanan {
    String nama;
    int harga;

    public Makanan(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama(){
        return nama;
    }

    public int getHarga(){
        return harga;
    }

    public abstract String infoMakanan();
    public abstract String jumlahKalori();
}
