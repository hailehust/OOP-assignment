
package assignment;

/**
 *
 * @author hai
 */
public class CheckingAccount extends Account{
	
	
	/*================ CONSTRUCTOR ====================*/
	/**
	 * khong the ke thua lop constructor cua superclass
	 * phai tu define constructor cho subclass
	 */
	public CheckingAccount(){
		
	}
	public CheckingAccount(String owner, double balance){
		super(owner, balance);//cau lenh dau tien cua constructor cua subclass la goi constructor cua superclass
	}
	/*================ ====================*/
	@Override
	public void getDetails() {//display information
		System.out.println("\tCheckingAccount");
		System.out.println("\tOwner: " + this.owner);
		System.out.println("\tBalance: " + this.balance);
		System.out.println("");
	}
}//class CheckingAccount
