import java.util.Scanner;

public class awawa3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angka1, angka2, hasil = 0;
        char operator;
        
        System.out.print("Masukkan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan angka 2: ");
        angka2 = sc.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = sc.next().charAt(0);

        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            // Check for division by zero
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                sc.close();
                
            }
        } else {
            System.out.println("Error: Operator tidak valid. Silakan masukkan operator +, -, *, atau /.");
            sc.close();
            
        }
        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
        sc.close();

    }
}
