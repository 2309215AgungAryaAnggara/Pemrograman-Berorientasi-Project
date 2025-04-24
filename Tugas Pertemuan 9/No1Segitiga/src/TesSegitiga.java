import java.util.Scanner;

public class TesSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi1: ");
        double sisi1 = input.nextDouble();

        System.out.print("Masukkan sisi2: ");
        double sisi2 = input.nextDouble();

        System.out.print("Masukkan sisi3: ");
        double sisi3 = input.nextDouble();

        System.out.print("Masukkan warna: ");
        String warna = input.next();

        System.out.print("Apakah segitiga terisi? (true/false): ");
        boolean terisi = input.nextBoolean();

        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
        segitiga.setWarna(warna);
        segitiga.setTerisi(terisi);

        System.out.println("\n" + segitiga.toString());
        System.out.println("Luas: " + segitiga.getLuas());
        System.out.println("Keliling: " + segitiga.getKeliling());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Terisi: " + segitiga.isTerisi());
    }
}
