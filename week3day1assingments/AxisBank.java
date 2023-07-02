package week3day1assingments;

public class AxisBank extends BankInfo  {
	
	public void deposit() {
		
		System.out.println("Deposit amount : 40000");
		
	}
	
	public static void main(String[] args) {
		
		AxisBank ban = new AxisBank();
		 
		ban.saving();
		ban.deposit();
		ban.fixed();
	}
}
