package assignment;

/**
 *
 * @author hai
 */
public class Bank {

	private String bankName;
	private Account accountList[];//list cac account o trong bank// ket tap tu Account
	private int accountNumber;//so luong cac account hien co trong bank

	/*==================================================*/
	public Bank(String bankName) {//constructor
		this.bankName = bankName;
		accountList = new Account[100];
		accountNumber = 0;
	}

	/*==================================================*/

	public void addAccount(Account acc) {//truyen vao Account hoac cac subclass cua Account
		//DA HINH
		this.accountList[this.accountNumber] = acc;//luu acc vo list
		this.accountNumber++;
	}

	public void printAllAccount() {
		System.out.println("==========" + this.bankName + "==========");
		for (int i = 0; i < accountNumber; i++) {
			System.out.print(i + 1 + "/");
			accountList[i].getDetails();//dung mothod cua class account
		}
	}

	public double calculateTotalBalance() {
		double totalBalance = 0;
		for (int i = 0; i < accountNumber; i++) {
			totalBalance += accountList[i].getBalance();// dung method tuong ung voi tung class
		}
		return totalBalance;
	}
}//class Bank
