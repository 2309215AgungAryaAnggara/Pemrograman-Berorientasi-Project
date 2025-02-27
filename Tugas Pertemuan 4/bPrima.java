import java.util.Scanner;

public class bPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int n = scanner.nextInt();
        
        for (int i = 2; i <= n; i++) {
            boolean prima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
