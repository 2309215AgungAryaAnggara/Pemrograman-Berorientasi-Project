import java.util.Scanner;

public class FaktorialFP {
    public static int hitungFaktorial(int n) {
        int hasil = 1;
        for (int i = n; i > 0; i--) {
            hasil *= i;
        }
        return hasil;
    }

    public static void cetakFaktorial(int n) {
        System.out.print(n + "! = ");
        for (int i = n; i > 0; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + hitungFaktorial(n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        
        if (n >= 0) {
            cetakFaktorial(n);
        } else {
            System.out.println("Input tidak valid. Masukkan bilangan >= 0.");
        }
        
        scanner.close();
    }
}
