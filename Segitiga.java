class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luas() {
        return 0.5f * alas * tinggi;
    }

    public float keliling() {
        float sisiMiring = (alas*alas) + (tinggi*tinggi);
        sisiMiring = (float) Math.sqrt(sisiMiring);
        return sisiMiring * 2 + alas;
    }
}