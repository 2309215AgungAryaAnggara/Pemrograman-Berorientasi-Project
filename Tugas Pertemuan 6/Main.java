class Segitiga {
    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga() {
        this.alas = 0;
        this.tinggi = 0;
        this.sisi = 0;
    }

    public Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        this.alas = alasBaru;
        this.tinggi = tinggiBaru;
        this.sisi = sisiBaru;
    }

    public double getLuas() {
        return (alas * tinggi) / 2;
    }

    public double getKeliling() {
        return alas + (2 * sisi);
    }

    public void setAlas(double alasBaru) {
        this.alas = alasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }

    public void setSisi(double sisiBaru) {
        this.sisi = sisiBaru;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getSisi() {
        return sisi;
    }
}

public class Main {
    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga(1, 1, 1);
        Segitiga segitiga2 = new Segitiga(30, 10, 90);
        Segitiga segitiga3 = new Segitiga(20, 30, 60);

        System.out.println("Segitiga 1:");
        System.out.println("Luas: " + segitiga1.getLuas());
        System.out.println("Keliling: " + segitiga1.getKeliling());
        System.out.println();

        System.out.println("Segitiga 2:");
        System.out.println("Luas: " + segitiga2.getLuas());
        System.out.println("Keliling: " + segitiga2.getKeliling());
        System.out.println();

        System.out.println("Segitiga 3:");
        System.out.println("Luas: " + segitiga3.getLuas());
        System.out.println("Keliling: " + segitiga3.getKeliling());
    }
}
