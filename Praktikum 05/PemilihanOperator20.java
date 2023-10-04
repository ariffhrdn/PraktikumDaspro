 import java.util.Scanner;
public class PemilihanOperator20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukkan Angka 1: ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan Angka 2: ");
        angka2 = sc.nextDouble();
        System.out.print("Masukkan Angka Operator (+ - * /)");
        operator = sc.next().charAt(0);

        if (operator == '+' ) {
           
            hasil = angka1 + angka2;
        }
        else if (operator == '-') {
            hasil = angka1 - angka2;
        }
        else if (operator == '*') {
            hasil = angka1 * angka2;
        }   
        else if (operator == '/') {
            hasil = angka1 / angka2;
        }  
        else {
            System.out.print("Operator yang dipilih tidak sesuai"); 
        }
        System.out.println("Hasil" + hasil);
    }

}
    



