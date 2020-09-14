interface Bank{

    fun deposit(amount: Int)
    fun withdraw(amount: Int)
}

class SavingAccount: Bank{
    var balance:Int = 0
   override fun deposit(amount:Int){
       balance += amount

   }

    override fun withdraw(amount:Int){
        balance -= amount

    }

}

class CurrentAccount:Bank{
    var balance:Int = 0

    override fun deposit(amount:Int) {
        balance += amount

    }

    override fun withdraw(amount:Int){
        if(balance<100){
            println("Insufficient Funds")
        }
        else{
            balance -= amount

        }
    }

    fun printBalance(){
        println(balance)
    }


}

fun main(){

    var account = CurrentAccount()

    account.deposit(300)
    account.withdraw(200)
    account.printBalance()
}