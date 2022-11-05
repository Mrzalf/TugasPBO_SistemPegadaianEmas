import java.util.Scanner;

public class Penggadai {
    Scanner in = new Scanner(System.in);
    Kasir kasir = new Kasir();
    public String nama;
    public int nik;
    public int pilEmas;
    public int batangan;

    public int getPilEmas() {
        return pilEmas;
    }

    public void setPilEmas(int pilEmas) {
        this.pilEmas = pilEmas;
    }

    public String getNama() {
        return nama;
    } //SETTER DAN GETTER

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNik() {
        return nik;
    }
    //SETTER DAN GETTER
    public void setNik(int nik) {
        this.nik = nik;
    }

    public void pesan(){

        System.out.println("Silahkan Masukan Nama Anda : ");
        setNama(in.next());
        System.out.println("Silahkan Masukan NIK Anda : ");
        setNik(in.nextInt());
        System.out.println("Silahkan Pilih Opsi Penggadaian : ");
        System.out.println("1). Emas Batangan");
        System.out.println("2). Emas Perhiasan");
        pilEmas = in.nextInt();
        if(pilEmas == 1){
            kasir.batangan= 1;
            System.out.println("Terimakasih Sudah Menggunakan Jasa Kami, Penggadaian-mu Sedang Diproses !!!");
        }
        else {
            kasir.batangan = 0;
            System.out.println("Terimakasih Sudah Menggunakan Jasa Kami, Penggadaian-mu Sedang Diproses !!!");
        }
    }
}