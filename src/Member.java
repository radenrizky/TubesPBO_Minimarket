import java.util.HashMap;

/**
 * Created by Annisa Rahmayanti on 5/2/2017.
 */
public class Member {
    String kd_pelanggan;
    String id_member;
    String nama;
    String no_telepon;
    String jenis_kelamin;
    String alamat;
    String tanggal_lahir;
    int uang;

    HashMap<String,Member> hmMember = new HashMap<>();

    public Member(String kd_pelanggan, String id_member, String nama, String no_telepon, String jenis_kelamin, String alamat, String tanggal_lahir, int uang){
        //untuk mengisi member
        this.kd_pelanggan = kd_pelanggan;
        this.id_member = id_member;
        this.nama = nama;
        this.no_telepon = no_telepon;
        this.jenis_kelamin = jenis_kelamin;
        this.alamat = alamat;
        this.tanggal_lahir = tanggal_lahir;
        this.uang = uang;
    }

    public void addMember(Member mem){
        hmMember.put(mem.kd_pelanggan,mem);
    }

    public void searchMember(String kd_cari){
        System.out.println("=== Member ===");
        if(hmMember.containsKey(kd_cari)){
            System.out.println( "Member ditemukan!\nkd pelanggan : "+kd_pelanggan+"\nid_member : "+id_member+"\nnama : "+nama+"\nno_telepon : "+no_telepon+"\njenis kelamin : "+jenis_kelamin+"\nalamat : "+alamat+"\ntanggal lahir : "+tanggal_lahir+"\ntanggal lahir : "+uang);
        }else{
            System.out.println("Member Tidak Ditemukan!");
        }
    }

    public void deleteMember(String kd_hapus){
        hmMember.remove(kd_hapus);
    }


    public static void main(String[] args) {
        Member mem = new Member("P-001","M-001","Raden Rizky","1234","Perempuan","Garut","27-09-1996", 100000);
        mem.addMember(mem);
        mem.searchMember("P-001");
        mem.deleteMember("P-001");
        mem.searchMember("P-001");

    }
}
