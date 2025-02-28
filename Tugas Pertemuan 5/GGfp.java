import java.util.Scanner;

public class GGfp {
    public static int hitungBilanganGanjil(int batasAwal, int batasAkhir) {
        int jumlahGanjil = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) { 
                jumlahGanjil++;
            }
        }
        return jumlahGanjil;
    }

    public static void cetakBilanganGanjil(int batasAwal, int batasAkhir) {
        System.out.print("Bilangan ganjil antara " + batasAwal + " dan " + batasAkhir + ": ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();
        
        cetakBilanganGanjil(batasAwal, batasAkhir);
        int jumlahGanjil = hitungBilanganGanjil(batasAwal, batasAkhir);
        System.out.println("Jumlah bilangan ganjil: " + jumlahGanjil);
        
        scanner.close();
    }
}
