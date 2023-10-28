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

package com.dicoding.exam.latihanopsional3

/**
 *  TODO
 *  Lengkapi fungsi di bawah dengan ketentuan sebagai berikut:
 *  - Fungsi menerima input string dan integer dengan rentang 1-100.
 *  - Fungsi harus mengembalikan string dengan ketentuan:
 *      - Jika string mengandung angka, maka kalikan angka pada string dengan angka yang diinput.
 *        Kemudian gabungkan string yang diinput dengan hasil kali tersebut.
 *      - Jika string tidak mengandung angka, maka gabungkan string yang diinput dengan angka yang dinput.
 *
 *  Contoh:
 *  Input = manipulateString("dicoding123", 10) -> Output = dicoding1230 | Penjelasan: string mengandung angka 123. 123*10 = 1230 -> dicoding1230
 *  Input = manipulateString("Dicoding000010", 100) -> Output = Dicoding1000 | Penjelasan: string mengandung angka 000010. Empat 0 di awal tidak dianggap, jadi 10 *100 = 1000 -> Dicoding1000
 *  Input =  manipulateString("dicoding", 100) -> Output = dicoding100 | Penjelasan: string tidak mengandung angka. Langsung gabungkan dicoding dengan 100 -> dicoding100
 *
 *  Modul terkait: Kotlin Fundamental & Collections
 */

fun manipulateString(str: String, int: Int): String {
    if (str.length > 100 || int > 100) {
        throw IllegalArgumentException("input string dan integer harus dengan rentang 1-100")
    }
    val digits = str.filter { it.isDigit() }.toIntOrNull() ?: 0
    val nonDigits = str.filter { !it.isDigit() }
    if(digits == 0){
        val result = nonDigits + int
        return result
    }else{
        val result = nonDigits + (digits * int)
        return result
    }
}

fun main() {
    println(manipulateString("Dicoding000010", 100) == "Dicoding1000")
    println(manipulateString("dicoding", 99) == "dicoding99")
    println(manipulateString("dicoding123", 10) == "dicoding1230")
}
