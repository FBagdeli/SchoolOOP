open class Student : Teacher(){

    override var mFirstName: String = super.mFirstName
    override var mLastName: String = super.mLastName
    override var tFirstName: String = super.tFirstName
    override var tLastName: String= super.tLastName
    override var tCourse: String = super.tCourse

    var studentFirstName  = "Undefined"
    var studentLastName  ="Undefined"
    var studentCourse = "Undefined"
    var studentCourseNumber = 20

    override fun schoolMember() {
        println(listOf("$studentFirstName $studentLastName", studentCourse,
            "$studentCourseNumber","$mFirstName $mLastName","$tFirstName $tLastName"))
    }
}