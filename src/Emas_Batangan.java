import java.util.Arrays;

public class Emas_Batangan extends Emas{ // Pewarisan Emas terhadap Emas_Batangan
    Boolean[] no_urut = {false, false, false, false, false};
    public int harga = 6000000;
    //Methode Overriding
    String fasilitas (){
        return "Deskripsi : Warnanya Kuning Ke-Emasan, Bobot 4gr, 20000000"+jenis;
    }
    public void penggadaian(){
        for(int i = 0; i<3; i++){
            if (no_urut[i] == false){
                System.out.println("Selamat !!! Berhasil Digadai");
                System.out.println("Gadai Ke"+(i+1));
                break;
            }
        }
        System.out.println("Harga Emas : "+harga);
        System.out.println(fasilitas());

    }
}