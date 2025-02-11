Penjelasan Program "Pemilu Ketua OSIS"
Program ini adalah sistem pemilihan ketua OSIS berbasis Java yang memungkinkan pengguna untuk melihat kandidat, memberikan suara, mencari kandidat, serta mengurutkan kandidat berdasarkan jumlah suara yang diperoleh.

1. Struktur Program
Program ini terdiri dari:

* Class Kandidat
- Digunakan untuk merepresentasikan kandidat ketua OSIS.
- Setiap kandidat memiliki atribut nama dan suara untuk menyimpan jumlah suara yang diperoleh.

* Class uasalgorobby (Program Utama)
- Menyimpan daftar kandidat dalam array kandidat.
- Menggunakan Scanner untuk menerima input dari pengguna.
- Mengelola proses pemilihan melalui menu interaktif.

2. Fungsi-Fungsi Utama
a) tampilkanKandidat()
- Menampilkan daftar kandidat beserta jumlah suara mereka.

b) beriSuara()
- Memungkinkan pengguna untuk memberikan suara kepada kandidat berdasarkan nomor urut.
- Mengecek apakah nomor kandidat valid. Jika valid, suara bertambah, jika tidak, muncul pesan error.

c) cariKandidat()
- Memungkinkan pengguna untuk mencari kandidat berdasarkan nomor urut.
- Jika nomor kandidat valid, menampilkan informasi kandidat. Jika tidak, muncul pesan error.

d) urutkanKandidat()
- Menggunakan algoritma Bubble Sort untuk mengurutkan kandidat berdasarkan jumlah suara dari terbanyak ke tersedikit.

3. Logika Program
a) Program menampilkan menu utama dan meminta pengguna memilih opsi.
b) Pengguna dapat:
- Melihat daftar kandidat.
- Memberikan suara kepada kandidat dengan memasukkan nomor urut.
- Mencari kandidat berdasarkan nomor urut.
- Mengurutkan kandidat berdasarkan jumlah suara.
- Keluar dari program.

c) Program terus berjalan dalam perulangan do-while sampai pengguna memilih opsi keluar.


Kesimpulan
Program ini menggunakan percabangan (switch-case), perulangan (do-while), fungsi-fungsi terpisah, serta algoritma sorting (Bubble Sort).
Sistem berbasis angka untuk pemilihan dan pencarian kandidat membuat program ini lebih mudah digunakan.
