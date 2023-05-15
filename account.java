package clonning;

public class account implements Cloneable {
	public int balance = 0 ;
	public account() {
	}
	public account(int balance) {
		this.balance= balance;
	}
	public int getbalance() {
		System.out.println(balance);
		return balance;
	}
  
		
	
	
	public void setbalance(int balance) {
		this.balance = balance;
		
}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
	

}
