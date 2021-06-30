package app

// 5. contravariant
// kebalikan dari covariant
// hanya bisa digunakan untuk set data/function
fun main() {
    val contravariantAny = Contravariant<Any>()
    val contravariantString: Contravariant<String> = contravariantAny
    contravariantString.sayhello("budi")
}

class Contravariant<in T>(){
    fun sayhello(name: T){
        println("Hello $name")
    }

    // tidak boleh untuk menangani return value pada function
    /*fun getName(): T {
        return "tes"
    }*/
}