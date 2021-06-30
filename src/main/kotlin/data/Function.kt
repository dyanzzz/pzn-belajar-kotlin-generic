package data

class Function(val name: String) {

    // generic T disini scopenya hanya pada function saja
    // tapi jika class memiliki generic functuin juga, generic untuk functionnya bisa diturunkan
    // tapi jika di override juga bisa dengan cara memberikan diamond tag/<> keyword setelang fun => <T>
    fun <T> sayHello(param: T){
        println("Hello $param, my name is $name")
    }

}