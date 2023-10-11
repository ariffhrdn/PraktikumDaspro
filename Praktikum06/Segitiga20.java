import java.util.Scanner;
public class Segitiga20 {
    public static void main(String[] args) {
        
        int sudut1, sudut2, sudut3;
        double totalSudut;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Sudut 1: ");
        sudut1 = sc.nextInt();
        System.out.println("Masukkan Sudut 2: ");
        sudut2 = sc.nextInt();
        System.out.println("Masukkan Sudut 3: ");
        sudut3 = sc.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            }else {
                System.out.println("Segitiga tersebut bukan segitiga siku-siku");
            }
        } else {
            System.out.println("Bukan segitiga");
        }
    }
    
}
