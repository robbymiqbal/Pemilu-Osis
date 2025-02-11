# Pemilu Ketua OSIS

## Deskripsi
Program ini adalah sistem pemilihan ketua OSIS berbasis Java yang memungkinkan pengguna untuk melihat daftar kandidat, memberikan suara, mencari kandidat, serta mengurutkan kandidat berdasarkan jumlah suara yang diperoleh.

## Fitur
- Menampilkan daftar kandidat ketua OSIS.
- Memberikan suara kepada kandidat berdasarkan nomor urut.
- Mencari kandidat berdasarkan nomor urut.
- Mengurutkan kandidat berdasarkan jumlah suara terbanyak.
- Sistem berbasis menu interaktif dalam Command Line Interface (CLI).

## Struktur Program
Program terdiri dari dua kelas utama:
1. **Kelas `Kandidat`**
   - Merepresentasikan kandidat dengan atribut `nama` dan `suara`.
2. **Kelas `uasalgorobby` (Program Utama)**
   - Mengelola daftar kandidat dalam array.
   - Menyediakan menu utama dan menangani input pengguna.

## Cara Menjalankan Program
1. Pastikan **Java** telah terinstal di komputer Anda.
2. Simpan kode dalam file `uasalgorobby.java`.
3. Buka terminal atau Command Prompt di direktori file.
4. Jalankan perintah berikut untuk mengompilasi program:
   ```sh
   javac uasalgorobby.java
   ```
5. Jalankan program dengan perintah:
   ```sh
   java uasalgorobby
   ```
6. Ikuti instruksi dalam menu untuk menggunakan program.

## Menu Utama
Saat program dijalankan, pengguna akan melihat menu berikut:
```
=== Pemilu Ketua OSIS ===
1. Lihat Kandidat
2. Beri Suara
3. Cari Kandidat
4. Urutkan Kandidat Berdasarkan Suara
5. Keluar
```
Pengguna dapat memilih opsi dengan memasukkan angka yang sesuai.

## Fungsi Utama
### `tampilkanKandidat()`
Menampilkan daftar kandidat beserta jumlah suara mereka.

### `beriSuara()`
- Menampilkan daftar kandidat.
- Meminta pengguna memilih nomor kandidat.
- Jika nomor valid, menambahkan suara ke kandidat.

### `cariKandidat()`
- Meminta pengguna memasukkan nomor kandidat.
- Jika valid, menampilkan informasi kandidat.

### `urutkanKandidat()`
- Menggunakan algoritma **Bubble Sort** untuk mengurutkan kandidat berdasarkan jumlah suara terbanyak.

## Teknologi yang Digunakan
- **Java** (Bahasa Pemrograman)
- **VS Code / Command Line** (IDE & CLI)

## Contoh Output
```
=== Pemilu Ketua OSIS ===
1. Lihat Kandidat
2. Beri Suara
3. Cari Kandidat
4. Urutkan Kandidat Berdasarkan Suara
5. Keluar
Pilih menu: 2

Masukkan nomor kandidat yang ingin dipilih: 1
Suara diberikan kepada Muhammad Ramdhani.
```

## Kesimpulan
- Program ini menggunakan **percabangan (`switch-case`)**, **perulangan (`do-while`)**, **fungsi terpisah**, serta **algoritma sorting**.
- Sistem berbasis angka untuk pemilihan dan pencarian kandidat membuatnya lebih mudah digunakan.

---
**Author:** Robby (UAS Algoritma)
