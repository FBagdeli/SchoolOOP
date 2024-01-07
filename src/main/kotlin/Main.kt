fun main() {

    val manager = Manager(301,"Steve", "Jobs", 68, "Hagvartz", 9001)

    val listOfCourses = listOf(
        Course(1, "kotlin")
    )
    val listOfStudents = listOf(
        Student(primaryKey = 101, "Farshad", "Bagdeli", 32, courseName = listOfCourses[0], 20),
        Student(primaryKey = 102, "Farshad", "Bagdeli2", 32, courseName = listOfCourses[0], 20),
        Student(primaryKey = 103, "Farshad", "Bagdeli3", 32, courseName = listOfCourses[0], 20),
        Student(primaryKey = 104, "Shah", "Pahlavi", 32, courseName = listOfCourses[0], 20),
        Student(primaryKey = 105, "NaderShah", "Afshar", 32, courseName = listOfCourses[0], 20)
    )

    val listOfTeachers = listOf(
        Teacher(primaryKey = 201, "Ershad", "Nasri", 28, courseName = listOfCourses[0]),
        Teacher(primaryKey = 202, "Arash", "Kamangir", 28, courseName = listOfCourses[0]),
        Teacher(primaryKey = 203, "MJ", "Bag", 28, courseName = listOfCourses[0])
    )

    println("${listOfCourses[0].printInfo()} \n\n" +
            "${listOfStudents[0].printInfo()} \n\n" +
            "${listOfTeachers[0].printInfo()}")


//    printStudentsOfTeacher(listOfStudents, listOfTeachers)
//    println("\n")
//    printTeachersOfStudent(listOfStudents, listOfTeachers)

}


//
//fun printStudentsOfTeacher(studentList: List<Student>, teacherList: List<Teacher>) {
//
//    for (t in teacherList.indices) {
//        for (s in studentList.indices) {
//            for (c in 0..1)
//                if (teacherList[t].courseName == studentList[s].courseName[c]) {
//                    println("${teacherList[t].lName} is teacher of: ${studentList[s].lName}")
//                }
//        }
//    }
//}
//
//fun printTeachersOfStudent(studentList: List<Student>, teacherList: List<Teacher>) {
//    for (t in studentList.indices) {
//        for (s in teacherList.indices) {
//            for (c in 0..1) {
//                if (teacherList[s].courseName == studentList[t].courseName[c]
//                ) {
//                    println("${studentList[t].lName} is student of: ${teacherList[s].lName}")
//                }
//            }
//        }
//    }
//}