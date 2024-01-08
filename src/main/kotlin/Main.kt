fun main() {

    val manager = Manager(301, "Steve", "Jobs", 68, "Hagvartz", 9001)

    val listOfCourses = listOf(
        Course(0, "kotlin"),
        Course(1, "Android"),
        Course(2, "Java"),
    )

    val listOfTeachers = listOf(
        Teacher(primaryKey = 201, "Ershad", "Nasri", 28),//kotlin - nasri
        Teacher(primaryKey = 202, "Arash", "Kamangir", 28),//android - kamangir
        Teacher(primaryKey = 203, "MJ", "Bag", 28)//Java - Bag
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
        Student(primaryKey = 106, "Ali", "Daie", 32, listOfTeachersCourses[3], 20),
        Student(primaryKey = 107, "babak", "khoramdin", 32, listOfTeachersCourses[3], 20),
    )

    teacherCoursesStudents(listOfTeachersCourses, listOfStudents)
    teacherCourses(listOfTeachersCourses)


}

fun teacherCoursesStudents(list: List<TeacherCourses>, studentList: List<Student>) {
    var b = 0
    var z = 1
    var s = 0

    for (i in list.indices) {
        if (b > 0) {
            b = 0
            continue
        }
        print("Mr ${list[i].teacherName} teaches ${list[i].courseName}")
        while (z < list.lastIndex) {
            if (list[i].teacherName == list[z].teacherName) {
                print(", and ${list[z].courseName}")
                b++
            }
            z++
        }
        print("\nThe Student/Students are:")
        for (s in studentList.indices) {
            if (list[i].teacherName == studentList[s].teacherCourse.teacherName) print("${studentList[s].lName}, ")
        }

        println("\n")
    }
}


fun teacherCourses(list: List<TeacherCourses>) {
    var b = 0
    var z = 1

    for (i in list.indices) {
        if (b > 0) {
            b = 0
            continue
        }
        print("Mr ${list[i].teacherName} teaches ${list[i].courseName}")
        while (z < list.lastIndex) {
            if (list[i].teacherName == list[z].teacherName) {
                print(" and ${list[z].courseName}")
                b++
            }
            z++
        }
        println("\n")
    }
}

