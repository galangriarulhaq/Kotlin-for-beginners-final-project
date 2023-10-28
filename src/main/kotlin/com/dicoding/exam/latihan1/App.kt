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

package com.dicoding.exam.latihan1

/**
 *  TODO 1
 *  Sesuaikan fungsi di bawah ini dengan kode untuk mengecek apakah parameter number
 *  merupakan angka genap
 */
fun isEvenNumber(number: Int) = number % 2 == 0

/**
 *  TODO 2
 *  Sesuaikan fungsi di bawah ini dengan kode untuk mengecek apakah parameter number
 *  lebih dari 5
 */
fun moreThanFive(number: Int) = number > 5

/**
 *  TODO 3
 *  Sesuaikan fungsi di bawah ini agar dapat menghasilkan nilai akhir dengan
 *  rumus:
 *
 *      param * ( param + 10 )
 */
fun result(number: Int) = number * (number + 10)

fun main() {
    val listNumber = 1.rangeTo(100)
    for (number in listNumber) {
        if (isEvenNumber(number)) continue

        if (moreThanFive(number)) break

        val result = result(number)
        println("range result is $result")
    }
}
