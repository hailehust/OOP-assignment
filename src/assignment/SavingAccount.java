package assignment;

import java.time.LocalDate;

/**
 *
 * @author hai
 */
public class SavingAccount extends Account implements HasInterest {//SavingAccount la 1 Account, mo rong tu Account

	private LocalDate dateCreated;//ngay created cua 1 accoun
	//khong de final duoc, vi neu la final nghia la gia tri da biet truoc khi code
	private static double interest = 6.0;

	/*====================CONSTRUCTOR==============================*/
	public SavingAccount() {//default constructor
		/**
		 * super();//co hay khong deu duoc owner = null; balance = 0.0d;
		 * dateCreated = null; interest = 6.0
		 */
	}

	public SavingAccount(String owner, double balance) {
		super(owner, balance);//khoi tao cha truoc
		this.dateCreated = LocalDate.now();//
	}


	/*=======================GETTER SETTER===========================*/
	public LocalDate getDateCreated() {
		return this.dateCreated;
	}

	@Override
	public boolean nopTien(double amount) {//increase the balance by the amount given
		if (LocalDate.now().getDayOfMonth() == this.dateCreated.getDayOfMonth()
				&& LocalDate.now().getDayOfMonth() == this.dateCreated.getDayOfMonth()) {//neu hom nay trung ngay + thang voi dateCreated

			if (amount < 0) {//check amount
				return false;
			} else {
				balance += amount;
				return true;
			}
		}
		return false;
	}

	public boolean rutTien(double amount) {//withdraw from balance an amount of money
		if (LocalDate.now().getDayOfMonth() == this.dateCreated.getDayOfMonth()
				&& LocalDate.now().getMonthValue() == this.dateCreated.getMonthValue()) {//neu hom nay trung ngay + thang voi dateCreated

			if (amount < 0 || this.balance - amount < 0) {//check amount
				return false;
			} else {
				balance -= amount;
				return true;
			}
		}
		return false;
	}

	@Override
	public void updateBalance() {//implements interface HasInterest
		if (LocalDate.now().getDayOfMonth() == this.dateCreated.getDayOfMonth()
				&& LocalDate.now().getMonthValue() == this.dateCreated.getMonthValue()) {//neu hom nay trung ngay + thang voi dateCreated

			this.nopTien(this.getInterest() * getBalance() / 100.0);
		}
	}

	@Override
	public void getDetails() {
		System.out.println("\tSavingAccount");
		System.out.println("\tOwner: " + this.owner);
		System.out.println("\tBalance: " + this.balance);
		System.out.println("\tDate created: " + this.dateCreated);
		System.out.println("");
	}
	public void hienThi(){
		System.out.println("aaaaa");
	}

}//class SavingAccount
