import java.util.ArrayList;
import java.util.HashMap;



/**
 * Created by Annisa Rahmayanti on 5/2/2017.
 */
public class Minimarket {
    HashMap<String,Transaksi_jual> hmtransJual1 = new HashMap<>();

    public void addTransaksiJual(Transaksi_jual tj) {
        hmtransJual1.put(tj.kd_trans_jual,tj);
    }


    public int hitungTotal() {
        int total = 0;
        for ( Transaksi_jual tj :hmtransJual1.values()) {
            total = total + tj.hitungDetailTagihan();
        }
        return total;
    }

    public void printTagihan() {
        System.out.println("--------------------------");
        System.out.println("Total : "+hitungTotal());
    }


        public static void main(String[] args) {
            int kembali=0;
            Minimarket mm = new Minimarket();

            System.out.println("--MINIMARKET--");

            Admin adm = new Admin("A-001","Raden Rizky","1234","Perempuan","Garut","27-09-1996");
            System.out.println("Admin : "+adm.id_admin);

            Member mem = new Member("P-001","M-001","Raden Rizky","1234","Perempuan","Garut","27-09-1996", 100000);
            System.out.println("Kode Member : "+mem.id_member);

            System.out.println("\n==== Barang ====");
            Transaksi_beli tb = new Transaksi_beli("1", "2 Mei 2017","1409321", "TA23");

            Transaksi_jual tj = new Transaksi_jual("1", "3 Mei 2017","Nia","P01");

            Barang Satu = new Barang("PD001","Pepsodent", 7500,
                    8000, 20, "S002", "9 April 2017");
            Satu.print();
            System.out.println("");
            Detail_transaksi_jual trans1 = new Detail_transaksi_jual(1, "PD001", 2,5000);
            tj.addTransaksi(trans1);
            mm.addTransaksiJual(tj);

            Barang Dua = new Barang("IN003","Indomie", 2300,
                    2500, 10, "S002", "9 April 2017");
            Dua.print();
            Detail_transaksi_jual trans2 = new Detail_transaksi_jual(1, "IN003", 5,7000);
            tj.addTransaksi(trans2);
            mm.addTransaksiJual(tj);

            mm.printTagihan();
            System.out.println("Uang : "+mem.uang);
            kembali = mem.uang - mm.hitungTotal();
            System.out.println("Kembali : "+kembali);


        }
}
