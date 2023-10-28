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

package com.dicoding.exam.latihan2

/**
 *  TODO 1
 *  Sesuaikan fungsi di bawah ini agar dapat mengembalikkan nilai dengan rumus
 *  perhitungan berikut:
 *
 *      valueA + (valueB - valueC)
 *
 *  Jika valueC bernilai null, silakan tetapkan nilai 50 sebagai nilai default-nya
 */
fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    val c = valueC?: 50
    return valueA + (valueB - c)
}

/**
 *  TODO 2
 *  Sesuaikan fungsi di bawah ini agar dapat mengembalikkan text seperti berikut:
 *
 *      Result is ${result}
 */
fun result(result: Int): String {
    return "Result is ${result}"
}

fun main() {
    val valueA = 101
    val valueB = 52
    val valueC = 99

    val resultA = calculate(valueA, valueB, valueC)
    val resultB = calculate(valueA, valueB, null)

    println(
        """
        ${result(resultA)}
        ${result(resultB)}
        """.trimIndent()
    )
}
