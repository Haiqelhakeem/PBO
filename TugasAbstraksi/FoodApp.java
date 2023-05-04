package TugasAbstraksi;

public class FoodApp {
    public static void main(String[] args) {
        Makanan m1 = new AyamGoreng("Nasi ayam goreng", 17000, 246, 1);
        Makanan m2 = new Rendang("Nasi Rendang", 22000, 450, 2);

        System.out.println(m1.infoMakanan());
        System.out.println(m1.jumlahKalori());
        System.out.println(m2.infoMakanan());
        System.out.println(m2.jumlahKalori());
    }
}
