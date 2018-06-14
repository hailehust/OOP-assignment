package assignment;

public abstract class Account {//lop truu tuong

	/*================ ATTRIBUTES =====================*/
	protected  String owner;
	protected double balance;
	private static double interest  = 6.0;

	/*================ CONSTRUCTOR =================*/
	public Account() {//constructor mac dinh - khong tham so
		//owner = null
		//balance = 0.0
	}

	public Account(String owner, double balance) {//constructor day du cac tham so
		this.owner = owner;
		this.balance = balance;
	}
	/*================== GETTER SETTER ===============*/
	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return this.balance;
	}

//    public void setBalance(double balance) {//khong co setter cho balance
//        this.balance = balance;
//    }
	public double getInterest(){
		return Account.interest;
	}
	
	public void setInterest(double interest){
		Account.interest = interest;
	}
	/*=================== other METHODS ========================*/
	public boolean nopTien(double amount) {//increase the balance by the amount given
		if (amount < 0) {//check amount
			return false;
		} else {
			balance += amount;
			return true;
		}
	}


	public boolean rutTien(double amount) {//withdraw from balance an amount of money
		if (amount < 0 || this.balance - amount < 0) {//check amount
			return false;
		} else {
			balance -= amount;
			return true;
		}
	}


//	public void checkBalance() { //print the current balance to screen
//		System.out.println("Account: " + this.getOwner());
//		System.out.println("Current balance: " + this.getBalance() + " VND");
//		System.out.println("");
//	}
	
	public void updateBalance() {
		this.nopTien(interest * getBalance() / 100.0);
	}
	
	
	public abstract void getDetails();//abstract method

}//class Account
