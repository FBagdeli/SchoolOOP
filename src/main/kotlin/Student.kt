class Student(
    override val primaryKey: Int,
    override val fName: String,
    override val lName: String,
    override val age: Int,
    val courseName : Course,
    val studentScore : Int
) : Person(){

    override fun printInfo() {
        println("""
            Student Info :
            StudentNumber : $primaryKey
            Name : $fName $lName
            Age : $age
            CourseName : ${courseName.primaryKey}
            StudentScore : $studentScore
        """.trimIndent())
    }

}
