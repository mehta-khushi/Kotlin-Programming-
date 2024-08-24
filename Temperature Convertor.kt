fun main(){
    //Temperature convertor (Type 'C' for celsius and 'F' for Fahrenheit)
    print("Enter temperature: ")
    var temp = readln().toDouble()
    print("Enter C-> Celsius \n f-> Fahrenheit")
    var ch = readln();
    if(ch=="C" || ch=="c"){
        var c =  (temp * 9/5) + 32
        print(c)
    }
    else if(ch=="F" || ch=="f"){
        var c = ((temp - 32) * 5/9)
        print(c)
    }
    else{
        print("Invalid character")
    }
}