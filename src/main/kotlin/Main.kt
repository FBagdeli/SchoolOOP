fun main() {

    val listOfManager = listOf(
        Manager(1,"Dariush","Pahlavi")
    )

    val listOfTeachers = listOf(
        Teacher(1,"Ershad","Nasri","Kotlin",3),
        Teacher(2,"Vin","Norman","Android Developer",1),
        Teacher(3,"Shahi","Bagdeli","C#",3),
        Teacher(4,"Mohammad","Javad","Administrator",2),
    )
    val listofStudents = listOf(
        Students(1,"Farshad","Bagdeli",3,"Ershad Nasri",20f),
        Students(2,"Azam","Sheikhi",3,"Shahi Bagdeli",18.5f),
        Students(3,"Korosh","Fouladi",3,"Mohammad Javad",15f)
    )

    studentGradesList(listofStudents)
}

fun studentGradesList(list: List<Students>){
    val int = list.lastIndex

    println("Students Grade List: ")
    for (i in 0.. int ){
        println("   ${list[i].firstName} ${list[i].secondName} is ${list[i].courseGrade}")
    }

}
