import java.util.Scanner;

public class vk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tiga karakter: ");
        String karakter = input.next();

        if (karakter.length() != 3) {
            System.out.println("Masukkan harus tepat tiga karakter.");
        } else {
            char char1 = karakter.charAt(0);
            char char2 = karakter.charAt(1);
            char char3 = karakter.charAt(2);

            boolean konsonan1 = Konsonan(char1);
            boolean vokal = Vokal(char2);
            boolean konsonan3 = Konsonan(char3);

            if (konsonan1 && vokal && konsonan3) {
                System.out.println("Urutan konsonan-vokal-konsonan.");
            } else {
                System.out.println("Bukan urutan konsonan-vokal-konsonan.");
            }
        }

        input.close(); 
    }

    public static boolean Konsonan(char c) {
        return c >= 'a' && c <= 'z' && !Vokal(c);
    }

    public static boolean Vokal(char c) {
        return c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o';
    }
}
