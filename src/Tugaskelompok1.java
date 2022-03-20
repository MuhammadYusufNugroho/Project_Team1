import java.util.Scanner;
import java.text.DecimalFormat;

public class Tugaskelompok1 {
    public static class orderItem {
        String name;
        String price;
        String quantity;
        String totalPrice;

        public orderItem(String name, String quantity, String price, String totalPrice) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
            this.totalPrice = totalPrice;
        }

        public String toString() {
            return this.name;
        }

    }

    final static int padding = 3;


    public static void main(String[] args) {
//        Input user data
        Scanner scan = new Scanner(System.in);

//        Variable menu
        String menu1 = "Nasi Goreng Spesial";
        String menu2 = "Ayam Bakar Spesial";
        String menu3 = "Steak Sirloin Spesial";
        String menu4 = "Kwetiaw Siram Spesial";
        String menu5 = "Kambing Guling Spesial";

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
        System.out.println("1. " + menu1 + ": " + harga1);
        System.out.println("2. " + menu2 + ": " + harga2);
        System.out.println("3. " + menu3 + ": " + harga3);
        System.out.println("4. " + menu4 + ": " + harga4);
        System.out.println("5. " + menu5 + ": " + harga5);

//        Pesanan batasan
        System.out.println("\nPesanan Anda (batas pesanan 0-10 por)");
//        Porsi di kali harga Variable

        System.out.print("1. " + menu1 + ": ");
        int porsi1 = scanIntMax(scan, 10);
        System.out.print("2. " + menu2 + ": ");
        int porsi2 = scanIntMax(scan, 10);
        System.out.print("3. " + menu3 + ": ");
        int porsi3 = scanIntMax(scan, 10);
        System.out.print("4. " + menu4 + ": ");
        int porsi4 = scanIntMax(scan, 10);
        System.out.print("5. " + menu5 + ": ");
        int porsi5 = scanIntMax(scan, 10);

        //        Varibel Total Pembelian
        double totalPembelian1 = porsi1 * harga1;
        double totalPembelian2 = porsi2 * harga2;
        double totalPembelian3 = porsi3 * harga3;
        double totalPembelian4 = porsi4 * harga4;
        double totalPembelian5 = porsi5 * harga5;

        //      Dformat
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        // total pembelian formatted
        String formatted1 = decimalFormat.format(totalPembelian1);
        String formatted2 = decimalFormat.format(totalPembelian2);
        String formatted3 = decimalFormat.format(totalPembelian3);
        String formatted4 = decimalFormat.format(totalPembelian4);
        String formatted5 = decimalFormat.format(totalPembelian5);

        // harga formatted
        String hargaFormatted1 = decimalFormat.format(harga1);
        String hargaFormatted2 = decimalFormat.format(harga2);
        String hargaFormatted3 = decimalFormat.format(harga3);
        String hargaFormatted4 = decimalFormat.format(harga4);
        String hargaFormatted5 = decimalFormat.format(harga5);

        // porsi formatted
        String porsiFormatted1 = String.valueOf(porsi1);
        String porsiFormatted2 = String.valueOf(porsi2);
        String porsiFormatted3 = String.valueOf(porsi3);
        String porsiFormatted4 = String.valueOf(porsi4);
        String porsiFormatted5 = String.valueOf(porsi5);

        System.out.println("\nSelamat menikmati makanan anda " + namaUser);
//        Final Result
        System.out.println("\nPembelian :");


//        hasiltotal
        double hasilTotal = totalPembelian1 + totalPembelian2 + totalPembelian3 + totalPembelian4 + totalPembelian5;
        DecimalFormat decimalFormat6 = new DecimalFormat("0.00");
        String formatted6 = decimalFormat6.format(hasilTotal);

//        Variable Discount
        double discount = hasilTotal * 0.1;
        DecimalFormat decimalFormat7 = new DecimalFormat("0.00");
        String formatted7 = decimalFormat7.format(discount);


//      Hasil Discount
        double hasilDiscount = hasilTotal - discount;
        DecimalFormat decimalFormat8 = new DecimalFormat("0.00");
        String formatted8 = decimalFormat8.format(hasilDiscount);

//      Variable pembagian perorang
        double pembelianPerorang = hasilDiscount / jmhPesanan;
        DecimalFormat decimalFormat9 = new DecimalFormat("0.00");
        String formatted9 = decimalFormat9.format(pembelianPerorang);

        // detail order items
        orderItem item1 = new orderItem(menu1, porsiFormatted1, hargaFormatted1, formatted1);
        orderItem item2 = new orderItem(menu2, porsiFormatted2, hargaFormatted2, formatted2);
        orderItem item3 = new orderItem(menu3, porsiFormatted3, hargaFormatted3, formatted3);
        orderItem item4 = new orderItem(menu4, porsiFormatted4, hargaFormatted4, formatted4);
        orderItem item5 = new orderItem(menu5, porsiFormatted5, hargaFormatted5, formatted5);
        orderItem[] items = new orderItem[]{item1,item2,item3,item4,item5};

        // print all
        print(items, formatted6, formatted7, formatted8, formatted9, jmhPesanan);

//        Final line
        System.out.println("\nTerima kasih atas kunjungan Anda...");
        System.out.println("\n...tekan ENTER untuk keluar...");
    }

    static int scanIntMax(Scanner scan, int max) {
        int val = scan.nextInt();
        if (val > 10) {
            val = 10;
        }
        return val;
    }

    static void print(orderItem[] items, String total, String disc, String totalAfterDisc, String totalEach, int guestCount) {
        int nameMaxLength = 0;
        int priceMaxLength = 0;
        int totalPriceMaxLength = total.length();
        int quantityMaxLength = 0;

        for(orderItem item: items) {
            if (item.name.length() > nameMaxLength) {
                nameMaxLength = item.name.length();
            }
            if (item.price.length() > priceMaxLength) {
                priceMaxLength = item.price.length();
            }
            if (item.totalPrice.length() > totalPriceMaxLength) {
                totalPriceMaxLength = item.totalPrice.length();
            }
            if (item.quantity.length() > quantityMaxLength) {
                quantityMaxLength = item.quantity.length();
            }
        }

        int rowNum = 1;
        nameMaxLength += padding;
        for(orderItem item: items) {
            System.out.printf("%d. ", rowNum);

            System.out.print(item.name);
            printSpace(nameMaxLength - item.name.length());

            printSpace(quantityMaxLength- item.quantity.length());
            System.out.printf("%s porsi * Rp. ", item.quantity);

            printSpace(priceMaxLength - item.price.length());
            System.out.print(item.price);

            System.out.print("  =  Rp. ");

            printSpace(totalPriceMaxLength - item.totalPrice.length());
            System.out.print(item.totalPrice);

            if (rowNum == items.length) {
                System.out.print(" +");
            } else {
                System.out.print("  ");
            }


            System.out.print("\n");


            rowNum++;
        }

        int column1 = nameMaxLength + quantityMaxLength + priceMaxLength + 18;
        int column2 = 7 + totalPriceMaxLength + 2;

        printString("=", column1 + column2);
        System.out.println();

        printFooter("Total Pembelian", column1, total, totalPriceMaxLength, "  ");
        System.out.println();

        printFooter("Disc. 10% (Masa promosi)", column1, disc, totalPriceMaxLength, " -");

        printString("=", column1 + column2);
        System.out.println();

        printFooter("Total Pembelian setelah disc 10%", column1, totalAfterDisc, totalPriceMaxLength, " ");
        System.out.println();


        String label = String.format("Pembelian per orang (untuk %d orang)", guestCount);
        printFooter(label, column1, totalEach, totalPriceMaxLength, " ");
    }

    static void printFooter(String label, int col1Max, String total, int totalMax, String suffix) {
        System.out.print(label);
        printSpace(col1Max - label.length());
        System.out.print("=  Rp. ");
        printSpace(totalMax - total.length());
        System.out.print(total);
        System.out.print(suffix);
        System.out.println();
    }

    static void printSpace(int length) {
        printString(" ", length);
    }

    static void printString(String s, int length) {
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                System.out.print(s);
            }
        }
    }
}


