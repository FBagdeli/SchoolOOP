open class Teacher : Manager(){

    override var mFirstName: String = super.mFirstName
    override var mLastName: String = super.mLastName

    open var tFirstName : String = "Undefined"
    open var tLastName : String = "Undefined"
    open var tCourse : String = "Android"

    override fun schoolMember() {
        println("Teacher($tFirstName $tLastName) teaches $tCourse. Manager is Mr $mFirstName $mLastName ")
    }

}