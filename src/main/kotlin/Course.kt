class Course(
    val primaryKey: Int,
    val courseName: String
){
     fun printInfo() {
        println("""
            Course Info :
            CourseId : $primaryKey
            CourseName : $courseName
        """.trimIndent())
    }
}