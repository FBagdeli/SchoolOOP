class Student(override val fName: String, override val lName: String, override val age: Int,
               val studentId : Int,  val courseName : String,  val teacherOfClass :Teacher, val studentScore : Int) : Person(){

    override fun printInfo() {
        println("""
            Student Info :
            Name : $fName $lName
            Age : $age
            StudentId : $studentId
            Teacher : ${teacherOfClass.fName} ${teacherOfClass.lName}
            CourseName : $courseName
            StudentScore : $studentScore
        """.trimIndent())
    }

}
