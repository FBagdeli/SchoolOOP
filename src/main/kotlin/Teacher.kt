

class Teacher(override var fName: String, override var lName: String, override var age: Int,
               var teacherID : Int,  var className : String) : Person(){


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
