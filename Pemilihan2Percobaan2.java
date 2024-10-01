import java.util.Scanner;

public class Pemilihan2Percobaan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan_menu;
        String member, payment_metode;
        double diskon = 0, total_bayar, harga = 0;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input.nextInt();
        input.nextLine();  // Consume newline
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input.nextLine();
        System.out.print("Metode pembayaran (qris/cash)  = ");
        payment_metode = input.nextLine();

        System.out.println("-------------------------");
        System.out.println("======= STRUK PEMBAYARAN ======= \n");

        // Check if the user is a member
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.1;  // 10% discount for members
            System.out.println("Mendapatkan Diskon 10%");
        } else if (!member.equalsIgnoreCase("n")) {
            System.out.println("Masukkan input member dengan benar (y/n)");
            return;
        }

        // Calculate price based on menu selection
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl : Rp " + harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea : Rp " + harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga Paket Bundling : Rp " + harga);
        } else {
            System.out.println("Masukkan Pilihan menu dengan benar");
            return;
        }

        // Calculate total payment
        total_bayar = harga - (harga * diskon);  // Apply discount if applicable
        System.out.println("Total bayar setelah diskon: Rp " + total_bayar);

        // Apply QRIS fee or final payment adjustments
        double final_payment = 0;
        if (payment_metode.equalsIgnoreCase("qris")) {
            System.out.println("QRIS Fee: Rp 1000");
            final_payment = total_bayar + 1000;  // Adding QRIS fee
        } else {
            final_payment = total_bayar;
        }

        // Print the final receipt
        System.out.println("Member \t\t : " + (member.equalsIgnoreCase("y") ? "Member" : "Non Member"));
        System.out.println("Metode bayar \t: " + payment_metode);
        System.out.println("Total bayar \t: Rp " + final_payment);

        input.close();
    }
}
