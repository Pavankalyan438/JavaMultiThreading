package tutorials;

public class BankingApplication {
public static void main(String[] args) {
	//states of the class
	
	deposit("Pavan");// calling the method, variables are used during calling
	
	
	
	
}	
//behaviours of the class
public static void deposit(String custName) //parameters
{
	System.out.println("Iam here to deposit "+ custName);
}


public static void withdraw() {
	System.out.println("Iam here to withdraw !!");
}


public static void accountCreation() {
	System.out.println("Iam here to create account !!");
}


public static void loanApply() {
	System.out.println("Iam here to apply loan !!");
}


}
