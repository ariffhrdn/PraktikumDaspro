import java.util.Scanner;
public class Individu20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n =sc.nextInt();

    if (n > 2) {    
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
    else {
        System.out.println("Tolong Masukkan Angka Lebih Dari 2");
    }

    }
}
