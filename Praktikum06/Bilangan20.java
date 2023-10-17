import java.util.Scanner;
public class Bilangan20 {
    public static void main(String[] args) {
        int bil1, bil2, bil3, bilanganTerbesar;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Bilangan ke 1:");
        bil1 = sc.nextInt();
        System.out.println("Masukkan Bilangan ke 2:");
        bil2 = sc.nextInt();
        System.out.println("Masukkan Bilangan ke 3:");
        bil3 = sc.nextInt();

    
        bilanganTerbesar = bil1 > bil2 ? (bil1 > bil3 ? bil1 : (bil1 > bil3 ? bil1 : bil3)) : (bil1 > bil3 ? bil2 : (bil2 > bil3 ? bil2 : bil3));

        System.out.print("Bilangan terbesar: " + bilanganTerbesar);
        bilanganTerbesar = sc.nextInt();
    }
    
}
