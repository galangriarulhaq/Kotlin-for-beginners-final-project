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

package com.dicoding.exam.latihanopsional4

/**
 *  TODO
 *  Lengkapi fungsi di bawah dengan ketentuan sebagai berikut:
 *  - Fungsi menerima input string dengan panjang karakter 1-100.
 *  - Fungsi harus mengembalikan karakter yang ditengah dari string yang diinput.
 *      - Jika panjang string bernilai genap, maka yang dikembalikan adalah 2 karakter.
 *      - Jika panjang string bernilai ganjil, maka yang dikembalikan adalah 1 karakter.
 *
 *  Contoh:
 *  Input = getMiddleCharacters("dicoding") -> Output = od | Penjelasan: panjang string "dicoding" adalah 8 (genap) dan dua karakter paling tengah adalah "od"
 *  Input = getMiddleCharacters("dicodingindonesia")  -> Output = i | Penjelasan: panjang string "dicodingindonesia" adalah 17 (ganjil) dan satu karakter paling tengah adalah "i"
 *  Input = getMiddleCharacters("A")  -> Output = A | Penjelasan: panjang string "A" adalah 1 (ganjil) dan satu karakter paling tengah adalah "A"
 *
 *  Hint:  Kotlin Fundamental & Collections
 *
 */

fun getMiddleCharacters(string: String): String {
    val length = string.length
    if (length > 100) {
        throw IllegalArgumentException("input string harus dengan rentang 1-100")
    }
    return when {
        length % 2 == 0 -> string.substring(length / 2 - 1, length / 2 + 1)
        else -> string[length / 2].toString()
    }
}

fun main() {
    println(getMiddleCharacters("dicodingindonesia") == "i")
    println(getMiddleCharacters("dicoding") == "od")
    println(getMiddleCharacters("A") == "A")
}
