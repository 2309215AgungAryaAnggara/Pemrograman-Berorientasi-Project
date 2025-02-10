public class soal3 {
    public static void main(String[] args) {
        char karakter1 = '1';
        char karakter2 = '2';
        
        int ascii1 = (int) karakter1;
        int ascii2 = (int) karakter2;
        
        int jumlahAscii = ascii1 + ascii2;
        
        System.out.println("Kode ASCII dari '" + karakter1 + "' adalah: " + ascii1);
        System.out.println("Kode ASCII dari '" + karakter2 + "' adalah: " + ascii2);
        System.out.println("Jumlah kode ASCII dari '" + karakter1 + "' dan '" + karakter2 + "' adalah: " + jumlahAscii);
    }
}
