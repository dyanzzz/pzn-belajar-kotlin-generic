package app

import data.MyData

// 1. Generic Type
// merupakan class atau interface yang memiliki parameter type (mungkin lebih enak jika disebut dengan generic type)
// tidak ada ketentuan dalam membuat generic type, namun biasa menggunakan 1 karakter sebagai generic parameter
    // artinya bisa menggunakan keyword apapun yg penting masih didalam diamond tag / <>
// nama generic yg biasa digunakan
    // E => Element (Biasa digunakan pada collection/list array atau struktur data
    // K => Key
    // N => Number
    // T => Type
    // V => Value
    // S, U, V etc. -2nd, 3rd, 4th types
fun main() {
    val myDataString: MyData<String, Int> = MyData("Budi", 200)
    myDataString.printlnData()

    val myDataInt: MyData<Int, Boolean> = MyData(2000, true)
    myDataInt.printlnData()
    val getData = myDataInt.getSecond()
    println(getData)

}