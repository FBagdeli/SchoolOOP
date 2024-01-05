open class Student(teacher: Teacher) {



    var tFName = teacher.tFirstName
    var tLName = teacher.tLastName

    var studentFirstName = "Undefined"
    var studentLastName = "Undefined"
    var studentCourse = "Undefined"
    var studentCourseNumber = 20

    fun schoolMember() {
        println(
            listOf(
                "$studentFirstName $studentLastName", studentCourse,
                "$studentCourseNumber", "$tFName ${tLName}Name"
            )
        )
    }
}