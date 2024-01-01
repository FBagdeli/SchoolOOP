fun main(){
    val manager = Manager("MJ","Big")
    val manager1 = Manager("MJ1","Big2")
    val teacher = Teacher("Ershad","Nasiri",manager)
    val teacher2 = Teacher("Ershad2","Nasiri20",manager1)

    val student = Student(teacher, "Farshad","Bagdeli",20)
    val student2 = Student(teacher2,"Babak","Khoramdin",20)
    val student3 = Student(teacher,"Arash","Shivatir",20)
    val student4 = Student(teacher2,"Artemis","DaryaSalar",20)

    student.studentInfo()
    student2.studentInfo()

    val list = listOf(student,student2,student3,student4)
    studentsScore(list)
}
fun studentsScore(lists: List<Student>){

    for (list in lists){
        println("${list.studentLastName} Score is : ${list.studentScore}")
    }
}