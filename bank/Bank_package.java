package bank; //bank class in bank package

//4 access modifiers

class Account
{
	public String name; //:public
//	String name; //:default type : only accessed inside the declared packages
	protected String email;  //only accessed by subclass in other package and current package can access everywhere
    private String password;
    
    //getter
    public String getPassword()
    {
//    	setpassword(randompass); //by default
    	return this.password;
    }
    //setters
    public void setPassword(String pass)
    {
    	this.password=pass;
    }
}
public class Bank_package {
	 
	public String name;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//compiler sees main class for execution
		Account a1=new Account();
		a1.name="apna college";
		a1.email="apnacollege@gmail.com";
//		a1.password; //error as not visible
		a1.setPassword("1234"); //not accessed if we set default setpassword
		System.out.println(a1.getPassword());
		
		//private members can be accessed by using getters and setters

	}

}
