package app

// 10. type erasure
// pengecekan kotlin generic pada saaat compile time & menghiraukan pengecekan pada saat runtime
// atau tidak ada pengecekan generic type pada saat runtime, karena binnary code sudah diubah menjadi Any
// type erasure menjadikan informasi generic yg dibuat akan hilang ketika kode program kita sudah di compaile menjadi binnary file
// compiler akan mengubah generic parameter type menjadi type Any(atau object jika di java)
fun main() {
    val data1 = TypeErasure<String>("Budi")
    val dataString: String = data1.getData()
    println(dataString)

    //val data2: TypeErasure<Int> = data1 as TypeErasure<Int>
    //val dataInt: Int = data2.getData()    // error, karena string dipaksa untuk menjadi integer
    //println(dataInt)
}

class TypeErasure<T>(param: T){
    private val data: T = param

    fun getData(): T = data
}