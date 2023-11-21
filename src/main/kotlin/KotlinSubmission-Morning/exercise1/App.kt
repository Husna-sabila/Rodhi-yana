package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
    fun myProfile() {
        val Namadepan: String = "Rodhi"
        val Namabelakang: String = "Yana"
        val age: Int = 21
        val status: Boolean = true

        println("Nama: $Namadepan $Namabelakang")
        println("Umur: $age tahun")
        println("Status Single: $status")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Nama grup:$groupId")
    println("Anggota Group: $groupMember")
    println("sesi: $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val groupMembers = listOf("Liza", "Ary", "Bang Izzud", "Kak Dika", "Kak Randi", "Rodhiyana")
    println("Daftar Anggota Group; $groupMembers")
    return groupMembers
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Kak Peja","Kak Ahmad")
    val countOfGroup = arrayOf("Liza", "Ary", "Bang Izzud", "Kak Dika", "Kak Randi", "Rodhiyana")

    val totalMember = countOfGroup.size
    println("Total Member Group: $totalMember")
    val totalMentors = mentor.size
    println("Total Mentor Group : $totalMentors")
    return totalMember + totalMentors
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("EnviGrowth", listOf("Liza", "Ary", "Bang Izzud", "Kak Dika", "Kak Randi", "Rodhiyana"), "B Morning")

}