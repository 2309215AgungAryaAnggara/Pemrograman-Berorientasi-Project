import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner isi = new Scanner(System.in);

        System.out.println("Masukkan jumlah uang (dalam rupiah): ");
        int uang = isi.nextInt();

        System.out.println("Apakah hari ini hujan? (true/false): ");
        boolean hujan = isi.nextBoolean();

        if (uang > 5000 && !hujan) {
            System.out.println("Anda akan keluar membeli gorengan!");
        } else {
            System.out.println("Anda tidak akan keluar membeli gorengan.");
        }

        isi.close();
    }
}
