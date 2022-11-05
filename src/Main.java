import java.util.Scanner;
import java.util.Arrays;

public class Main { // Class bernama Main
    Main(){
        System.out.println("");
        System.out.println("======== Program Sistem Penggadaian Emas ===========");
        System.out.println("===== Dijamin Aman, Terpercaya, & Tanpa Riba =======");
    }
    public static void main(String[] args) { // public bersifat static
        int pil = 1,pilEmas;
        Kasir kasir = new Kasir();
        Emas_Batangan batangan = new Emas_Batangan();
        Emas_Perhiasan perhiasan = new Emas_Perhiasan();
        Penggadai penggadai = new Penggadai();
        Scanner in = new Scanner(System.in);
        Main main = new Main();
        kasir.setNama("Rizaldy"); // Output nama yang nanti akan tampil di +kasir.getNama
        while (pil != 3){ // Perulangan While
            Emas emas = new Emas();
            System.out.println("=== Selamat Datang Di Program Sistem Penggadaian ===");
            System.out.println("");
            System.out.println("Silahkan Anda Pilih Opsi Login Sebagai : ");
            System.out.println("1). Penggadai");
            System.out.println("2). Kasir");
            System.out.println("Masukkan Opsi Pilihan Anda : ");
            pil = in.nextInt();

            if (pil == 1) {
                penggadai.pesan();
            }
            else {
                System.out.println("======HAI KAKAK PENGGADAI TERCINTA======");
                System.out.println("Sugeng Rawuh Ing Pegadaian, Kaliyan Kula Admin Kasir "+kasir.getNama());
                kasir.namaPenggadai = penggadai.getNama();
                kasir.nikPenggadai = penggadai.getNik();
                kasir.inputPenggadaian();

                break;

            }

        }

    }


}