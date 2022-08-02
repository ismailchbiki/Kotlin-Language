package OOP

//class Person {
//    //Kotlin creates getters and setters for up
//    var firstName: String = "Ismail"
//    var lastName: String = "Chbiki"
//    var age: Int = 32
//}

//same thing as above but written differently (simpler and concise)
//class Person constructor(
//    var firstName: String = "Ismail",
//    var lastName: String = "Chbiki",
//    var age: Int = 32
//) {
//}

//also same as above written differently (without word "constructor")
abstract class Person( //classes and functions.. are final by default in Kotlin
    var firstName: String = "Ismail", var lastName: String = "Chbiki", var age: Int = 32
) {
    //custom  getters and setters
    //For custom Getters & Setters, the property cannot be inside the constructor parameters.
    //Otherwise, we get the default getters and setters
    val fullName: String //val so that the variable is immutable (no setters)
        get() = "$firstName TestText $lastName"

    abstract val id: String //abstract makes classed open by default

//    init { //this code always runs first as part of the constructor
//        id = fullName + age
//    }
}