interface Bank{

    fun deposit(amount: Int)
    fun withdraw(amount: Int)
}

class SavingAccount: Bank{
    var balance:Int = 0
   override fun deposit(amount:Int){
       balance += amount
       println("Total Balance after deposit = $balance")

   }

    override fun withdraw(amount:Int){
        balance -= amount
        println("Total Balance after withdrawal = $balance")

    }

}

class CurrentAccount:Bank{
    var balance:Int = 0

    override fun deposit(amount:Int) {
        balance += amount
        println("Total Balance after deposit = $balance")

    }

    override fun withdraw(amount:Int){
        if(balance<100 ){
            println("Insufficient Funds")
        }
        else{
            balance -= amount
            println("Total balance after withdrawal = $balance")

        }
    }

    fun printBalance(){
        println(balance)
    }


}

fun main(){

    var account = CurrentAccount()
  //// Test for minimum balance in current account
    account.deposit(50)
    account.withdraw(200)

    account.deposit(100)
    account.withdraw(200)

/// Test for no restrictions in savings account
    var account2 = SavingAccount()

    account2.deposit(30)
    account2.withdraw(500)






}