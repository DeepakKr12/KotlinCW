// Interface
interface Drivable {
    fun drive()
}

class Car : Drivable {
    override fun drive() {
        println("Driving the car.")
    }
}

val myCar = Car()
myCar.drive()  // Output: Driving the car.
*/


// Nested and inner class
class Outer {
    private val outerData = "Outer Class Data"

    class Nested {
        fun display() {
            println("Nested Class")
            // Cannot access outerData here
        }
    }

    inner class Inner {
        fun display() {
            println("Inner Class with access to: $outerData")
        }
    }
}

val outer = Outer()
val nested = Outer.Nested()
nested.display()  // Output: Nested Class

val inner = outer.Inner()
inner.display()   // Output: Inner Class with access to: Outer Class Data
