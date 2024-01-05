fun main() {

    val manager = Manager("Steve", "Jobs", 68, "Hagvartz", 9001)
    val teacher = Teacher("Ershad", "Nasri", 28, 101, "Kotlin")
    val student = Student("Farshad", "Bagdeli", 32, 1900, "Kotlin", teacher, 20)

    student.printInfo()

}
