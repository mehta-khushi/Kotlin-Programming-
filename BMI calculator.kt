fun main(){
    print("Enter weight (in Kg): ")
    var weight:Double = readln().toDouble()
    print("Enter height (in m): ")
    var height:Double = readln().toDouble()
    var bmi:Double = weight/(height*height)
    if(bmi<18.5){
        println("Underweight")
    }
    else if(bmi>=18.5 && bmi<=24.9){
        println("Normal")
    }
    else if(bmi>=25 && bmi<=29.9){
        println("Overweight")
    }
    else{
        println("Obese")
    }
}