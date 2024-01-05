fun main() {

    val manager = Manager("Steve", "Jobs", 68, "Hagvartz", 9001)
    val teacher1 = Teacher("Ershad", "Nasri", 28, 101, "Kotlin")
    val teacher2 = Teacher("MJ", "Bag", 28, 102, "Kotlin")

    val student1 = Student("Farshad", "Bagdeli", 32, 1900, "Kotlin", teacher1, 20)
    val student2 = Student("Farshad", "Bagdeli2", 32, 1900, "Kotlin", teacher1, 20)
    val student3 = Student("Farshad", "Bagdeli3", 32, 1900, "Kotlin", teacher1, 20)
    val student4 = Student("Shahi", "Pahlavi", 32, 1900, "Kotlin", teacher2, 20)
    val student5 = Student("NaderShah", "Afshar", 32, 1900, "Kotlin", teacher2, 20)

    // میشه در کلاس دانش آموز به جای معلم ، یک لیست از معلم هایی که باهاشون کلاس گرفته رو بزاریم
    // مشکل اینجاست که لیست دانش آموز هارو چطور به معلم ها اضافه کنیم ؟ 

    val listOfStudents = listOf(student1, student2, student3, student4, student5)
    val listOfTeachers = listOf(teacher1, teacher2)

    student1.printInfo()
    printStudentsOfTeacher(listOfStudents, listOfTeachers)
    println("\n")
    printTeachersOfStudent(listOfStudents, listOfTeachers)

}

fun printStudentsOfTeacher(studentList: List<Student>, teacherList: List<Teacher>) {

    for (t in teacherList.indices) {
        for (s in studentList.indices) {
            if (teacherList[t].teacherID == studentList[s].teacherOfClass.teacherID) {
                println("${teacherList[t].lName} is teacher of: ${studentList[s].lName}")
            }
        }
    }
}

fun printTeachersOfStudent(studentList: List<Student>, teacherList: List<Teacher>) {
    for (t in studentList.indices) {
        for (s in teacherList.indices) {
            if (teacherList[s].teacherID == studentList[t].teacherOfClass.teacherID) {
                println("${studentList[t].lName} is student of: ${teacherList[s].lName}")
            }
        }
    }
}