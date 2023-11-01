public class Main {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(4.0f, 5.0f);
        Lingkaran lingkaran = new Lingkaran(14.0f);
        Segitiga segitiga = new Segitiga(3.0f, 5.0f);
        System.out.println("BANGUN DATAR");
        System.out.println("Luas PERSEGI PANJANG     : " + persegi.luas());
        System.out.println("Keliling PERSEGI PANJANG : " + persegi.keliling());
        System.out.println("Luas LINGKARAN           : " + lingkaran.luas());
        System.out.println("Keliling LINGKARAN       : " + lingkaran.keliling());
        System.out.println("Luas SEGITIGA            : " + segitiga.luas());
        System.out.println("Keliling SEGITIGA        : " + segitiga.keliling());
    }
}