public class Peserta implements Comparable<Peserta> {
    private String rt;
    private String nama;
    private int skor;

    public Peserta(String rt, String nama, int skor) {
        this.rt = rt;
        this.nama = nama;
        this.skor = skor;
    }

    public String getRt() {
        return rt;
    }

    public String getNama() {
        return nama;
    }

    public int getSkor() {
        return skor;
    }

    @Override
    public int compareTo(Peserta pesertaLain) {
        return Integer.compare(this.skor, pesertaLain.skor);
    }

    @Override
    public String toString() {
        return "RT: " + rt + ", Nama: " + nama + ", Skor: " + skor;
    }
}
