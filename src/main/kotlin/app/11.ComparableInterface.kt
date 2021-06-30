package app

import data.Fruit

// 11. Comparable Interface
// sebelumnya jika kita menggunakan operator perbandingan == dan != maka, maka akan menggunakan equals sebagai implementasinya
// namun bagaimana jika kita ingin menggunakan operator yg lainnya seperti >,>=,<,<=
// operator perbandingan tsb bisa dilakukan jika object kita mewarisi interface generic Comparable
fun main() {
    val fruit1 = Fruit("Jeruk", 10)
    val fruit2 = Fruit("mangga", 30)

    println(fruit1 > fruit2)
    println(fruit1 >= fruit2)
    println(fruit1 < fruit2)
    println(fruit1 <= fruit2)
}