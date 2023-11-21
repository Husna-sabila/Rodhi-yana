package id.infinitelearning.KotlinSubmission.exercise4

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
import java.io.File
import java.io.FileNotFoundException

fun main() {
    try {
        val file = File("C:\\Users\\LENOVO\\Downloads\\rodhiyana-cantik.txt")
        val content = readFile(file)
        println("Isi file: $content")
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan.")
    } catch (e: Exception) {
        println("Error: Terjadi kesalahan saat membaca file")
    }
}

fun readFile(file: File): String {
    return file.readText()
}
