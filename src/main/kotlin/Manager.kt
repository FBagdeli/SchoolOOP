open class Manager{

    open var mFirstName : String = "Undefined"
    open var mLastName : String = "Undefined"
    private var idManager : Int = 101

    open fun schoolMember(){
        println("Manager name of University is :$mFirstName $mLastName")
    }


}