import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class mengelola {
    private List<Peserta> daftarPeserta;

    public mengelola() {
        daftarPeserta = new LinkedList<>();
    }


    public void tambahPeserta(String rt, String nama, int skor) {
        Peserta pesertaBaru = new Peserta(rt, nama, skor);
        daftarPeserta.add(pesertaBaru);
        Collections.sort(daftarPeserta);
    }

    public boolean cariPeserta(String rt, String nama, int skor) {
        for (Peserta peserta : daftarPeserta) {
            if (peserta.getRt().equalsIgnoreCase(rt) && peserta.getNama().equalsIgnoreCase(nama) && peserta.getSkor() == skor) {
                return true;
            }
        }
        return false;
    }
    

    public void tampilkanPeserta() {
        if (daftarPeserta.isEmpty()) {
            System.out.println("Tidak ada peserta yang ditemukan.");
        } else {
            for (Peserta peserta : daftarPeserta) {
                System.out.println(peserta);
            }
        }
    }

    public void tampilkanPemenang() {
        if (daftarPeserta.isEmpty()) {
            System.out.println("Tidak ada peserta yang ditemukan.");
        } else {
            Peserta pemenang = Collections.max(daftarPeserta);
            System.out.println("Pemenang: " + pemenang);
        }
    }
}
