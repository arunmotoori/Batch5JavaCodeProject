package interfacespack;

public class Demo {

	public static void main(String[] args) {
		
		HDFCBank hdfcBank = new HDFCBank();
		hdfcBank.openAccount();
		hdfcBank.depositMoney();
		hdfcBank.transferMoney();
		hdfcBank.withdrawMoney();
		hdfcBank.closeAccount();
		System.out.println(Bank.accountTypeOne);
		System.out.println(Bank.accountTypeTwo);
		Bank.closeFD();
		hdfcBank.openFD();
		
	}

}
