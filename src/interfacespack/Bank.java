package interfacespack;

public interface Bank {
	
	String accountTypeOne = "Savings";  // static and final type by default
	String accountTypeTwo = "Current";
	
	public void openAccount();  // abstract methods by default
	public void depositMoney();
	public void transferMoney();
    public void withdrawMoney();
    public void closeAccount();
    
    default void openFD() {
    	
    }
    
    static void closeFD() {
    	System.out.println("Bank FD Closed");
    }
    

}

class HDFCBank implements Bank {
	
	public void openFD() {
		System.out.println("HDFC Bank FD got opened");
	}

	public void openAccount() {
		System.out.println("HDFC Bank Account got opened");
	}

	public void depositMoney() {
		System.out.println("Money got deposited into HDFC Bank");
	}

	public void transferMoney() {
		System.out.println("Transfering money from HDFC Bank");
	}

	public void withdrawMoney() {
		System.out.println("Withdrawing Money from HDFC Bank");
	}

	public void closeAccount() {
		System.out.println("Closing Account in HDFC Bank");
	}
	

}
