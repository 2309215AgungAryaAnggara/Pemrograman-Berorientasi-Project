import java.util.Scanner;

public class kubus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sisi pertama: ");
        int sisi1 = scanner.nextInt();
        System.out.print("Masukkan sisi kedua: ");
        int sisi2 = scanner.nextInt();
        System.out.print("Masukkan sisi ketiga: ");
        int sisi3 = scanner.nextInt();

        if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
}
