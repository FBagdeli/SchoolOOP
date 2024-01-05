fun main() {

    val manager1  = Manager()
    val teacher1  = Teacher()

    val student2 = Student(teacher1)
    val student3 = Student(teacher1)
    val student4 = Student(teacher1)

    manager1.mFirstName = "Abolghasem"
    manager1.mLastName = "Ferdosi"
    manager1.schoolMember()

    teacher1.tFirstName = "Ershad"
    teacher1.tLastName = "Nasiri"
    teacher1.mFirstName = manager1.mFirstName
    teacher1.mLastName = manager1.mLastName
    teacher1.tCourse = "Kotlin"

    teacher1.schoolMember()


    val student1 = Student(teacher1)

    student1.studentFirstName = "Farshad"
    student1.studentLastName = "Bagdeli"
    student1.studentCourse = teacher1.tCourse
    student1.studentCourseNumber = 20

    student2.studentCourseNumber = 19
    student3.studentCourseNumber = 18
    student4.studentCourseNumber = 17

    student1.schoolMember()

    val listOfStudents = listOf(student1,student2,student3,student4)
    numbersOfStudents(listOfStudents)

}


fun numbersOfStudents(lists: List<Student>){

    for (list in lists){
        println(list.studentCourseNumber)
    }

}

