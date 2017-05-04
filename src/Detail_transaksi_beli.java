import java.util.HashMap;

/**
 * Created by Annisa Rahmayanti on 5/2/2017.
 */
public class Detail_transaksi_beli {
    int no_transaksi;
    String kd_transaksi_beli;
    String kd_barang;
    int jumlah;
    int harga_beli;

    HashMap<Integer, Detail_transaksi_beli> hmtransBeli = new HashMap<>();


    public Detail_transaksi_beli(int no_transaksi, String kd_transaksi_beli, String kd_barang, int jumlah_barang, int harga_beli) {
        this.no_transaksi = no_transaksi;
        this.kd_transaksi_beli = kd_transaksi_beli;
        this.kd_barang = kd_barang;
        this.jumlah = jumlah_barang;
        this.harga_beli = harga_beli;
    }


    public void addTransBeli(Detail_transaksi_beli tb) {
        hmtransBeli.put(tb.no_transaksi, tb);
    }


    public void print() {
        System.out.println("No. Transaksi  :" + no_transaksi);

        for (Detail_transaksi_beli tb : hmtransBeli.values()) {
            System.out.println("Kode Barang  :" + kd_barang);
            System.out.println("Jumlah Barang  :" + jumlah);
        }
    }

    public void hapusDetailtransaksi(int kd_hapus) {
        hmtransBeli.remove(kd_hapus);
    }

    public int hitungTagihan() {
        int total=0;
        total =  harga_beli * jumlah;
        return total;
    }

    public static void main(String[] args) {
        Detail_transaksi_beli tb = new Detail_transaksi_beli(1, "112A", "CKLT", 50, 5000);
        tb.addTransBeli(tb);
        tb.print();
        tb.hapusDetailtransaksi(1);
        tb.print();
    }
}

