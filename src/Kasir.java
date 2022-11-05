import java.util.Scanner;

public class Kasir {
    private String nama ;

    public String getNama() { //SETTER DAN GETTER
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public char data;
    Scanner in = new Scanner(System.in);
    public String namaPenggadai;
    public int nikPenggadai;
    public int batangan = 0;
    Emas_Batangan bulatan = new Emas_Batangan();
    Emas_Perhiasan perhiasan = new Emas_Perhiasan();




    public void inputPenggadaian(){
        System.out.println("Daftar Data Penggadai");
        System.out.println("(1)");
        System.out.println(namaPenggadai);
        System.out.println(nikPenggadai);
        if (batangan == 1){
            System.out.println("Menggadai Emas Batangan");
        }
        else {
            System.out.println("Menggadai Emas Perhiasan");
        }
        System.out.println("Apakah Ingin Menginputkan Data Emas ?");
        System.out.println("(Y / T)");
        data = in.next().charAt(0);
        if (data == 'Y' || data == 'y'){
            if (batangan == 1){
                bulatan.penggadaian();
            }
            else {
                perhiasan.penggadaian();
            }

        }
        else {
            System.out.println("Terimakasih, Telah Menggunakan Jasa Gadai Kami :)");
        }
    }
}