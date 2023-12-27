fun main() {

    val listOfManager = listOf(
        Manager(1,"Dariush","Pahlavi")
    )
    println(listOfManager)

    val listOfTeachers = listOf(
        Teacher(1,"Ershad","Nasri","Kotlin",3),
        Teacher(2,"Vin","Norman","Android Developer",1),
        Teacher(3,"Shahi","Bagdeli","C#",3),
        Teacher(4,"Mohammad","Javad","Administrator",2),
    )

    val listOfStudents = listOf(
        Students(1,"Farshad","Bagdeli",3,listOfTeachers[0].firstName +" "+ listOfTeachers[0].secondName,20f),
        Students(2,"Azam","Sheikhi",3,listOfTeachers[1].firstName + listOfTeachers[1].secondName,18.5f),
        Students(3,"Korosh","Fouladi",3,listOfTeachers[2].firstName + listOfTeachers[2].secondName,15f)
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
