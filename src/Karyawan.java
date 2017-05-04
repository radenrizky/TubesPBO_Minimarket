import java.util.HashMap;

/**
 * Created by Annisa Rahmayanti on 5/2/2017.
 */
public class Karyawan {
    String nik;
    String nama;
    String no_telp;
    String jenis_kelamin;
    String alamat;
    String tgl_lahir;

    HashMap<String, Karyawan> hmKaryawan = new HashMap<String, Karyawan>() ;

    public Karyawan (String nik, String nama , String no_telp, String jenis_kelamin, String alamat, String tgl_lahir ) {

        this.nik = nik;
        this.nama = nama;
        this.no_telp = no_telp;
        this.jenis_kelamin = jenis_kelamin;
        this.alamat = alamat;
        this.tgl_lahir = tgl_lahir;

    }

    public void addKaryawan(Karyawan pegawai){ hmKaryawan.put (pegawai.nik,pegawai);}

    public void print() {

        System.out.println("==== Karyawan ====");

            System.out.println("Nik:" + nik);
            System.out.println("Nama:" + nama);
            System.out.println("No Telephone:" +no_telp);
            System.out.println("Jenis Kelamin:" +jenis_kelamin);
            System.out.println("alamat:" + alamat);
            System.out.println("Tanggal Lahir:" + tgl_lahir);
    }

    public void deletKaryawan (int delet) {  hmKaryawan.remove(delet); }

    public static void main(String[] args){
        Karyawan pegawai = new Karyawan(  "1567890", "Ridho Rimawan","0229145067",   "Laki-laki", "ujungberung Bandung" , "26 july 1996");
        pegawai.addKaryawan(pegawai);
        pegawai.print();
        pegawai.deletKaryawan(  1);
        pegawai.print();

    }
}
