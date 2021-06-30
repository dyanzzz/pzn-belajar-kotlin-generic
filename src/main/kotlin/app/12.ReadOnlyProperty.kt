package app

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

fun main() {
    val nameWithLog = NameWithLog("Budianto")
    println(nameWithLog.name)
    println(nameWithLog.name)
}

class LogReadOnlyProperty(val data: String): ReadOnlyProperty<Any, String>{
    var counter = 0
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access property ${property.name} with value $data")
        counter++
        return data.uppercase() + " " + counter
    }
}

class NameWithLog(param: String){
    val name: String by LogReadOnlyProperty(param)
}