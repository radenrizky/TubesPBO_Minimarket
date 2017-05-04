import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Annisa Rahmayanti on 5/2/2017.
 */
public class Detail_transaksi_jual {
    int no_transaksi;
    String kd_barang;
    int jumlah_barang;
    int harga_barang;

    HashMap<Integer,Detail_transaksi_jual> hmtransJual2 = new HashMap<>();


    public Detail_transaksi_jual(int no_transaksi, String kd_barang, int jumlah_barang, int harga_barang) {
        this.no_transaksi = no_transaksi;
        this.kd_barang = kd_barang;
        this.jumlah_barang = jumlah_barang;
        this.harga_barang = harga_barang;
    }

    public void addTransjual(Detail_transaksi_jual tj) {
        hmtransJual2.put(tj.no_transaksi,tj);
    }

    public void print() {
        System.out.println("Jumlah Barang  :"+jumlah_barang);
    }

    public void hapusDetailtransaksi(int kd_hapus){
        hmtransJual2.remove(kd_hapus);
    }

    public int hitungTagihan() {
        int total=0;
            total =  harga_barang * jumlah_barang;
        return total;
    }

    public static void main(String[] args) {
        Detail_transaksi_jual tj = new Detail_transaksi_jual(1, "PD001", 100,5000);
        tj.addTransjual(tj);
        tj.print();
        System.out.println("Total:"+tj.hitungTagihan());
    }
}
