import java.util.Scanner;

public class HitungBilanganGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();

        int jumlahGanjil = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                jumlahGanjil++;
            }
        }
        System.out.println("Jumlah bilangan ganjil antara " + batasAwal + " dan " + batasAkhir + " adalah: " + jumlahGanjil);
        input.close();
    }
}
