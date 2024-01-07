
class TeacherCourses(teacher: Teacher, course: Course){

    val teacherName =teacher.fName + " " + teacher.lName
    val courseName = course.courseName


    fun printInfo(){
        println("""
            teacher $teacherName, Teaches $courseName 
            
        """.trimIndent())
    }
}
