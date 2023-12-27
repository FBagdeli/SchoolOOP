fun main() {

    val listOfManager = listOf(
        Manager(1,"Dariush","Pahlavi")
    )
    println(listOfManager)

    val listOfTeachers = listOf(
        Teacher(1,"Ershad","Nasri","Kotlin"),
        Teacher(2,"Vin","Norman","Android Developer"),
        Teacher(3,"Shahi","Bagdeli","C#"),
        Teacher(4,"Mohammad","Javad","Administrator"),
    )

    val listOfStudents = listOf(
        Students(1,"Farshad","Bagdeli",3,listOfTeachers[0].fullName,20f),
        Students(2,"Azam","Sheikhi",3,listOfTeachers[1].fullName,18.5f),
        Students(3,"Korosh","Fouladi",3,listOfTeachers[2].fullName,15f)
    )

    studentGradesList(listOfStudents)
}

fun studentGradesList(list: List<Students>){
    val int = list.lastIndex

    println("Students Grade List: ")
    for (i in 0.. int ){
        println("   ${list[i].firstName} ${list[i].secondName} is ${list[i].courseGrade} with ${list[i].teacherName}")
    }

}
