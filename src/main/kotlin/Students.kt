class Student(override var fName: String, override var lName: String, override var age: Int,
              private val studentId : Int, private val courseName : String, private val teacherOfClass :Teacher, val studentScore : Int) : Person(){

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
