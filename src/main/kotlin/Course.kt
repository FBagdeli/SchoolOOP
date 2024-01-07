class Course(
    val primaryKey: Int,
    val course: String
){
     fun printInfo() {
        println("""
            Course Info :
            CourseId : $primaryKey
            CourseName : $course
        """.trimIndent())
    }
}