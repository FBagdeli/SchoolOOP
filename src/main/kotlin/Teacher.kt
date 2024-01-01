
open class Teacher(private var teacherFirstName : String, private var teacherFamilyName:String, manager: Manager) {

    fun teacherName():String{
        return "$teacherFirstName $teacherFamilyName"
    }


}