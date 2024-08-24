fun main(){
    /*Ques:- 1. Create a kotlin program that simulates a discount system for a store
    2. define 2 variables (1 representing total amount of purchase 2 customer have membership or not)
    3. if total amount of the purchase is either 1000 or more then :
        a) check if the customer has a membership
        ----> if they do print msg indicating 20% discount
        ----> if they do not, print msg indicating 10% discount
        b) if total amount is below print no discount*/
    print("Enter total Amount: ")
    var totalAmount:Double = readln().toDouble()

    if(totalAmount>=1000){
        print("Have membership or not? \n press y -> yes \n pres n -> no")
        var memberShip = readln()
        if(memberShip=="y"||memberShip=="Y"){
            print("Congrats you got 20% discount :)")
        }
        else{
            print("Nice you got 10% discount ")
        }
    }
    else{
        print("Oops! No discount :(")
    }
}