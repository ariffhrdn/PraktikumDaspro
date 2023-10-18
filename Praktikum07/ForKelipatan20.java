package Praktikum07;
import java.util.Scanner;
public class ForKelipatan20 {
    public static void main(String[] args) {
        int bilangan, total, counter;
        Scanner sc = new Scanner(System.in);
        total = 0;
        counter = 0;

        System.out.print("Masukkan Bilangan 1-9: ");
        bilangan = sc.nextInt();
        for (int i = 0; i < 50; i++) {
            if (i % bilangan == 0) {
                total += i;
                counter ++;
            }
        }

        System.out.printf("Pada rentang 1-50 terdapat %d bilangan kelipatan %d dengan total %d", counter, bilangan, total);
    }
}
