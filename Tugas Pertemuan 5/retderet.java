import java.util.Scanner;

public class retderet {
    public static int jDeret(int n) {
        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            jumlah += i;
        }
        return jumlah;
    }

    public static void cDeret(int n) {
        StringBuilder deret = new StringBuilder();
        int jumlah = 0;
        
        for (int i = 1; i <= n; i++) {
            jumlah += i;
            deret.append(i);
            if (i < n) {
                deret.append("+");
            }
        }
        
        System.out.println(deret.toString() + " = " + jumlah);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();
        
        cDeret(n);
        scanner.close();
    }
}
