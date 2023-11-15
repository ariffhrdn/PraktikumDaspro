import java.util.Scanner;
public class KotakAngka20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    while(true) {    
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        if (n % 2 != 0 && n > 2){


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1|| j == n|| i == 1|| i == n) {
                    System.out.print(n + " ");
                }
                else {
                    System.out.print("  ");
                } 
            }
             System.out.println(); 
        }
        break;
        }
        else {
        System.out.println("Tolong Masukkan Angka Ganjil / Lebih Dari 2)");
        continue;
        }
    }
  }
}
