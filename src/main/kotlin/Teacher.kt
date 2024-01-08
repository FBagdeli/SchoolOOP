

class Teacher(
    override val primaryKey: Int,
    override val fName: String,
    override val lName: String,
    override val age: Int,
) : Person(){


    override fun printInfo(){
        println("""
            Teacher Info :
            TeacherId : $primaryKey
            Name : $fName $lName
            Age : $age
            
        """.trimIndent())
    }


  }
