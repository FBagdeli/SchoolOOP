data class Teacher(
private val teacherId : Int = 1,
    private val firstName : String = "Undefined",
    private val secondName : String = "Undefined",
    private val courseName : String = "Undefined",
    val fullName :String = "$firstName $secondName"
)