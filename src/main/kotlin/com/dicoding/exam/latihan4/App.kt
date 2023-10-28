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

package com.dicoding.exam.latihan4

/**
 *  TODO
 *  Lengkapi inisialisasi fungsi dengan nilai kembalian Map di bawah ini dengan nilai key-value berikut:
 *
 *  key: type
 *  value: motorcycle
 *
 *  key: maxSpeed
 *  value: 230Km/s
 *
 *  key: maxTank
 *  value: 100Ltr
 *
 */
fun vehicle() = mapOf<String, String>(
    "type" to "motorcycle",
    "maxSpeed" to "230Km/s",
    "maxTank" to "100Ltr"
)

fun main() {
    println(
        """
        My Map Result:
        ${vehicle()}
        """.trimIndent()
    )
}
