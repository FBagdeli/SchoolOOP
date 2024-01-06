class Student(override val fName: String, override val lName: String, override val age: Int,
               val studentId : Int,  val courseName : List<String>, val studentScore : Int) : Person(){

    override fun printInfo() {
        println("""
            Student Info :
            Name : $fName $lName
            Age : $age
            StudentId : $studentId
            
            CourseName : $courseName
            StudentScore : $studentScore
        """.trimIndent())
    }

}
