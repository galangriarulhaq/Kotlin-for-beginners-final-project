import com.dicoding.exam.latihanopsional1.sumOfBigThree
import com.dicoding.exam.latihanopsional2.minAndMax
import com.dicoding.exam.latihanopsional3.manipulateString
import com.dicoding.exam.latihanopsional4.getMiddleCharacters
import com.dicoding.exam.latihanopsional5.concatString
import org.junit.jupiter.api.Assertions.fail
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import java.io.File
import java.io.IOException
import java.nio.file.Files
import kotlin.random.Random

/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah kode yang berada di dalam kelas Test                                        *
 *          2. Mengubah atau menghapus kode yang sudah ada secara default                           *
 *          3. Membuat fungsi baru yang bukan merupakan tugas latihan                               *
 *          4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

class ExamTestOptional : Spek({
    group("Pengujian otomatis latihan") {
        describe("Pengecekan Latihan Opsional 1") {
            it("Latihan Opsional 1") {
                val result = sumOfBigThree(2, 4, 9, 2, 6, 3, 4, 9)
                assertEqualsWith(
                    actual = result,
                    expected = 24,
                    errMessage = "Jika argumennya adalah 2,4,9,2,6,3,4,9, fungsi sumOfBigThree() seharusnya mengembalikkan nilai 24"
                )
            }

            it("Latihan Opsional 1") {
                val result = sumOfBigThree(123, 321, 234, 567, 908, 12)
                assertEqualsWith(
                    actual = result,
                    expected = 1796,
                    errMessage = "Jika argumennya adalah 123, 321, 234,567,908,12, fungsi sumOfBigThree() seharusnya mengembalikkan nilai 1796"
                )
            }

            it("Latihan Opsional 1") {
                val result = sumOfBigThree(4, 2, 1, 23, 4, 54, 7, 88, 8)
                assertEqualsWith(
                    actual = result,
                    expected = 165,
                    errMessage = "Jika argumennya adalah 4,2,1,23,4,54,7,88,8, fungsi sumOfBigThree() seharusnya mengembalikkan nilai 165"
                )
            }

            it("Latihan Opsional 1") {
                val randInt1 = (10..88).random()
                val randInt2 = (10..88).random()
                val randInt3 = (10..88).random()

                val actual = sumOfBigThree(1, randInt1, randInt2, randInt3, 2)
                val expected = randInt1 + randInt2 + randInt3

                assertEqualsWith(
                    actual = actual,
                    expected = expected,
                    errMessage = "Jika argumennya adalah 1, $randInt1, $randInt2, $randInt3, 2, fungsi sumOfBigThree() seharusnya mengembalikkan nilai $expected"
                )
            }
        }

        describe("Pengecekan Latihan Opsional 2") {
            it("Latihan Opsional 2") {
                val result = minAndMax(985684579)
                assertEqualsWith(
                    actual = result,
                    expected = 13,
                    errMessage = "Jika argumennya adalah '985684579', fungsi minAndMax() seharusnya mengembalikkan nilai '13'"
                )
            }

            it("Latihan Opsional 2") {
                val result = minAndMax(1111111)
                assertEqualsWith(
                    actual = result,
                    expected = 2,
                    errMessage = "Jika argumennya adalah '1111111', fungsi minAndMax() seharusnya mengembalikkan nilai '2'"
                )
            }

            it("Latihan Opsional 2") {
                val result = minAndMax(6423654)
                assertEqualsWith(
                    actual = result,
                    expected = 8,
                    errMessage = "Jika argumennya adalah '6423654', fungsi minAndMax() seharusnya mengembalikkan nilai '8'"
                )
            }
        }

        describe("Pengecekan Latihan Opsional 3") {
            it("Latihan Opsional 3") {
                repeat(2) {
                    val randInt = (1..100).random()
                    val string = "dicoding"
                    assertEqualsWith(
                        actual = manipulateString(string, randInt),
                        expected = string + randInt,
                        errMessage = "Jika argumennya adalah '$string' dan '$randInt', fungsi manipulateString() seharusnya mengembalikkan nilai ${
                            string.plus(randInt)
                        }"
                    )
                }
            }

            it("Latihan Opsional 3") {
                repeat(2) {
                    val randInt = (1..100).random()
                    val string = "dicoding0101"
                    assertEqualsWith(
                        actual = manipulateString(string, randInt),
                        expected = "dicoding" + (randInt.times(101)),
                        errMessage = "Jika argumennya adalah '$string' dan '$randInt', fungsi manipulateString() seharusnya mengembalikkan nilai ${
                            "dicoding".plus(randInt.times(101))
                        }"
                    )
                }
            }
        }

        describe("Pengecekan Latihan Opsional 4") {
            it("Latihan Opsional 4") {
                val result = getMiddleCharacters("Dicoding")
                assertEqualsWith(
                    actual = result,
                    expected = "od",
                    errMessage = "Jika argumennya adalah 'Dicoding', fungsi getMiddleCharacters() seharusnya mengembalikkan nilai 'od'"
                )
            }

            it("Latihan Opsional 4") {
                val result = getMiddleCharacters("DicodingIndonesia")
                assertEqualsWith(
                    actual = result,
                    expected = "I",
                    errMessage = "Jika argumennya adalah 'DicodingIndonesia', fungsi getMiddleCharacters() seharusnya mengembalikkan nilai 'I'"
                )
            }

            it("Latihan Opsional 4") {
                val result = getMiddleCharacters("A")
                assertEqualsWith(
                    actual = result,
                    expected = "A",
                    errMessage = "Jika argumennya adalah 'A', fungsi getMiddleCharacters() seharusnya mengembalikkan nilai 'A'"
                )
            }
        }

        describe("Pengecekan Latihan Opsional 5") {
            it("Latihan Opsional 5") {
                try {
                    Files.readAllLines(File("src/main/kotlin/com/dicoding/exam/latihanopsional5/App.kt").toPath())
                        .filterIndexed { index, _ -> index >= 39 }.forEach { line ->
                            assertEqualsWith(
                                actual = "fun" in line,
                                expected = false,
                                errMessage = "concatString() tidak boleh menggunakan keyword `fun`"
                            )
                            assertEqualsWith(
                                actual = "{" in line,
                                expected = false,
                                errMessage = "concatString() tidak boleh mengandung karakter `{`"
                            )
                            assertEqualsWith(
                                actual = "}" in line,
                                expected = false,
                                errMessage = "concatString() tidak boleh menggunakan keyword `}`"
                            )
                        }
                } catch (e: IOException) {
                    fail("Failed to read the source file.")
                }
            }

            it("Latihan Opsional 5") {
                val result = concatString("Hello", "Dicoding")
                assertEqualsWith(
                    actual = result,
                    expected = "HelloDicoding",
                    errMessage = "Jika argumennya adalah 'Hello' dan 'Dicoding', fungsi concatString() seharusnya mengembalikkan nilai HelloDicoding"
                )
            }

            it("Latihan Opsional 5") {
                val r = Random(System.currentTimeMillis())
                repeat(3) {
                    val string1 = r.nextInt().toString(2)
                    val string2 = r.nextInt().toString(2)
                    assertEqualsWith(
                        actual = concatString(string1, string2),
                        expected = string1 + string2,
                        errMessage = "Jika argumennya adalah '$string1' dan '$string2', fungsi concatString() seharusnya mengembalikkan nilai ${
                            string1.plus(string2)
                        }"
                    )
                }
            }
        }
    }
})
