//Inheritance
//syntax open class xyz
//only open class or open function can be inherit or override
//Write a program of recursion to find the factorial of number
open class Rectangle(var l:Double,var b :Double){
    fun area():Double{
        return this.l*this.b
    }

    open fun display(){
        print("Area of rectangle with dimenssions $l and $b: ")
        print(area())
    }
}
class Square(var side:Double):Rectangle(side,side){
    override fun display(){
        print("Area of square with dim $side is ")
        print(area())
    }
}
fun main(){
    print("Enter length: ")
    var len = readln().toDouble()
    print("Enter breadth: ")
    var br = readln().toDouble()
    var obj = Rectangle(len,br)
    obj.display()
    println()
    print("Enter side of square: ")
    var side = readln().toDouble()
    var obj2 = Square(side)
    obj2.display()

}