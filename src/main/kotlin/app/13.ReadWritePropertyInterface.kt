package app

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {
    val person = Person("Budi")

    println(person.name)

    person.name = "Anto"

    println(person.name)
}

// any dimaksudkan agar semua owner dapat menggunakannya
class StringLogReadWriteProperty(var data: String): ReadWriteProperty<Any, String>{
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Yout get data ${property.name} is $data")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("You set data ${property.name} from $data to $value")
        data = value
    }
}

class Person(param: String){
    var name: String by StringLogReadWriteProperty(param)
}
