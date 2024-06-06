import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mengelola pengelola = new mengelola();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data peserta lomba");
            System.out.println("2. Cari data");
            System.out.println("3. Pemenang lomba");
            System.out.println("4. Keluar");

            String macam = scanner.nextLine();

            switch (macam) {
                case "1":
                    System.out.print("Masukkan RT, nama dan nilai ");
                    String rt = scanner.nextLine();
                    String nama = scanner.nextLine();
                    int skor = scanner.nextInt();
                    scanner.nextLine();
                    pengelola.tambahPeserta(rt, nama, skor);
                    break;
                case "2":
                    System.out.print("Masukkan RT, nama dan nilai yang dicari");
                    rt = scanner.nextLine();
                    nama = scanner.nextLine();
                    skor = scanner.nextInt();
                    scanner.nextLine(); 
                    if (pengelola.cariPeserta(rt, nama, skor)) {
                        System.out.println("Data telah dimasukkan");
                    } else {
                        System.out.println("Data tidak ditemukan, belum dimasukkan");
                    }
                    break;
                case "3":
                    pengelola.tampilkanPemenang();
                    break;
                case "4":
                    scanner.close();
                    System.out.println("berhasil keluar");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
