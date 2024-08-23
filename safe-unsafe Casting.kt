fun main() {
    //case-1 return null
    val x: String = "100";
    val y: Int? = x as? Int; //return null when we use question mark
    if (y != null) {
        println(y)
    }
    else {
        println("invalid type casting")
    }
    // case-2 return not null
    val z = "khushi"
    val k:String? = z as? String
    if(k!=null){
        println(k) //print the original string
    }
    else{
        println("not valid ")
    }

}