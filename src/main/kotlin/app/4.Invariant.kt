package app

// 3. Invariant
// secara default generic parameter type akan bersifat INVARIANT
// tidak boleh disubtitusi dengan subtype(child) atau supertype(parent)
// artinya saat kita membuat object Contoh<String>, maka tidak sama dengan Contoh<Any>,
    // begitupun sebaliknya, saat membuat object Contoh<Any>, maka tidak sama dengan Contoh<String>
fun main() {
    val invariantString = Invariant("String")
    //val invariantAny: Invariant<Any> = invariantString  // error beda type, yg seharusnya string
    //invariantAny.data = 100 // bahaya, karena akan error
}

class Invariant<T>(var data: T)