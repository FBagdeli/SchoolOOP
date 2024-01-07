fun main() {

    val manager = Manager(301, "Steve", "Jobs", 68, "Hagvartz", 9001)

    val listOfCourses = listOf(
        Course(1, "kotlin"),
        Course(2, "Android"),
        Course(3, "Java"),
    )

    val listOfTeachers = listOf(
        Teacher(primaryKey = 201, "Ershad", "Nasri", 28, courseName = listOfCourses[0]),//kotlin - nasri
        Teacher(primaryKey = 201, "Ershad", "Nasri", 28, courseName = listOfCourses[1]),//android - nasri
        Teacher(primaryKey = 202, "Arash", "Kamangir", 28, courseName = listOfCourses[1]),//android - kamangir
        Teacher(primaryKey = 203, "MJ", "Bag", 28, courseName = listOfCourses[2])//Java - Bag
    )

    val listOfTeachersCourses = listOf(
        TeacherCourses(listOfTeachers[0], listOfCourses[0]), // nasri - kotlin
        TeacherCourses(listOfTeachers[0], listOfCourses[1]), // nasri - android

        TeacherCourses(listOfTeachers[1], listOfCourses[1]), // Kamangir - android
        TeacherCourses(listOfTeachers[2], listOfCourses[2]),// Bag- java
    )
    // Student 101 , 102 va 103 hame ba Ostad Nasri class Kotlin gereftan
    // Student 104 ba Ostad Nasri class Android gerefte
    //studnet 105 ba ostad Kamangir class Android gerefte
    //student 106 va 107 ba ostad Bag class Java gerefte
    val listOfStudents = listOf(
        Student(primaryKey = 101, "Farshad", "Bagdeli", 32, listOfTeachersCourses[0], 20),
        Student(primaryKey = 102, "Farshad", "Bagdeli2", 32, listOfTeachersCourses[0], 20),
        Student(primaryKey = 103, "Farshad", "Bagdeli3", 32, listOfTeachersCourses[0], 20),
        Student(primaryKey = 104, "Shah", "Pahlavi", 32, listOfTeachersCourses[1], 20),
        Student(primaryKey = 105, "NaderShah", "Afshar", 32, listOfTeachersCourses[2], 20),
        Student(primaryKey = 106, "NaderShah", "Afshar", 32, listOfTeachersCourses[3], 20),
        Student(primaryKey = 107, "babak", "khoramdin", 32, listOfTeachersCourses[3], 20),
    )

    teacherCourses(listOfTeachersCourses)


}

fun teacherCourses(list: List<TeacherCourses>) {
    var i = 0
    var b = 1
    for (i in list.indices) {
        print("Mr ${list[i].teacherName} teaches ${list[i].courseName}" )

           for ( b in list.indices){
               if (list[i].teacherName == list[b].teacherName ){
                   print(" and ${list[b].courseName}")
               }
               if(b == list.size -1 ) {
                   println("\n")
                   break
               }

           }

    }

}
