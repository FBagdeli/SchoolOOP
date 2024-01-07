class Student(
    override val primaryKey: Int,
    override val fName: String,
    override val lName: String,
    override val age: Int,
    val teacherCourse: TeacherCourses,
    val studentScore : Int
) : Person(){

    override fun printInfo() {
        println("""
            Student Info :
            StudentNumber : $primaryKey
            Name : $fName $lName
            Age : $age
            Teacher and Course = ${teacherCourse.teacherName}, ${teacherCourse.courseName}
            StudentScore : $studentScore
        """.trimIndent())
    }

}
