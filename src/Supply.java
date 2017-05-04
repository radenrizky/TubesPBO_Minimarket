import java.util.HashMap;

/**
 * Created by Annisa Rahmayanti on 5/2/2017.
 */
public class Supply {

    HashMap<Integer,Detail_transaksi_beli> hmtransBeli2 = new HashMap<>();
    HashMap<String,Transaksi_beli> hmtransBeli1 = new HashMap<>();

    public void beliItem(Detail_transaksi_beli dtb) {
        hmtransBeli2.put(dtb.no_transaksi,dtb);
    }


    public void addTransaksiBeli(Transaksi_beli tb) {
        hmtransBeli1.put(tb.kd_trans_beli,tb);
    }


    public int hitungTotal() {
        int total = 0;

        for ( Transaksi_beli tb :hmtransBeli1.values()) {
            total = total + tb.hitungDetailTagihan();
        }
        return total;
    }

    public void printTagihan() {
        System.out.println("--------------------------");
        System.out.println("\nTotal Pembelian: "+hitungTotal());
    }


    public static void main(String[] args) {
        int stok;
        Supply sp = new Supply();

        System.out.println("--SUPPLY BARANG MINIMARKET--\n");

        Karyawan ptgs = new Karyawan(  "1567890", "Ridho Rimawan","0229145067",   "Laki-laki", "ujungberung Bandung" , "26 july 1996");
        System.out.println("Petugas : "+ptgs.nama);

        Supplier s = new Supplier("S105","Maharani", "081223452677");
        System.out.println("Supplier : "+s.nama_supplier+"\n");

        System.out.println("==== Barang ====");
        Transaksi_beli tb = new Transaksi_beli("1", "2 Mei 2017","1409321", "TA23");

        Barang Satu = new Barang("PD001","Pepsodent", 7500,
                8000, 20, "S002", "9 April 2017");

        Detail_transaksi_beli trans1 = new Detail_transaksi_beli(1, "KB001","PD001", 400,7500);
        tb.addTransaksi(trans1);
        sp.addTransaksiBeli(tb);
        Satu.print();
        System.out.println("Harga Beli : "+Satu.harga_beli);
        stok = Satu.stok + trans1.jumlah;
        System.out.println("Stok Sekarang : "+stok+"\n");


        Barang Dua = new Barang("IN003","Indomie", 2300,
                2500, 10, "S002", "9 April 2017");
        Detail_transaksi_beli trans2 = new Detail_transaksi_beli(1, "IN003","B-332", 1000,2300);
        tb.addTransaksi(trans2);
        sp.addTransaksiBeli(tb);
        Dua.print();
        System.out.println("Harga Beli : "+Dua.harga_beli);
        stok = Dua.stok + trans2.jumlah;
        System.out.println("Stok Sekarang : "+stok+"\n");

        sp.printTagihan();

    }
}
