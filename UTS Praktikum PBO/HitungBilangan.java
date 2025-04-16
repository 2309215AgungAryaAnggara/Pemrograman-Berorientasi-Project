import java.util.Scanner;

public class HitungBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahPositif = 0;
        int jumlahNegatif = 0;
        double total = 0;
        int jumlahBilangan = 0;

        System.out.println("Masukan bilangan integer, program akan berhenti jika memasukan nilai 0:");

        while (true) {
            int angka = input.nextInt();

            if (angka == 0) {
                break;
            }

            if (angka > 0) {
                jumlahPositif++;
            } else {
                jumlahNegatif++;
            }

            total += angka;
            jumlahBilangan++;
        }

        if (jumlahBilangan == 0) {
            System.out.println("Tidak ada bilangan non-nol yang dimasukkan.");
        } else {
            double rataRata = total / jumlahBilangan;

            System.out.println("Jumlah bilangan positif adalah " + jumlahPositif);
            System.out.println("Jumlah bilangan negatif adalah " + jumlahNegatif);
            System.out.println("Nilai total adalah " + total);
            System.out.println("Nilai rata - rata " + rataRata);
        }

        input.close();
    }
}
