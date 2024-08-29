
// Defining a class
class Car(val brand: String, val model: String, var year: Int) {

    // Method (Function) inside the class
    fun startEngine() {
        println("The engine of $brand $model is starting.")
    }
}

fun main(){
// Creating an object (instance) of the class
val myCar = Car("Toyota", "Corolla", 2020)
myCar.startEngine()  // Output: The engine of Toyota Corolla is starting.
}

------------------------------------------------------------------------------------------------------

// Properties and Methods
class Person(val name: String, var age: Int) {

    // Property
    val isAdult: Boolean
        get() = age >= 18

    // Method
    fun greet() {
        println("Hello, my name is $name.")
    }
}
fun main(){
val person = Person("Alice", 25)
println(person.isAdult)  // Output: true
person.greet()           // Output: Hello, my name is Alice.
}

