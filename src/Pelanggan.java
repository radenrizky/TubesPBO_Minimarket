import java.util.HashMap;

/**
 * Created by Annisa Rahmayanti on 5/2/2017.
 */
public class Pelanggan {
    String kd_pelanggan;

    HashMap<String,Pelanggan> hmPelanggan = new HashMap<>();

    public Pelanggan(String kd_pelanggan) {
        //untuk mengisi non member
        this.kd_pelanggan = kd_pelanggan;
    }

    public void addPelanggan(Pelanggan b){
        hmPelanggan.put(b.kd_pelanggan,b);
    }

    public void searchPelanggan(String kd_cari){
        System.out.println("=== Member ===");
        if(hmPelanggan.containsKey(kd_cari)){
            System.out.println( "Member ditemukan!\nkd pelanggan : "+kd_pelanggan);
        }else{
            System.out.println("Member Tidak Ditemukan!");
        }
    }

    public void deletePelanggan(String kd_hapus){
        hmPelanggan.remove(kd_hapus);
    }

    public void print() {

        System.out.println("==== Pelanggan ====");

        //for (Karyawan pegawai : hmKaryawan.values()) {
        System.out.println("Id Pelanggan:" +kd_pelanggan);
//        System.out.println("Nama:" + nama);
//            System.out.println("No Telephone:" +no_telp);
//            System.out.println("Jenis Kelamin:" +jenis_kelamin);
//            System.out.println("alamat:" + alamat);
//            System.out.println("Tanggal Lahir:" + tgl_lahir);
        //}
    }

    public static void main(String[] args) {
        Pelanggan p = new Pelanggan("P-003");
        p.addPelanggan(p);
        p.searchPelanggan("P-003");
        p.deletePelanggan("P-003");
        p.searchPelanggan("P-003");

    }
}
