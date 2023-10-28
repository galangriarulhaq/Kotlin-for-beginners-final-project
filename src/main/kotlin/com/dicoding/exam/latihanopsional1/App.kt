/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah kode yang berada di dalam fungsi main()                                     *
 *          2. Mengubah atau menghapus kode yang sudah ada secara default                           *
 *          3. Membuat fungsi baru yang bukan merupakan tugas latihan                               *
 *          4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

package com.dicoding.exam.latihanopsional1

/**
 *  TODO
 *  Lengkapi fungsi di bawah dengan ketentuan sebagai berikut:
 *  - Fungsi menerima 1 sampai 10 input bertipe integer tetapi hanya boleh ditampung dalam satu parameter, yaitu `numbers`.
 *  - Fungsi mengembalikan jumlah dari maksimal 3 angka yang paling besar dalam bentuk integer.
 *
 *  Contoh:
 *  Input = sumOfBigThree(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) -> Output = 27 | Penjelasan: 10 + 9 + 8 = 27
 *  Input = sumOfBigThree(22, 20, 21, 25, 24) -> Output = 71 | Penjelasan: 25 + 24 + 22 = 71
 *  Input = sumOfBigThree(100, 1000, 30, 1) -> Output = 1130 | Penjelasan: 1000 + 100 + 30 = 1130
 *  Input = sumOfBigThree(22, 22, 33, 22) -> Output = 77 | Penjelasan: 33 + 22 + 27 = 77
 *
 *  Modul terkait: Functional Programming dan Collections.
 */

fun sumOfBigThree(vararg numbers: Int): Int {
    val sortedNumbers = numbers.sortedDescending()
    val topThree = sortedNumbers.take(3)
    return topThree.sum()
}

fun main() {
    println(sumOfBigThree(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) == 27)
    println(sumOfBigThree(22, 20, 21, 25, 24) == 71)
    println(sumOfBigThree(100, 1000, 30, 1) == 1130)
    println(sumOfBigThree(22, 22, 33, 22) == 77)
}
