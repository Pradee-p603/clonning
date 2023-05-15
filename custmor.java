package clonning;

public class custmor implements Cloneable {
public String name = null;
public account account = null;

custmor(){
	
}
custmor(String name){
	this.name = name;
	account = new account(10);
}
public String getname() {
	System.out.println(name);
	return name;
}
public account getaccount() {
	System.out.println(account);
	return account;
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		custmor c = (custmor) super.clone();
		c.account = (account)account.clone();
		return c;
		
	}

}
