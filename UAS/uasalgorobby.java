import java.util.Scanner;

class Kandidat {
    String nama;
    int suara;

    Kandidat(String nama) {
        this.nama = nama;
        this.suara = 0;
    }
}

public class uasalgorobby {
    static Kandidat[] kandidat = {
        new Kandidat("Muhammad Ramdhani"),
        new Kandidat("Diki Kurnia"),
        new Kandidat("Irfan Gunawan")
    };
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Pemilu Ketua OSIS ===");
            System.out.println("1. Lihat Kandidat");
            System.out.println("2. Beri Suara");
            System.out.println("3. Cari Kandidat");
            System.out.println("4. Urutkan Kandidat Berdasarkan Suara");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanKandidat();
                    break;
                case 2:
                    beriSuara();
                    break;
                case 3:
                    cariKandidat();
                    break;
                case 4:
                    urutkanKandidat();
                    tampilkanKandidat();
                    break;
                case 5:
                    System.out.println("Terima kasih telah berpartisipasi dalam pemilu ketua OSIS!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Coba lagi.");
            }
        } while (pilihan != 5);
    }

    static void tampilkanKandidat() {
        System.out.println("\nDaftar Kandidat:");
        for (int i = 0; i < kandidat.length; i++) {
            System.out.println((i + 1) + ". Nama: " + kandidat[i].nama + ", Suara: " + kandidat[i].suara);
        }
    }

    static void beriSuara() {
        tampilkanKandidat();
        System.out.print("Masukkan nomor kandidat yang ingin dipilih: ");
        int nomorPilihan = scanner.nextInt();
        scanner.nextLine();

        if (nomorPilihan >= 1 && nomorPilihan <= kandidat.length) {
            kandidat[nomorPilihan - 1].suara++;
            System.out.println("Suara diberikan kepada " + kandidat[nomorPilihan - 1].nama);
        } else {
            System.out.println("Nomor kandidat tidak valid!");
        }
    }

    static void cariKandidat() {
        tampilkanKandidat();
        System.out.print("Masukkan nomor kandidat yang dicari: ");
        int nomorCari = scanner.nextInt();
        scanner.nextLine();

        if (nomorCari >= 1 && nomorCari <= kandidat.length) {
            Kandidat k = kandidat[nomorCari - 1];
            System.out.println("Kandidat ditemukan: " + k.nama + " dengan " + k.suara + " suara.");
        } else {
            System.out.println("Nomor kandidat tidak valid!");
        }
    }

    static void urutkanKandidat() {
        int n = kandidat.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (kandidat[j].suara < kandidat[j + 1].suara) {
                    Kandidat temp = kandidat[j];
                    kandidat[j] = kandidat[j + 1];
                    kandidat[j + 1] = temp;
                }
            }
        }
        System.out.println("Kandidat berhasil diurutkan berdasarkan suara.");
    }
}
