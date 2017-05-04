import java.util.HashMap;

/**
 * Created by Annisa Rahmayanti on 5/2/2017.
 */
public class Admin {
    String id_admin;
    String nama;
    String no_telepon;
    String jenis_kelamin;
    String alamat;
    String tanggal_lahir;

    HashMap<String,Admin> hmAdmin = new HashMap<>();

    public Admin( String id_admin, String nama, String no_telepon, String jenis_kelamin, String alamat, String tanggal_lahir){
        this.id_admin = id_admin;
        this.nama = nama;
        this.no_telepon = no_telepon;
        this.jenis_kelamin = jenis_kelamin;
        this.alamat = alamat;
        this.tanggal_lahir = tanggal_lahir;
    }

    public void addAdmin(Admin adm){
        hmAdmin.put(adm.id_admin,adm);
    }

    public void searchAdmin(String kd_cari){
        System.out.println("=== Admin ===");
        if(hmAdmin.containsKey(kd_cari)){
            System.out.println( "Admin ditemukan!\nid_admin : "+id_admin+"\nnama : "+nama+"\nno_telepon : "+no_telepon+"\njenis kelamin : "+jenis_kelamin+"\nalamat : "+alamat+"\ntanggal lahir : "+tanggal_lahir);
        }else{
            System.out.println("Admin Tidak Ditemukan!");
        }
    }

    public void deleteAdmin(String kd_hapus){
        hmAdmin.remove(kd_hapus);
    }


    public static void main(String[] args) {
        Admin adm = new Admin("A-001","Raden Rizky","1234","Perempuan","Garut","27-09-1996");
        adm.addAdmin(adm);
        adm.searchAdmin("A-001");
        adm.deleteAdmin("A-001");
        adm.searchAdmin("A-001");

    }
}
