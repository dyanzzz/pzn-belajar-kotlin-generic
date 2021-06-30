package app

import data.Function

// 2. generic function
// generic parameter type, hanya bisa digunakan di function tsb, tidak bisa digunakan di luar function
// cocok untuk membuat function generic tanpa merubah declarasi class
fun main() {
    val function = Function("Budi")
    // memanggil generic function string
    function.sayHello<String>("Eko")

    // memanggil generic function int
    function.sayHello<Int>(20)
}