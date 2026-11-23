# Agenda Tugas Siswa

Aplikasi Kotlin Console untuk mencatat dan memantau tugas sekolah.
Proyek TP6 Mobile Programming, XI RPL.

## Latar Belakang dan Masalah
Siswa sering lupa atau kehilangan catatan tugas karena dicatat tidak teratur.
Aplikasi ini menyimpan tugas dan statusnya di satu tempat.

## Pengguna dan Tujuan
- Pengguna: siswa yang mencatat tugas pribadi.
- Tujuan: menambah, melihat, mencari, menandai, menghapus, dan menyimpan tugas.

## Fitur Utama
1. Tambah tugas (ID unik dan judul tidak kosong)
2. Tampilkan semua tugas beserta status
3. Cari tugas berdasarkan ID
4. Ubah status selesai/belum
5. Simpan dan muat data dari berkas
6. Hapus tugas (fitur tambahan)

## Teknologi dan Struktur Berkas
Kotlin, IntelliJ IDEA Community Edition, Git/GitHub.

| Berkas | Fungsi |
| --- | --- |
| Main.kt | Menu, input, validasi pilihan |
| Model.kt | Data class Tugas |
| TugasService.kt | Tambah, tampil, cari, ubah status, hapus |
| Penyimpanan.kt | Baca dan tulis agenda_tugas_tp6.txt |

## Cara Menjalankan
1. Clone: `git clone https://github.com/USERNAME/TP6_MiniProject_NamaSiswa.git`
2. Buka folder hasil clone di IntelliJ IDEA.
3. Buka Main.kt lalu klik Run.
4. Gunakan menu angka. Pilih 0 untuk keluar dan menyimpan data.

## Contoh Penggunaan atau Output
```
=== AGENDA TUGAS ===
1. Tambah tugas
...
Pilihan: 2
1. T01 | Belajar Kotlin | Selesai
```

## Hasil Pengujian
12 skenario diuji (data normal, duplikat, kosong, tidak ditemukan,
pilihan salah, simpan-muat, berkas rusak, hapus, nilai batas).
Semua berstatus Berhasil setelah perbaikan validasi ID dengan spasi.

## Pembagian Tugas dan Branch
| Anggota | Tugas | Branch |
|---------| --- | --- |
| Jessen  | Menu dan dokumentasi | fitur-menu |
| Siti    | Layanan tugas dan pengujian | fitur-tugas |
| Andi    | Penyimpanan berkas dan fitur hapus | fitur-penyimpanan, fitur-hapus |

## Riwayat Pengembangan Ringkas
Struktur awal, README, menu utama, layanan tugas, penyimpanan,
fitur hapus, perbaikan validasi ID, dan dokumentasi akhir.

## Keterbatasan dan Rencana Pengembangan
- Judul tidak boleh mengandung tanda titik koma (;).
- Belum ada tanggal tenggat dan pengurutan.
- Rencana: filter status dan statistik tugas.