import com.dicoding.exam.latihan1.isEvenNumber
import com.dicoding.exam.latihan1.moreThanFive
import com.dicoding.exam.latihan2.calculate
import com.dicoding.exam.latihan2.result
import com.dicoding.exam.latihan3.checkType
import com.dicoding.exam.latihan4.vehicle
import com.dicoding.exam.latihan5.multiple
import com.dicoding.exam.latihan5.sum
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.system.measureTimeMillis

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

class ExamTestMain : Spek({
    group("Pengujian otomatis latihan") {
        describe("Pengecekkan Latihan 1") {
            it("Latihan 1") {
                isEvenNumber(2).returnTrue(errMessage = "Jika argumennya adalah 2, fungsi isEvenNumber() seharusnya mengembalikkan nilai true")
            }

            it("Latihan 1") {
                isEvenNumber(6).returnTrue(errMessage = "Jika argumennya adalah 6, fungsi isEvenNumber() seharusnya mengembalikkan nilai true")
            }

            it("Latihan 1") {
                isEvenNumber(7).returnFalse(errMessage = "Jika argumennya adalah 7, fungsi isEvenNumber() seharusnya mengembalikkan nilai false")
            }

            it("Latihan 1") {
                isEvenNumber(1).returnFalse(errMessage = "Jika argumennya adalah 1, fungsi isEvenNumber() seharusnya mengembalikkan nilai false")
            }

            for (number in 1..99 step 2) {
                it("Latihan 1") {
                    isEvenNumber(number).returnFalse(errMessage = "Jika argumennya adalah $number, fungsi isEvenNumber() seharusnya mengembalikkan nilai false")
                }
            }

            for (number in 0..100 step 2) {
                it("Latihan 1") {
                    isEvenNumber(number).returnTrue(errMessage = "Jika argumennya adalah $number, fungsi isEvenNumber() seharusnya mengembalikkan nilai true")
                }
            }

            it("Latihan 1") {
                moreThanFive(1).returnFalse(errMessage = "Jika argumennya adalah 1, fungsi moreThanFive() seharusnya mengembalikkan nilai false")
            }

            it("Latihan 1") {
                moreThanFive(3).returnFalse(errMessage = "Jika argumennya adalah 3, fungsi moreThanFive() seharusnya mengembalikkan nilai false")
            }

            it("Latihan 1") {
                moreThanFive(5).returnFalse(errMessage = "Jika argumennya adalah 5, fungsi moreThanFive() seharusnya mengembalikkan nilai false")
            }

            it("Latihan 1") {
                moreThanFive(10).returnTrue(errMessage = "Jika argumennya adalah 10, fungsi moreThanFive() seharusnya mengembalikkan nilai true")
            }

            it("Latihan 1") {
                moreThanFive(30).returnTrue(errMessage = "Jika argumennya adalah 30, fungsi moreThanFive() seharusnya mengembalikkan nilai true")
            }

            it("Latihan 1") {
                val expect = com.dicoding.exam.latihan1.result(20)
                assertEqualsWith(
                    expected = expect,
                    actual = 600,
                    errMessage = "Jika argumennya adalah 20, fungsi result() seharusnya mengembalikkan nilai 600"
                )
            }
        }

        describe("Latihan 2") {
            it("Latihan 2") {
                val result = calculate(101, 52, 99)
                assertEqualsWith(
                    expected = result,
                    actual = 54,
                    errMessage = "Jika argumen untuk parameter valueA adalah `101`, valueB adalah `52`, dan valueC adalah `99`, fungsi calculate() seharusnya mengembalikkan nilai 54"
                )
            }

            it("Latihan 2") {
                val result = calculate(101, 52, null)
                assertEqualsWith(
                    expected = result,
                    actual = 103,
                    errMessage = "Jika argumen untuk parameter valueA adalah `101`, valueB adalah `52`, dan valueC adalah `null`, fungsi calculate() seharusnya mengembalikkan nilai 103"
                )
            }

            it("Latihan 2") {
                val result = result(103)
                assertEqualsWith(
                    expected = result,
                    actual = "Result is 103",
                    errMessage = "Jika argumennya adalah 103, fungsi result() seharusnya mengembalikkan pesan `Result is 103`"
                )
            }
        }

        describe("Pengecekkan latihan 3") {
            it("Latihan 3") {
                val result = checkType(50)
                assertEqualsWith(
                    expected = result,
                    actual = "Yes! it's Integer",
                    errMessage = "Jika argumennya adalah `50`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's Integer`"
                )
            }

            it("Latihan 3") {
                val result = checkType("Dicoding Indonesia")
                assertEqualsWith(
                    expected = result,
                    actual = "Yes! it's String",
                    errMessage = "Jika argumennya adalah `Dicoding Indonesia`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's String`"
                )
            }

            it("Latihan 3") {
                val result = checkType(1.0)
                assertEqualsWith(
                    expected = result,
                    actual = "Yes! it's Double",
                    errMessage = "Jika argumennya adalah `1.0`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's Double`"
                )
            }

            it("Latihan 3") {
                val result = checkType(listOf<String>())
                assertEqualsWith(
                    expected = result,
                    actual = "Yes! it's List",
                    errMessage = "Jika argumennya adalah `listOf<String>()`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's List`"
                )
            }

            it("Latihan 3") {
                val result = checkType(mapOf<String, String>())
                assertEqualsWith(
                    expected = result,
                    actual = "Yes! it's Map",
                    errMessage = "Jika argumennya adalah `mapOf<String, String>()`, fungsi checkType() seharusnya mengembalikkan pesan `Yes! it's Map`"
                )
            }
        }

        describe("Pengecekkan latihan 4") {
            it("Latihan 4") {
                val vehicle = vehicle()
                (vehicle is Map).returnTrue("Fungsi vehicle() seharusnya mengembalikkan nilai dengan tipe data Map<>")
            }

            it("Latihan 4") {
                val vehicle: Map<String, String> = vehicle()
                (vehicle["type"] != null && vehicle["type"] == "motorcycle").returnTrue("Nilai kembalian vehicle() seharusnya terdapat key `type` dengan nilai `motorcycle`")
            }

            it("Latihan 4") {
                val vehicle: Map<String, String> = vehicle()
                (vehicle["maxSpeed"] != null && vehicle["maxSpeed"] == "230Km/s").returnTrue("Nilai kembalian vehicle() seharusnya terdapat key `maxSpeed` dengan nilai `230Km/s`")
            }

            it("Latihan 4") {
                val vehicle: Map<String, String> = vehicle()
                (vehicle["maxTank"] != null && vehicle["maxTank"] == "100Ltr").returnTrue("Nilai kembalian vehicle() seharusnya terdapat key `maxTank` dengan nilai `100Ltr`")
            }
        }

        describe("Pengecekkan latihan 5") {
            it("Latihan 5") {
                runBlocking {
                    val executionTime = measureTimeMillis {
                        sum(10, 10)
                    }

                    (executionTime in 3001..3499).returnTrue("Pemanggilan fungsi sum() seharusnya terdapat jeda waktu minimal 3 detik")
                }
            }

            it("Latihan 5") {
                runBlocking {
                    val result = async { sum(5, 5) }
                    (result.await() == 10).returnTrue("Jika argumen untuk parameter a adalah 5 dan b adalah 5, fungsi sum() seharusnya mengembalikkan nilai 10")
                }
            }

            it("Latihan 5") {
                runBlocking {
                    val result = async { sum(100, 7) }
                    (result.await() == 107).returnTrue("Jika argumen untuk parameter a adalah 100 dan b adalah 7, fungsi sum() seharusnya mengembalikkan nilai 107")
                }
            }

            it("Latihan 5") {
                runBlocking {
                    val executionTime = measureTimeMillis {
                        multiple(10, 10)
                    }

                    (executionTime in 2001..2499).returnTrue("Pemanggilan fungsi multiple() seharusnya terdapat jeda waktu minimal 2 detik")
                }
            }

            it("Latihan 5") {
                runBlocking {
                    val result = async { multiple(6, 6) }
                    (result.await() == 36).returnTrue("Jika argumen untuk parameter a adalah 6 dan b adalah 6, fungsi multiple() seharusnya mengembalikkan nilai 36")
                }
            }

            it("Latihan 5") {
                runBlocking {
                    val result = async { multiple(5, 5) }
                    (result.await() == 25).returnTrue("Jika argumen untuk parameter a adalah 5 dan b adalah 5, fungsi multiple() seharusnya mengembalikkan nilai 25")
                }
            }
        }
    }
})
