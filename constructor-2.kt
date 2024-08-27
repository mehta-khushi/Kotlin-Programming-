//primary constructor
class Person(var name:String,var age:Int) {

    constructor(n:String):this(){
        this.age = 0
        this.name = n
    }
    constructor():this("Khushi",18)

    fun intro(){
        println("My Name is $name and age is $age")
    }
}
fun main(){
    print("Enter name: ")
    var name = readln()
    print("Enter age: ")
    var age  = readln().toInt()
    var obj = Person()
    obj.intro()
    var obj2 = Person(name,age)
    obj2.intro()
}