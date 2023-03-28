package Utilities;

public class CustomClass {
	
	//Cutom class for creating the resusable functions
	
	
	
	//Random string generator it can be used for creating random campaign name/user name/ beneficiary name
	public String randomStringGenerator() {

		String mailBody= "test"+(int)(Math.random()*100);
		return mailBody;

	}

	
	//This methode will generates some random email address
	public String emailGenerator() {

		String email= "nihamathulla+"+randomStringGenerator()+"@qburst.com";
		System.out.println(email);
		return email;

	}

}
