import java.util.Scanner;

public class JumlahDigit {
    
    // Metode 
    public static int sumDigits(long n) {
        int sum = 0;
        n = Math.abs(n); 

        while (n != 0) {
            sum += n % 10; 
            n /= 10;       
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        long angka = input.nextLong();

        int jumlah = sumDigits(angka);
        System.out.println("Jumlah semua digit adalah: " + jumlah);

        input.close();
    }
}
