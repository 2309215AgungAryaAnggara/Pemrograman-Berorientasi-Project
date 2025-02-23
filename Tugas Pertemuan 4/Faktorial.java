import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n (n >= 0): ");
        int n = input.nextInt();
        
        if (n < 0) {
            System.out.println("Nilai n harus >= 0!");
        } else {
            int faktorial = 1;
            System.out.print(n + "! = ");
            for (int i = n; i >= 1; i--) {
                faktorial *= i;
                System.out.print(i + (i > 1 ? "*" : ""));
            }
            System.out.println("=" + faktorial);
        }
        input.close();
    }
}
