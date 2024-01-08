
class TeacherCourses(teacher: Teacher, course: Course){

    val tFKey = teacher.primaryKey
    val cFKey = course.primaryKey

    val teacherName = teacher.fName + " " + teacher.lName
    val courseName = course.courseName

    fun printInfo(){
        println("""
            teacher $teacherName, Teaches $courseName 
            
        """.trimIndent())
    }
}
