fun main(){
    print("Enter first number: ")
    var num1:Double = readln().toDouble()
    print("Enter second number: ")
    var num2:Double = readln().toDouble()
    while(true) {
        print("'+' for addition \n '-' for subtraction \n'*' for multiplication' \n '/' for division \n press 0 t exit \n Enter symbol:")
        var symbol = readln()
        if (symbol == "+") {
            println("Sum of $num1 and $num2 is ${num1 + num2}")
        } else if (symbol == "-") {
            println("Sub of $num1 and $num2 is ${num1 - num2}")
        } else if (symbol == "*") {
            println("Mul of $num1 and $num2 is ${num1 * num2}")
        } else if (symbol == "/") {
            println("Enter 1 if you want num1/num2 \n Enter 2 if you want num2/num1")
            var a: Int = readln().toInt()
            if (a == 1) {
                if (num2 == 0.0) {
                    println("Can't divide by zero")
                } else {
                    println("$num1 / $num2 is ${num1 / num2}")
                }
            } else if (a == 2) {
                if (num1 == 0.0) {
                    println("can't divide by zero")
                } else {
                    println("$num2 / $num1 is ${num2 / num1}")
                }
            } else {
                println("Invalid choice")
            }
        }
        else if(symbol=="0"){
            print("Thanks for using :)")
            break
        }
        else {
            println("Please Enter valid symbol!!")
        }
    }
}