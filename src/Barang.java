import java.util.HashMap;

/**
 * Created by Annisa Rahmayanti on 5/2/2017.
 */
public class Barang {
    String kd_barang;
    String nama_barang;
    int harga_beli;
    int harga_jual;
    int stok;
    String kd_supplier;
    String tgl_msk_barang;

    HashMap<String,Barang> hmBarang = new HashMap<>();
    public Barang(){
        
    }

    public Barang(String kd_barang, String nama_barang, int harga_beli,
                  int harga_jual, int stok, String kd_supplier, String tgl_msk_barang) {
        this.kd_barang = kd_barang;
        this.nama_barang = nama_barang;
        this.harga_beli = harga_beli;
        this.harga_jual = harga_jual;
        this.stok = stok;
        this.kd_supplier = kd_supplier;
        this.tgl_msk_barang = tgl_msk_barang;
    }


    public void addBarang(Barang brg) {
        hmBarang.put(brg.kd_barang, brg);
    }

    public void searchBarang(String kd_cari){
        System.out.println("== Produk ===");
        if (hmBarang.containsKey(kd_cari)) {
            System.out.println("Kode Barang  :"+kd_barang);
            System.out.println("Nama Barang  :"+nama_barang);
            System.out.println("Harga Beli :"+harga_beli);
            System.out.println("Harga Jual :"+harga_jual);
            System.out.println("Jumlah Stok  :"+stok);
            System.out.println("Kode Supplier :"+kd_supplier);
            System.out.println("Tanggal Masuk :"+tgl_msk_barang);
        } else{
            System.out.println("Barang tidak ditemukan!");
        }
    }

    public void hapusBarang(String kd_hapus){
        hmBarang.remove(kd_hapus);
    }

    public void print() {
        System.out.println("Kode Barang:" + kd_barang);
        System.out.println("Nama Barang:" + nama_barang);
        System.out.println("Harga :" + harga_jual);
    }

    public static void main(String[] args) {
        Barang brg = new Barang("PD001","Pepsodent", 7500,
                8000, 20, "S002", "9 April 2017");
        brg.addBarang(brg);
        brg.searchBarang("PD001");
        brg.hapusBarang("PD001");
        brg.searchBarang("PD001");
    }
}
