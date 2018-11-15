
public class Participant {

	private String Fname;
	private String Sname;
	private String ID;
	private String DateOfBirth;
	private String Telephone;
	private String email;
	private boolean smoker;
	//todo Add list of forms
	public Participant(String first,String sec,String I,String DOB,String Tel,String em,boolean smok) {
		Fname=first;
		Sname=sec;
		ID=I;
		DateOfBirth=DOB;
		Telephone=Tel;
		email=em;
		smoker=smok;
	}
	public void modify(String first,String sec,String I,String DOB,String Tel,String em,boolean smok){
		Fname=first;
		Sname=sec;
		ID=I;
		DateOfBirth=DOB;
		Telephone=Tel;
		email=em;
		smoker=smok;
	}
	public String ret_Fname(){
		if(!LogIn_Screen.is_admin()){
			return "****";
		}
		else{
			return Fname;
		}
	}
	public String ret_Sname(){
		if(!LogIn_Screen.is_admin()){
			return "****";
		}
		else{
			return Sname;
		}
	}
	public String ret_Telephone(){
		if(!LogIn_Screen.is_admin()){
			return "****";
		}
		else{
			return Telephone;
		}
	}
	public String ret_email(){
		if(!LogIn_Screen.is_admin()){
			return "****";
		}
		else{
			return email;
		}
	}
	public String ret_ID(){
		return ID;
	}
	public String ret_Date(){
		return DateOfBirth;
	}
	public boolean ret_smoker(){
		return smoker;
	}
}
