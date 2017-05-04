import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Annisa Rahmayanti on 5/2/2017.
 */
public class Transaksi_jual {
    String kd_trans_jual;
    String tgl_transaksi;
    String username;
    String kd_pelanggan;

    HashMap<String,Transaksi_jual> hmtransJual = new HashMap<>();
    ArrayList<Detail_transaksi_jual> arrtrans_jual = new ArrayList<>();


    public Transaksi_jual(String kd_trans_jual, String tgl_transaksi, String username, String kd_pelanggan) {
        this.kd_trans_jual = kd_trans_jual;
        this.tgl_transaksi = tgl_transaksi;
        this.username = username;
        this.kd_pelanggan = kd_pelanggan;
    }


    public void addTransjual(Transaksi_jual tj) {
        hmtransJual.put(tj.kd_trans_jual,tj);
    }

    public int hitungDetailTagihan(){
        int total=0;
        //LEGNKAPI
        for (Detail_transaksi_jual dtj :arrtrans_jual) {
            total =  total + dtj.hitungTagihan();
        }
        return total;
    }

    public void addTransaksi(Detail_transaksi_jual tj) { arrtrans_jual.add(tj);}


    public void print() {
        System.out.println("== Minimarket ===");
        for (Transaksi_jual tj :hmtransJual.values()) {
            System.out.println("Kode Transaksi  :"+kd_trans_jual);
            System.out.println("Tanggal Transaksi :"+tgl_transaksi);
            System.out.println("Username :"+username);
            System.out.println("Kode Pelanggan :"+kd_pelanggan);
        }
    }

    public void hapusTransaksi(String kd_hapus){
        hmtransJual.remove(kd_hapus);
    }

    public static void main(String[] args) {
        Transaksi_jual tj = new Transaksi_jual("1","12 April 2017", "Nia", "P01");
        tj.addTransjual(tj);
        Detail_transaksi_jual dtj = new Detail_transaksi_jual(1, "PD001", 100,5000);

        tj.addTransaksi(dtj);
        tj.print();
        System.out.println("Total :"+tj.hitungDetailTagihan());
        //tj.hapusTransaksi("1");
        //tj.print();
    }
}
