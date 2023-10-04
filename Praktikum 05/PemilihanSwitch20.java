import java.util.Scanner;
public class PemilihanSwitch20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukkan Angka 1: ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan Angka 2: ");
        angka2 = sc.nextDouble();
        System.out.print("Masukkan Angka Operator (+ - * :)");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
            hasil = angka1 + angka2;
            break;
            case '-':
            hasil = angka1 - angka2;
            break;
            case '*':
            hasil = angka1 * angka2;
            break;
            case '/':
            hasil = angka1 / angka2;
            break;
            default:
            System.out.print("Operator yang dipilih tidak sesuai"); return;

            

        }
        System.out.println(angka1 + "" + operator + "" + angka2 + "=" + hasil);
    }
    
}
