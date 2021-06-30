package app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

fun main() {
    val car = Car("Toyota", 2020)

    car.brand = "Honda"
    println(car.brand)

    car.year = 2021
    println(car.year)

    // harus di define terlebih dulu, karena before changenya adalah null, dan after change harus diisi/diberikan value
    car.owner = "Budi"  // set owner sebelum di define/ditampilkan
    println(car.owner)

    car.description = "description"
    println(car.description)

    car.other = "other"
    println(car.other)
}

// fokus melakukan sesuatu sebelum dan setelah datanya berubah
// parameter -> param observableProperty
class LogObservableProperty<T>(param: T): ObservableProperty<T>(param){
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        //return super.beforeChange(property, oldValue, newValue)
        println("before change ${property.name} from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        //super.afterChange(property, oldValue, newValue)
        println("after change ${property.name} from $oldValue to $newValue")
    }
}

class Car(brand: String, year: Int){
    var brand: String by LogObservableProperty(brand)
    var year: Int by LogObservableProperty(year)

    // ada helper juga untuk membantu membuat delegates
    // Delegates.notNull()  => ReadWriteProperty g nilai awal bisa null, namun error jika masih null pada afternya
    // Delegates.vetoable(value, beforeChange) => ObservableProperty dengan beforeChange
    // Delegates.observable(value, afterChange) => ObservableProperty dengan afterChange

    // harus di define terlebih dulu, karena before changenya adalah null, dan after change harus diisi/diberikan value
    var owner: String by Delegates.notNull<String>()

    // jika tidak ingin membuat class LogObservableProperty, kotlin membuatkan helper yg sama fungsinya
    // delegates.vetoable(){lambda}
    var description: String by Delegates.vetoable(""){ property, oldValue, newValue ->
        println("before change with vetoable ${property.name} from $oldValue to $newValue")
        true
    }

    // delegates.observable(){lambda}
    var other: String by Delegates.observable(""){property, oldValue, newValue ->
        println("after change with observable ${property.name} from $oldValue to $newValue")
    }
}