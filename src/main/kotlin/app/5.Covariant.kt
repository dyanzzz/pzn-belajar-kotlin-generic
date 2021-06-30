package app

// 4. covariant
// bisa mensubtitusi dari child ke parent
// hanya generic class generic yg menggunakan generic parameter type sebagai return type function
// artinya saat kita membuat object Contoh<String>, maka bisa disubtitusi menjadi Contoh<Any>
// menggunakan keyword out sebelum generic type Contoh<out T>
fun main() {
    val covariantString = Covariant<String>("Budi")
    val covariantAny: Covariant<Any> = covariantString
    println(covariantAny.data())

    // covariantAny.setData(100)   // tidak boleh
}

class Covariant <out T>(private val data: T){
    fun data(): T {
        return data
    }

    // tidak boleh membuat function dengan input generic covariant
    /*fun setData(param: T){
        data = param
    }*/
}