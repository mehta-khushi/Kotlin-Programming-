// primary constructor:- class xyz(var x:String, var y:Int)
//secondary constructor:- inside class use keyword construtor
class Person { //secondary constructor
    var name:String
    var age:Int
    constructor(n:String, a:Int){
       name = n
        age = a
    }
    constructor(n:String){
        age = 0
        name = n
    }
    constructor(){
        age = 20
        name = "Rahul"
    }
    fun intro(){
        println("My Name is $name and age is $age")
    }
}
fun main(){
    print("Enter name: ")
    var name = readln()
    print("Enter age: ")
    var age  = readln().toInt()
    var obj = Person(name,age)
    obj.intro()
    var obj1 = Person(name)
    obj1.intro()
    var obj2 = Person()
    obj2.intro()
}