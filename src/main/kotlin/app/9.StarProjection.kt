package app

// 9. star projection
// kadang kita tidak peduli dengan generic parameter type pada object
    // misalny, jika hanya ingin mengambil panjnag Array<T> atau generic T, kita tidak peduli dengan genericnya
// kita bisa menggunakan star projection untuk mengganti generic parameter type dengan karakter *(star/bintang)
fun main() {
    val arrayInt = arrayOf(2,3,4,5,6,7)
    val arrayString = arrayOf("Dyan", "Tri", "Budi", "Anto")

    displayLength(arrayInt)
    displayLength(arrayString)
}

// menggunakan star projecttion, karena tidak butuh mengambil datanya, tapi butuh akses hal lain dari object tsb
fun displayLength(array: Array<*>){
    println("Length array is ${array.size}")
}