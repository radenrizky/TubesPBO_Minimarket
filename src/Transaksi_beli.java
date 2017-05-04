import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Annisa Rahmayanti on 5/2/2017.
 */
public class Transaksi_beli {
    String kd_trans_beli;
    String tgl_transaksi;
    String nik;
    String kd_supplier;

    HashMap<String,Transaksi_beli> hmtrans_beli = new HashMap<>();
    ArrayList<Detail_transaksi_beli> arrtrans_beli = new ArrayList<>();

    public Transaksi_beli(String kd_trans_beli, String tgl_transaksi, String nik, String kd_supplier) {
        this.kd_trans_beli = kd_trans_beli;
        this.tgl_transaksi = tgl_transaksi;
        this.nik = nik;
        this.kd_supplier = kd_supplier;
    }

    public int hitungDetailTagihan(){
        int total=0;
        //LEGNKAPI
        for (Detail_transaksi_beli dtb :arrtrans_beli) {
            total =  total + dtb.hitungTagihan();
        }
        return total;
    }


    public void addTransaksi(Detail_transaksi_beli tb) { arrtrans_beli.add(tb);}

    public void addTransbeli(Transaksi_beli tb) {
        hmtrans_beli.put(tb.kd_trans_beli,tb);
    }


    public void print() {
        System.out.println("== Minimarket ===");
            System.out.println("Kode Transaksi  :"+kd_trans_beli);
            System.out.println("NIK :"+nik);
            System.out.println("Tanggal Transaksi :"+tgl_transaksi);
            System.out.println("Kode Supplier :"+kd_supplier);
    }

    public void hapusTransaksi(String kd_hapus){
        hmtrans_beli.remove(kd_hapus);
    }


    public static void main(String[] args) {

        Transaksi_beli tb = new Transaksi_beli("1","12 April 2017", "Nia", "P01");
        tb.addTransbeli(tb);
        Detail_transaksi_beli dtb = new Detail_transaksi_beli(1, "PD001","B-1123", 3, 5000);

        tb.addTransaksi(dtb);
        tb.print();
        System.out.println("Total :"+tb.hitungDetailTagihan());
    }
}
