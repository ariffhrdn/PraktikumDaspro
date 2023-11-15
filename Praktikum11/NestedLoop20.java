import java.util.Scanner;
public class NestedLoop20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int kota;
        double rata = 0;

        System.out.print("Masukkan Jumlah Kota yang Ingin Disimpan: ");
        kota = sc.nextInt();

       double[][] suhu = new double[kota][4];

        for (int i = 0; i < suhu.length; i++) {
            System.out.println("KOTA KE- " + (i+1));

            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print(" Suhu ke- " + (j+1) + ": ");
                suhu[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < suhu.length; i++) {
            System.out.println("KOTA KE- " + (i+1));

            for (double temp : suhu[i]) {
                System.out.println(temp);
                
            }
           System.out.println();
        }

        
        for (int i = 0; i < suhu.length; i++) {
            System.out.print("Rata rata suhu kota ke- " + (i+1) + " adalah: ");
            double total = 0;
            for (int j = 0; j < suhu[i].length; j++) {
                total = total + suhu[i][j];
            }
            rata =(double)total / suhu[i].length;
            System.out.println(rata);
        }
        sc.close();
    }
    
}
