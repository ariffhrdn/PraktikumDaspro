import java.util.Scanner;
public class PemilihanBilangan20{
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Sebuah Angka: ");
        int angka = sc.nextInt();
        String bilangan;

       bilangan = (angka % 2 == 0) ? "Bilangan Ganjil" : "Bilangan Genap";
       System.out.println(angka + "adalah" + bilangan);
        
    
    }
}
