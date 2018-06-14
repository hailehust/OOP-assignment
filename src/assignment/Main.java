package assignment;

/**
 *
 * @author hai
 */
public class Main {

	public static void main(String[] args) {
		Bank vcb = new Bank("VietcomBank");
		
		Account acc1 = null;
		SavingAccount s = new SavingAccount();
		acc1 = s;
		s.hienThi();
		acc1.getDetails();//getDetails() cua SavingAccount duoc goi
		//khi upcasting: tham chieu cua superlass chi goi duoc cac overriding method cua subclass
		//khong goi duoc cac method moi cua subclass, ma chinh subclass moi goi duoc
		
//		SavingAccount acc3 = new SavingAccount("Hai", 1000000.0);
//		if(acc1 instanceof SavingAccount){//check xem acc6 co down duoc xuong SavingAccount ko?
//			 acc3 = (SavingAccount) acc1;//downcasting Account -> SavingAccount
//		}
//
//
//		vcb.addAccount(acc1);//truyen vao Credit/Saving/CheckingAccount deu ok, vi co tinh da hinh
//		vcb.addAccount(acc2);
//		vcb.addAccount(acc3);
//		
//		vcb.printAllAccount();
//		
//		
	}//main method
}//Main class

