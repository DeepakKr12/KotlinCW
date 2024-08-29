
// Inheritance
// Base class
open class Animal(val name: String) {

    open fun sound() {
        println("$name makes a sound.")
    }
}

// Derived class
class Dog(name: String) : Animal(name) {

    override fun sound() {
        println("$name barks.")
    }
}
fun main(){
val dog = Dog("Buddy")
dog.sound()  // Output: Buddy barks.
}

----------------------------------------------------------------------------------------------------------------------------

// Abstract Classes and Methods
abstract class Vehicle {
    abstract fun move()  // Abstract method

    fun description() {
        println("This is a vehicle.")
    }
}

class Bicycle : Vehicle() {
    override fun move() {
        println("The bicycle pedals forward.")
    }
}
fun main(){
val bike = Bicycle()
bike.move()            // Output: The bicycle pedals forward.
bike.description()     // Output: This is a vehicle.
}
