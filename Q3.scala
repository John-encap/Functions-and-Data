object q3 extends App{

	val acc1= new Bankacc("alex",11035,100.00)
	val acc2= new Bankacc("tom",11045,30.00)

  acc1.transfer(acc2,50.00)
  println("Balances After money transfering")
  println(acc1)
  println(acc2)


}

class Bankacc(id:String,n:Int,b:Double){

  var nic:String=id
  var accnumber:Int =n
  var balance:Double =b

	def withdraw(n:Double){
		this.balance=this.balance-n
	}

	def deposit(n:Double){
		this.balance=this.balance+n
	}

	def transfer(acc:Bankacc,n:Double)={
    this.withdraw(n)
    acc.deposit(n)
  }

  override def toString = "["+nic+":"+accnumber+":"+balance+"]"

	}
