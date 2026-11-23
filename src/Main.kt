fun main() {
    var pilihan: Int

    do {
        println("\n=== AGENDA TUGAS ===")
        println("1. Tambah tugas")
        println("2. Tampilkan tugas")
        println("3. Cari tugas")
        println("4. Ubah status")
        println("5. Simpan data")
        println("0. Keluar")
        print("Pilihan: ")
        pilihan = readln().toIntOrNull() ?: -1

        when (pilihan) {
            in 1..5 -> println("Fitur nomor $pilihan belum tersedia")
            0 -> println("Program selesai")
            else -> println("Pilihan tidak tersedia")
        }
    } while (pilihan != 0)
}