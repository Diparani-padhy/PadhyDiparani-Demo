package ATM.oops.java;

public class ATM {
   private double balance;
   private double depositAmount;
   private double withdrawAmount;
   
   //default constructor
   public ATM() {
	   
   }
   
   //GETTER SETTER
   public double getbalance() {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance = balance;
	}
	public double getdepositAmount() {
		return depositAmount;
	}
	public void setdepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public double getwithdrawAmount() {
		return withdrawAmount;
	}
	public void setwithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
}
