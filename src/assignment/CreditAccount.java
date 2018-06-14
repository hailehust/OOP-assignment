package assignment;

import java.time.LocalDate;

/**
 *
 * @author hai
 */
public class CreditAccount extends Account implements HasInterest {

	public static double limit = 30000000.0;//so tien cho phep no toi da
	private static double creditInterest = 10;//lai suat no = 20% //ko de final vi sau nay co the thay doi
	private static double debitInterest = 5;//lau suat co = 5%
	private LocalDate dateCreated;//ngay tap creatditAccount

	/*================== CONSTRUCTOR =========================*/
	public CreditAccount() {

	}

	public CreditAccount(String owner, double balance) {
		super(owner, balance);
		this.dateCreated = LocalDate.now();
	}

	/*================== GETT SETTER===================*/

	public static double getLimit() {
		return limit;
	}

	public static void setLimit(double limit) {
		CreditAccount.limit = limit;
	}

	public static double getCreditInterest() {
		return creditInterest;
	}

	public static void setCreditInterest(double creditInterest) {
		CreditAccount.creditInterest = creditInterest;
	}

	public static double getDebitInterest() {
		return debitInterest;
	}

	public static void setDebitInterest(double debitInterest) {
		CreditAccount.debitInterest = debitInterest;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	/*================== =========================*/
	@Override
	public boolean nopTien(double amount) {//increase the balance by the amount given
		if (amount < 0) {//check amount
			return false;
		} else {
			balance += amount;
			return true;
		}
	}

	@Override
	public boolean rutTien(double amount) {
		if (amount > 0 && this.balance - amount >= -CreditAccount.limit) {
			this.balance -= amount;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void updateBalance() {//implements interface HasInterst
		if (this.balance > 0) {
			this.nopTien((CreditAccount.debitInterest / 100.0) * this.getBalance());
		} else {
			this.rutTien(-((CreditAccount.creditInterest) / 100 * this.getBalance()));
		}
	}

	@Override
	public void getDetails() {
		System.out.println("\tCreditAccount");
		System.out.println("\tOwner: " + this.getOwner());
		System.out.println("\tBalance: " + this.getBalance());
		System.out.println("\tDate created: " + this.getDateCreated());
		System.out.println("\tLimit : " + CreditAccount.getLimit());
		System.out.println("");
	}

}//class CreditAccount
