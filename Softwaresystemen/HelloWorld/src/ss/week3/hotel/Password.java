package ss.week2.hotel;

public class Password {

	public static String INITIAL = "GERARD";
	public static int MIN_LENGTH = 6;
	public String password;
	public Checker checker;

	public Password() {
		this.password = INITIAL;
	}
	public Checker getChecker(){
		return checker;
	}
	public boolean acceptable(String suggestion){
		return (suggestion.length()>= MIN_LENGTH && !suggestion.contains(" "));
	}
	
	public boolean testWord (String test){
		return(test.equals(password));	
	}
	
	public boolean setWord(String oldpass, String newpass){
		if (testWord(oldpass) && acceptable(newpass)) {
			password = newpass;
			return true;
			
		}
		return false;
	}
	
	
}

