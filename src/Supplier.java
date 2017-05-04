import java.util.HashMap;

/**
 * Created by Annisa Rahmayanti on 5/2/2017.
 */
public class Supplier {
    String kd_supplier;
    String nama_supplier;
    String no_telp;

    HashMap<String,Supplier> hmSupplier = new HashMap<>();


    public Supplier(String kd_supplier, String nama_supplier, String no_telp) {
        this.kd_supplier = kd_supplier;
        this.nama_supplier = nama_supplier;
        this.no_telp = no_telp;
    }


    public void addSupplier(Supplier s) {
        hmSupplier.put(s.kd_supplier, s);
    }



    public void hapusSupplier(String kd_hapus){
        hmSupplier.remove(kd_hapus);
    }

    public static void main(String[] args) {
        Supplier s = new Supplier("S105","Maharani", "081223452677");
        s.addSupplier(s);
        s.hapusSupplier("S105");
    }
}
