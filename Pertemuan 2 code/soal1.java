import java.util.Scanner;
public class soal1 {
    public static void main(String [] args){
        Scanner ngisibro = new Scanner(System.in);
        
        System.out.println("Masukan Bilangan ke 1 :");
        int a = ngisibro.nextInt();
        
        System.out.println("Masukan Bilangan ke 2 :");
        int b = ngisibro.nextInt();
        
        System.out.println("Masukan Bilangan ke 3 :");
        int c = ngisibro.nextInt();
        
        int penjumlahan = a + b + c;
        System.out.println("Hasil penjumlahan :" + penjumlahan);
        
        int pengurangan = a - b - c;
        System.out.println("Hasil Pengurangan :"+ pengurangan);
        
        int perkalian = a * b * c;
        System.out.println("Hasil Perkalian :"+ perkalian);
        
        if(b !=0 && c !=0){
            double pembagian = (double) a/b/c;
            System.out.println("Hasil Pembagian :"+pembagian); 
        }else{
            System.out.println("Pembagian Tidak Dapat Dilakukan Karena pembagi 0.");
        }
       ngisibro.close();
    }
}