public class Main {
    public static void main(String[] args) {
        Sepatu sepatu = new Sepatu();
        sepatu.jenis = "Sport";
        sepatu.tahun = 1990;
        sepatu.ukuran = 39;
        sepatu.warna = "Biru";

        Sepatu sepatu1 = new Sepatu();
        sepatu1.jenis = "Skechers";
        sepatu1.tahun = 2023;
        sepatu1.ukuran = 30;
        sepatu1.warna = "Pink";

        sepatu.info();
        sepatu1.info();
    }
}