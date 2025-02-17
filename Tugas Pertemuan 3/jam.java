//Menentukan lama bekerja seseorang berdasarkan jam masuk dan jam keluar dengan  asumsi jam hanya 1 sampai dengan 12 dan lama bekerja seorang pegawai kurang dari  12 jam. 

import java.util.Scanner;

public class jam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jam masuk (1-12): ");
        int jamMasuk = scanner.nextInt();
        System.out.print("Masukkan jam keluar (1-12): ");
        int jamKeluar = scanner.nextInt();

        int lamaBekerja;
        if (jamKeluar >= jamMasuk) {
            lamaBekerja = jamKeluar - jamMasuk;
        } else {
            lamaBekerja = (12 - jamMasuk) + jamKeluar;
        }

        System.out.println("Lama bekerja: " + lamaBekerja + " jam");
    }
}
