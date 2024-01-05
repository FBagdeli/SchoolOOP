class Manager(override var fName: String, override var lName: String, override var age: Int,
              private var schoolName : String, private var managerId : Int) : Person(){

    override fun printInfo(){
        println("""
            Manager Info :
            Name : $fName $lName
            Age : $age
            ManagerId : $managerId
            SchoolName : $schoolName
        """.trimIndent())
    }

}
