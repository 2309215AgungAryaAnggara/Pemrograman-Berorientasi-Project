import java.util.Scanner;

public class satukeN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n (n >= 1): ");
        int n = input.nextInt();

        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Nilai n harus lebih besar atau sama dengan 1!");
        }
        input.close();
    }
}
