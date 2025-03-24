import java.util.Random;

class StopWatch {
  private long waktuMulai;
    private long waktuAkhir;

    public StopWatch() {
        this.waktuMulai = System.currentTimeMillis();
    }

    public void mulai() {
        this.waktuMulai = System.currentTimeMillis();
    }

    public void berhenti() {
        this.waktuAkhir = System.currentTimeMillis();
    }

    public long getWaktuBerjalan() {
        return waktuAkhir - waktuMulai;
    }

    public long getWaktuMulai() {
        return waktuMulai;
    }

    public long getWaktuAkhir() {
        return waktuAkhir;
    }  
}

public class StopWatchTest {
    public static void main(String[] args) {
        int ukuran = 100000;
        int[] angka = new int[ukuran];
        Random random = new Random();

        // Mengisi array dengan angka acak
        for (int i = 0; i < ukuran; i++) {
            angka[i] = random.nextInt(100000); // Angka acak antara 0 dan 99999
        }

        // Membuat objek stopwatch
        StopWatch stopwatch = new StopWatch();

        // Memulai stopwatch sebelum pengurutan dimulai
        stopwatch.mulai();

        // Melakukan pengurutan dengan selection sort
        selectionSort(angka);

        // Menghentikan stopwatch setelah pengurutan selesai
        stopwatch.berhenti();

        // Menampilkan waktu eksekusi
        System.out.println("Waktu yang diperlukan untuk mengurutkan: " + stopwatch.getWaktuBerjalan() + " milidetik");
    }
    
    // Metode selection sort
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int indeksMin = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[indeksMin]) {
                    indeksMin = j;
                }
            }
            // Menukar elemen
            int temp = array[i];
            array[i] = array[indeksMin];
            array[indeksMin] = temp;
        }
    }
}
