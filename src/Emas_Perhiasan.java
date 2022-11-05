import java.util.Arrays;

public class Emas_Perhiasan extends Emas{ // Pewarisan Emas terhadap Emas_Batangan
    Boolean[] no_urut = {false, false, false, false, false}; // Method berupa Boolean properti
    public int harga = 3000000;

    public void penggadaian(){
        for(int i = 0; i<5; i++){
            if (no_urut[i] == false){
                System.out.println("Selamat !!! Berhasil Digadai");
                System.out.println("Transaksi Penggadaian Ke-"+(i+1));
                break;
            }
        }
        System.out.println("Harga Emas : "+harga);
        System.out.println(fasilitas());
    }
}