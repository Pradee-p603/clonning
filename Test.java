package clonning;

public class Test {
public static void main(String[] args) throws CloneNotSupportedException {
	
account a =  new account(10);
account a2 = (account) a.clone();
a2.balance = 20;
a.setbalance(10);
a2.setbalance(20);
a.getbalance();
a2.getbalance();
//custmor c = new custmor("pradeep");
//custmor c2 = (custmor)c.clone();
//c2.name = "adesh";
//c2.account.balance = 20;
//c.getname();
//c.account.getbalance();
//c2.account.getbalance();
//c2.getname();
   
} 
}
