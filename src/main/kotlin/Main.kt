import java.lang.reflect.Array.set

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

    //Dependency between Courses and Teachers
    val listOfTeachersCourses = listOf(
        TeacherCourses(listOfTeachers[0], listOfCourses[0]), // nasri - kotlin
        TeacherCourses(listOfTeachers[0], listOfCourses[1]), // nasri - android

        TeacherCourses(listOfTeachers[1], listOfCourses[1]), // Kamangir - android
        TeacherCourses(listOfTeachers[2], listOfCourses[2]),// Bag- java
    )

    // Student 101 , 102 va 103 hame ba Ostad Nasri class Kotlin gereftan
    // Student 104 ba Ostad Nasri class Android gerefte
    // Studnet 105 ba ostad Kamangir class Android gerefte
    // Student 106 va 107 ba ostad Bag class Java gerefte

    val listOfStudents = listOf(
        Student(primaryKey = 101, "Farshad", "Bagdeli", 32, listOfTeachersCourses[0], 20),
        Student(primaryKey = 102, "Farshad", "Bagdeli2", 32, listOfTeachersCourses[0], 20),
        Student(primaryKey = 103, "Farshad", "Bagdeli3", 32, listOfTeachersCourses[0], 20),
        Student(primaryKey = 104, "Shah", "Pahlavi", 32, listOfTeachersCourses[1], 20),
        Student(primaryKey = 105, "NaderShah", "Afshar", 32, listOfTeachersCourses[2], 20),
        Student(primaryKey = 106, "Ali", "Daie", 32, listOfTeachersCourses[3], 20),
        Student(primaryKey = 107, "babak", "khoramdin", 32, listOfTeachersCourses[3], 20),
    )
//
//    //Method will print what teacher teaches and whose are his student
//    teacherCoursesStudents(listOfTeachersCourses, listOfStudents)
//    println("****************************************************************")
//    //Method will print courses or course of teacher will teach
//    teacherCourses(listOfTeachersCourses)
//    println("****************************************************************")
//    //Method will print Students of Teacher
//    findStudentsOfTeacherWithId(listOfTeachers[2], listOfStudents)
//    println("****************************************************************")
    //Method will print course that taken by students
//    courseTakenByStudents(listOfCourses, listOfStudents)

    val listStudent = courseTakenByStudentsList(course = listOfCourses[0], listOfStudents)
    for (i in listStudent.indices) {
        print("${listStudent[i].lName} ")
    }

}

fun courseTakenByStudentsList(course: Course, listOfStudent: List<Student>): List<Student> {
    val list: MutableList<Student> = mutableListOf()
    println("Course ${course.courseName} has been taken by: ")
    for (s in listOfStudent.indices) {
        if (course.primaryKey == listOfStudent[s].teacherCourse.cFKey) {
            list.add(listOfStudent[s])
        }
    }
    return list
}

fun courseTakenByStudents(listOfCourses: List<Course>, listOfStudent: List<Student>) {
    val string = "String"

    for (i in listOfCourses.indices) {
        println("Course ${listOfCourses[i].courseName} has been taken by: ")
        for (s in listOfStudent.indices) {
            if (listOfCourses[i].primaryKey == listOfStudent[s].teacherCourse.cFKey) {
                print("${listOfStudent[s].lName} ")
            }
        }
        println("\n")
    }
}

fun findStudentsOfTeacherWithId(teacher: Teacher, studentsList: List<Student>) {

    //because we want to have access to attributes of teacher , it's better to pass
    // Teacher as argument instead of primarykey of Teacher as Int

    println("Students of Ostad ${teacher.lName} are: ")
    for (i in studentsList.indices) {
        if (studentsList[i].teacherCourse.tFKey == teacher.primaryKey) {
            println(studentsList[i].lName)
        }
    }
}


fun teacherCoursesStudents(list: List<TeacherCourses>, studentList: List<Student>) {
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

