import java.util.HashMap;

/**
 * Created by Annisa Rahmayanti on 5/2/2017.
 */
public class NonMember {
    String kd_pelanggan;
    int uang;

    HashMap<String,NonMember> hmNonMember = new HashMap<>();

    public NonMember(String kd_pelanggan, int uang) {
        //untuk mengisi non member
        this.kd_pelanggan = kd_pelanggan;
        this.uang = uang;
    }

    public void addNonMember(NonMember a){
        hmNonMember.put(a.kd_pelanggan,a);
    }

    public void searchNonMember(String kd_cari){
        System.out.println("=== Member ===");
        if(hmNonMember.containsKey(kd_cari)){
            System.out.println( "Member ditemukan!\nkd pelanggan : "+kd_pelanggan);
        }else{
            System.out.println("Member Tidak Ditemukan!");
        }
    }

    public void deleteNonMember(String kd_hapus){
        hmNonMember.remove(kd_hapus);
    }


    public static void main(String[] args) {
        NonMember ber = new NonMember("P-002", 100000);
        ber.addNonMember(ber);
        ber.searchNonMember("P-002");
        ber.deleteNonMember("P-002");
        ber.searchNonMember("P-002");

    }
}
