

class Teacher(override val fName: String, override val lName: String, override val age: Int,
               val teacherID : Int,  val courseName : String) : Person(){


    override fun printInfo(){
        println("""
            Teacher Info :
            Name : $fName $lName
            Age : $age
            Id : $teacherID
            ClassName : $courseName
        """.trimIndent())
    }


  }
