import java.util.Scanner;
import java.text.DecimalFormat;

public class Tugaskelompok1 {
    public static void main(String[] args) {
//        Input user data
        Scanner scan = new Scanner(System.in);

//        Variable menu
        String menu1 = "1. Nasi Goreng Spesial : ";
        String menu2 = "2. Ayam Bakar Spesial : ";
        String menu3 = "3. Steak Sirloin Spesial : ";
        String menu4 = "4. Kwetiaw Siram Spesial : ";
        String menu5 = "5. Kambing Guling Spesial : ";

//        Variable harga menu
        double harga1 = 9999.99;
        double harga2 = 12345.67;
        double harga3 = 21108.40;
        double harga4 = 13579.13;
        double harga5 = 98765.43;

//      Variable porsi
//        porsi1, porsi2, porsi3, porsi4, porsi5


//        Welcome
        System.out.print("Selamat siang...");

//        Pesanan dan nama
        System.out.print("\nPesanan untuk berapa orang : ");
        int jmhPesanan = scan.nextInt();

        System.out.print("Pesanan atas nama : ");
        String namaUser = scan.next();


//        Menu
        System.out.println("\nMenu Spesial hari ini");
        System.out.println("===============================================================");
//        Nama menu
        System.out.println(menu1 + harga1);
        System.out.println(menu2 + harga2);
        System.out.println(menu3 + harga3);
        System.out.println(menu4 + harga4);
        System.out.println(menu5 + harga5);

//        Pesanan batasan
        System.out.println("\nPesanan Anda (batas pesanan 0-10 por)");
//        Porsi di kali harga Variable

        System.out.print(menu1);
        int porsi1 = scan.nextInt();
        System.out.print(menu2);
        int porsi2 = scan.nextInt();
        System.out.print(menu3);
        int porsi3 = scan.nextInt();
        System.out.print(menu4);
        int porsi4 = scan.nextInt();
        System.out.print(menu5);
        int porsi5 = scan.nextInt();

        //        Varibel Total Pembelian
        double totalPembelian1 = porsi1 * harga1;
        double totalPembelian2 = porsi2 * harga2;
        double totalPembelian3 = porsi3 * harga3;
        double totalPembelian4 = porsi4 * harga4;
        double totalPembelian5 = porsi5 * harga5;
//      Dformat
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String formatted1 = decimalFormat.format(totalPembelian1);

        DecimalFormat decimalFormat2 = new DecimalFormat("0.00");
        String formatted2 = decimalFormat2.format(totalPembelian2);

        DecimalFormat decimalFormat3 = new DecimalFormat("0.00");
        String formatted3 = decimalFormat3.format(totalPembelian3);

        DecimalFormat decimalFormat4 = new DecimalFormat("0.00");
        String formatted4 = decimalFormat4.format(totalPembelian4);

        DecimalFormat decimalFormat5 = new DecimalFormat("0.00");
        String formatted5 = decimalFormat5.format(totalPembelian5);

        System.out.println("\nSelamat menikmati makanan anda " + namaUser);
//        Final Result
        System.out.println("\nPembelian :");
        System.out.println(menu1 + formatted1);
        System.out.println(menu2 + formatted2);
        System.out.println(menu3 + formatted3);
        System.out.println(menu4 + formatted4);
        System.out.println(menu5 + formatted5);
        System.out.println("================================================================");
//        hasiltotal
        double hasilTotal = totalPembelian1 + totalPembelian2 + totalPembelian3 + totalPembelian4 + totalPembelian5;
        DecimalFormat decimalFormat6 = new DecimalFormat("0.00");
        String formatted6 = decimalFormat6.format(hasilTotal);
        System.out.println("Total Pembelian : " + formatted6);
//        Variable Discount
        double discount = hasilTotal * 0.1;
        DecimalFormat decimalFormat7 = new DecimalFormat("0.00");
        String formatted7 = decimalFormat7.format(discount);

        System.out.println("\ndisc 10% <masa promosi> : " + formatted7);

        System.out.println("==================================================================");
//      Hasil Discount
        double hasilDiscount = hasilTotal - discount;
        DecimalFormat decimalFormat8 = new DecimalFormat("0.00");
        String formatted8 = decimalFormat8.format(hasilDiscount);
        System.out.println("\nTotal Pembelian setelah disc 10% : " + formatted8);
//      Variable pembagian perorang
        double pembelianPerorang = hasilDiscount / jmhPesanan;
        DecimalFormat decimalFormat9 = new DecimalFormat("0.00");
        String formatted9 = decimalFormat9.format(pembelianPerorang);
        System.out.println("\nTotal Pembelian per orang : " + formatted9);
//        Final line
        System.out.println("\nTerima kasih atas kunjungan Anda...");
        System.out.println("\n...tekan ENTER untuk keluar...");
    }
}
