fun main() {

    val manager = Manager("Steve", "Jobs", 68, "Hagvartz", 9001)

    val teacher1 = Teacher("Ershad", "Nasri", 28, 101, courseName = Courses().kotlin)
    val teacher2 = Teacher("MJ", "Bag", 28, 102, courseName = Courses().android)

    val student1 = Student("Farshad",   "Bagdeli", 32, 1900, courseName = Courses().kotlin, teacher1, 20)
    val student2 = Student("Farshad",   "Bagdeli2", 32, 1900, courseName = Courses().kotlin, teacher1, 20)
    val student3 = Student("Farshad",   "Bagdeli3", 32, 1900, courseName = Courses().kotlin, teacher1, 20)
    val student4 = Student("Shah",      "Pahlavi", 32, 1900, courseName = Courses().android, teacher2, 20)
    val student5 = Student("NaderShah", "Afshar", 32, 1900, courseName = Courses().android, teacher2, 20)

    val listOfStudents = listOf(student1, student2, student3, student4, student5)
    val listOfTeachers = listOf(teacher1, teacher2)

    student1.printInfo()
}
