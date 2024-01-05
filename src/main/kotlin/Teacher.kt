open class Teacher : Manager(){

    override var mFirstName: String = super.mFirstName
    override var mLastName: String = super.mLastName


    open var tFirstName : String = "Undefined"
    open var tLastName : String = "Undefined"
    open var tCourse : String = "Android"
    private var idTeacher : Int = 102

    override fun schoolMember() {
        println("Teacher($tFirstName $tLastName) teaches $tCourse. " +
                "Personal Code is: $idTeacher" +
                ". Manager is Mr $mFirstName $mLastName")
    }

}