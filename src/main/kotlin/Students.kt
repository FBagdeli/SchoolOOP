open class Student(
    teacher: Teacher,
    val studentFirstName: String,
    val studentLastName: String ,
    val studentScore: Int
) {

    //The Students cant change teacher Name!
    private var studentTeacherName = teacher.teacherName()
    open fun studentInfo() {
        println(
            """ 
            Student Name is:$studentFirstName $studentLastName with Score: $studentScore . The teacher name is :$studentTeacherName
        """.trimIndent()
        )
    }

}