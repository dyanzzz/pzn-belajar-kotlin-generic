package app

// 6. generic constraint
// generic typenya hanya bisa mendefined classnya/turunannya
// jadi tidak bisa membuat object diluar generic typenya
fun main() {
    //val data1 = Company(Employee())   // error canSayHello not implement
    //val data2 = Company(Manager())    // error canSayHello not implement
    val data3 = Company(VicePresident())
    // val data4 = Company("budi")  // error karena string bukan bagian dari class company dan turunannya / string not implement

}

interface CanSayHello{
    fun sayHello(name: String)
}

open class Employee

class Manager: Employee()

// interface tidak bisa diperikan properties/parameter
class VicePresident : Employee(),CanSayHello{
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

class Company<T>(val employee: T) where T : Employee, T : CanSayHello