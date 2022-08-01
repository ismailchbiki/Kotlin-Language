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
class Person(
    var firstName: String = "Ismail", var lastName: String = "Chbiki", var age: Int = 32
) {
}