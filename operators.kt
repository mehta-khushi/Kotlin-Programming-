fun main(){
    //1.Arithmetic operators(+,-,*,/,%)
    var num1:Int = 5
    var num2:Int = 10
    //addition
    println("sum of $num1 and $num2 is ${num1+num2}")
    //Subtraction
    println("sub of $num1 and $num2 is ${num1-num2}")
    //Multiplication
    println("mul of $num1 and $num2 is ${num1*num2}")
    //Division
    println("div of $num1 and $num2 is ${num1/num2}")
    //Modulus
    println("mod of $num1 and $num2 is ${num1%num2}")

    //2.Relational operators (>,<,>=,<=,==,!=)
    //return boolean values
    println(num1>num2)  //false
    println(num1<num2)  //true
    println(num1==num2) //false
    println(num1!=num2) //true

    //3.Logical (&&,||,!) return boolean
    var a:Boolean = true
    var b: Boolean = false
    println(a&&b)  //false
    println(a||b) //true
    println(!a) //false

    //4.unary operator (+,-,++,--)
    var k:Int = 6;
    println("PreIncriment of $k is ${++k}"); //7
    println("PostIncriment of $k is ${k++}"); //7
    println("PreDecriment of $k is ${--k}"); //7
    println("PostDecriment of $k is ${k--}"); //7 

}