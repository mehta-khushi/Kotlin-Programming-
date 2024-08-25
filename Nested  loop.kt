fun main(){
    //print a pattern
    for(i in 1..10){
        for(j in 1..i){
            print(j)
        }
        println()
    }
    //reverse the pattern
    for(i in 10 downTo 1){
        for(j in 1..i){
            print(j)
        }
        println()
    }
}