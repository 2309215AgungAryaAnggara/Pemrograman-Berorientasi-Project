import java.util.Random;

public class NamaBulan {
    public static void main(String[] args) {
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        Random random = new Random();

        int nomorBulan = random.nextInt(12) + 1;

        System.out.println("Nomor bulan yang dihasilkan: " + nomorBulan);
        System.out.println("Nama bulan: " + namaBulan[nomorBulan - 1]);
    }
}
