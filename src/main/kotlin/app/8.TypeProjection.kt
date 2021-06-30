package app

// type projection
// sulitnya menentukan covariant(out) dan contravariant(in) di function parameter
fun main() {
    val container1 = Container("Budi")
    val container2: Container<Any> = Container("Eko")

    copyContainer(container1, container2)

    println(container1.data)
    println(container2.data)
}

// <T> disini adalah invariant
class Container<T>(var data: T)

// dengan keyword out, memaksa type data menjadi covariant
// dan dengan keyword in, memaksa type data menjadi contravariant
fun copyContainer(from: Container<out Any>, to: Container<in Any>){
    //from.data = "asd"   // error, karena from covariant itu type datanya container dengan generic type out, hanya bisa membaca
    //to.data = "qwe"     // tidak error, karena contravariant, bisa digunakan untuk menulis
    to.data = from.data
}