class Manager(
    override val primaryKey: Int,
    override val fName: String,
    override val lName: String,
    override val age: Int,
    val schoolName: String,
    val managerId: Int
) : Person() {

    override fun printInfo() {
        println(
            """
            Manager Info :
            Name : $fName $lName
            Age : $age
            ManagerId : $managerId
            SchoolName : $schoolName
        """.trimIndent()
        )
    }

}
