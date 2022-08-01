//GUIDELINES FOR KOTLIN PROGRAMMING LANGUAGE:
/*
 -> No need to create functions inside a class (can be at a file level)
 -> The difference between val and var is that val is immutable and var is mutable (can be changed)
 -> No need to specify the data type of variable (var) or value (val) (can be inferred) (like JavaScript)

 * Kotlin lang feature over Java:
 -> Null Safety Feature is a feature where u need to declare null vars explicitly (e.g. var name: String? = "Ismail")

 * String Templates:
    -> String templates are a way to concatenate strings in Kotlin (e.g. "Hello $name")
    -> For complex operations, curly braces are used (e.g. "Hello ${1 + 2}")
*/

fun main() {
    val name = "Ismail" // same code as above
    var lastName: String? = "Chbiki" // nullable

    lastName = null // nullable
//    println("Hello $name")
//    println("Hello ${1 + 2}") //for more complex code use curly braces

    //Arrays:
//    val arr = arrayOf(150, 250, 350, 450, 550) // array of integers
//    println("Position 0 in the array: ${arr[0]}")

    //Conditional Statements:
//    val msg = "Enter your age:"
//    val age = Integer.valueOf(readLine()) //converting to integer
//    if (age > 20) println("over twenties")
//    else println("less then twenties")

    // if statements in Kotlin can be a return type:
//    val result = if(age > 20) "Hello" else "Bye"
//    print(result)

    //when statements:
//    val day = Integer.valueOf(readLine())
//    val result = when (day) { //the result can also be assigned to a var
//        1, 10 -> "One or ten"
//        2 -> "Two"
//        3 -> "Three"
//        else -> "No Num"
//    }

    //above code written differently:
//    val result = when { //when without args
//        day == 1 -> "One"
//        day == 2 -> "Two"
//        else -> "Other num"
//    }
//    println(result)

    //Loops
    //Other collections:
    val arr = arrayOf(150, 250, 350, 450, 550) // array of integers
    val ia: IntArray = intArrayOf(2, 3, 4, 5, 6)
    val list = listOf<String>("Kotlin", "Java", "C#", "React", "Nodejs")
    val map = mapOf(1 to "Kotlin", 2 to "Java", 3 to "C#", 4 to "Nodejs")

//    for (item in map) {
////        print(): print inline
////        println(): print in block
//        println(item)
//    }

//    for((key, value) in map){
//        println("$key => $value")
//    }
//
//    for(i in 1..9){
//        println(i)
//    }
//
//    for(i in 1 until 9){
//        println(i)
//    }

//    Extension Functions
    fun String.getFeeling(): String {
        return when {
            last() == '?' -> "Curious"
            last() == '!' -> "Excited"
            last() == '.' -> "Calm"
            else->  "Unknown"
        }
    }
    val myVar = "Hello."
    println(myVar.getFeeling())
}