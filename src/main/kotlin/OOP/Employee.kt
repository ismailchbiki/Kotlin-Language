package OOP

//ABSTRACTION
class Employee(company: String) : Person(), PersonActions {
    override val id = fullName + company + age
    override fun wearClothes() {
        println("Employee wears suit")
    }
}

//ABSTRACTION
class Student(school: String) : Person(), PersonActions {
    override val id = fullName + school + age
    override fun wearClothes() {
        println("Wears student clothes")
    }
}

interface PersonActions {
    fun wearClothes()
}