class Edit {


    var name : String
        set(value){
         println(value)
        }
        get() = "STT"




}

fun main(){
    val edit = Edit()
    println( edit.name)
}