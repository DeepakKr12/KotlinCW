fun main() {
    val str = "  Hello, Kotlin!  "

    // 1. Length & Character Access
    println("Length: ${str.length}")  											// Output: 17
    println("Character at index 1: ${str[1]}")  								// Output: H

    // 2. String Case Manipulation
    println("Uppercase: ${str.uppercase()}")  									// Output:   HELLO, KOTLIN!  
    println("Lowercase: ${str.lowercase()}")  									// Output:   hello, kotlin!  
    println("Capitalize: ${str.trim().capitalize()}")  							// Output: Hello, kotlin! 
    println("Decapitalize: ${str.trim().decapitalize()}")  						// Output: hello, Kotlin! 

    // 3. Substring & Splitting
    println("Substring (0 to 5): ${str.trim().substring(0, 5)}")  				// Output: Hello
    val fruitsStr = "apple,banana,orange"
    val fruits = fruitsStr.split(",")
    println("Split: $fruits")  													// Output: [apple, banana, orange]

    // 4. Trimming
    println("Trim: '${str.trim()}'")  											// Output: 'Hello, Kotlin!'
    println("Trim Start: '${str.trimStart()}'")  								// Output: 'Hello, Kotlin!  '
    println("Trim End: '${str.trimEnd()}'")  									// Output: '  Hello, Kotlin!'

    // 5. Replacing & Removing
    println("Replace 'Kotlin' with 'World': ${str.replace("Kotlin", "World")}") // Output:   Hello, World!  
    println("Replace First 'l' with 'L': ${str.replaceFirst("l", "L")}")  		// Output:   HeLlo, Kotlin!  
    val prefixStr = "HelloWorld"
    println("Remove Prefix 'Hello': ${prefixStr.removePrefix("Hello")}")  		// Output: World
    val suffixStr = "HelloWorld"
    println("Remove Suffix 'World': ${suffixStr.removeSuffix("World")}")  		// Output: Hello

    // 6. Checking Content
    println("Contains 'Kotlin': ${str.contains("Kotlin")}")  					// Output: true
    println("Starts with 'Hello': ${str.trim().startsWith("Hello")}")  			// Output: true
    println("Ends with 'World': ${str.trim().endsWith("World")}")  				// Output: false

    // 7. Other Useful Functions
    val emptyStr = ""
    println("Is Empty: ${emptyStr.isEmpty()}")  								// Output: true
    println("Is Not Empty: ${str.isNotEmpty()}")  								// Output: true
    println("Reversed: ${str.trim().reversed()}")  								// Output: !nitloK ,olleH
    println("Repeat 3 times: ${str.trim().repeat(3)}")  						// Output: Hello, Kotlin!Hello, Kotlin!Hello, Kotlin!

    // 8. String Comparison
    val str1 = "apple"
    val str2 = "banana"
    println("Compare 'apple' with 'banana': ${str1.compareTo(str2)}")  			// Output: -1
    println("Equals 'apple' with 'apple': ${str1.equals("apple")}")  			// Output: true

    // 9. String Templates & Interpolation
    val name = "John"
    val age = 30
    println("My name is $name and I am $age years old.")  						// Output: My name is John and I am 30 years old.
    val items = 3
    val price = 9.99
    println("Total: ${items * price}")  										// Output: Total: 29.97
}
