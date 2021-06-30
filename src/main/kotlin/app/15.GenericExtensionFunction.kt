package app

// 15 generic extension function
fun main() {
    val data1 = Data(1)
    val data2 = Data("budi")

    // data1.print()    // error karena data 1 adalah integer
    data2.print()
    data1.printInt()
}

class Data<T>(val data: T)

fun Data<String>.print(){
    val data: String = this.data
    println(data)
}

fun Data<Int>.printInt(){
    val data: Int = this.data
    println(data)
}
