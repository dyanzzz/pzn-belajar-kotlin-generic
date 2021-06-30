package data

// mendefined generic type didalam diamond tag/<> dengan huruf T/Type
// setup tipedata firstdata dengan generic T
class MyData<T, U>(val firstData: T, val secondData: U) {
    // setup return type dengan generic type yang sama
    fun getData(): T = firstData

    fun getSecond(): U = secondData

    fun printlnData(){
        println("FirstData is $firstData and secondData $secondData")
    }
}