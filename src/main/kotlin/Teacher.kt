

class Teacher(override var fName: String, override var lName: String, override var age: Int,
              private var teacherID : Int, private var className : String) : Person(){


    override fun printInfo(){
        println("""
            Teacher Info :
            Name : $fName $lName
            Age : $age
            Id : $teacherID
            ClassName : $className
        """.trimIndent())
    }


  }
