import java.util.Scanner;
public class PemilihanHaridenganIf {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double angka;
        System.out.print("Masukkan Angka Bulat: ");
        angka = sc.nextDouble();
       

        if (angka > 0 && angka <= 5) {
            System.out.println("Weekday");
        }
        else if (angka > 5 && angka <=7) {
            System.out.println("Weekend");
        }
        else {
            System.out.println("invalid number");
        }
        


    }
    
}
