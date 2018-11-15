import java.util.ArrayList;

public class Participant {

	/**static ArrayList<Attribute> st_part_attr= new ArrayList<Attribute>();
	static Attribute fir=new Attribute("Fname",Form_type.Participant);
	static Attribute se=new Attribute("Sname",Form_type.Participant);
	static Attribute id=new Attribute("ID",Form_type.Participant);
	static Attribute DoB=new Attribute("DateOfBirth",Form_type.Participant);
	static Attribute Tel=new Attribute("Telephone",Form_type.Participant);
	static Attribute em=new Attribute("Email",Form_type.Participant);
	static Attribute smok=new Attribute("Smoker",Form_type.Participant);**/
	
	
	ArrayList<obj_Attribute> part_attr= new ArrayList<obj_Attribute>();
	obj_Attribute Fname;
	obj_Attribute Sname;
	obj_Attribute ID;
	obj_Attribute DateOfBirth;
	obj_Attribute Telephone;
	obj_Attribute email;
	obj_Attribute smoker;
	
	static boolean start=false;
	
	//todo Add list of forms
	ArrayList<FormA> part_forms = new ArrayList<FormA>();
	
	
	
	//0 String,1 integer,2 boolean for decider
	public Participant(String first,String sec,String I,String DOB,String Tele,String ema,boolean smoke) {
		/**if(!start){
			st_part_attr.add(fir);
			st_part_attr.add(se);
			st_part_attr.add(id);
			st_part_attr.add(DoB);
			st_part_attr.add(Tel);
			st_part_attr.add(em);
			st_part_attr.add(smok);
			start=true;
			
		}**/
		Fname=new obj_Attribute("Fname",Form_type.Participant,first,0,false,0);
		Sname=new obj_Attribute("Sname",Form_type.Participant,sec,0,false,0);
		ID=new obj_Attribute("ID",Form_type.Participant,I,0,false,0);
		DateOfBirth=new obj_Attribute("DateOfBirth",Form_type.Participant,DOB,0,false,0);
		Telephone=new obj_Attribute("Telephone",Form_type.Participant,Tele,0,false,0);
		email=new obj_Attribute("Email",Form_type.Participant,ema,0,false,0);
		smoker=new obj_Attribute("Smoker",Form_type.Participant,null,0,smoke,2);
		part_attr.add(Fname);
		part_attr.add(Sname);
		part_attr.add(ID);
		part_attr.add(DateOfBirth);
		part_attr.add(Telephone);
		part_attr.add(email);
		part_attr.add(smoker);
	}
	public void modify(String first,String sec,String I,String DOB,String Tel,String em,boolean smok){
		part_attr.get(0).text=first;
		part_attr.get(1).text=sec;
		part_attr.get(2).text=I;
		part_attr.get(3).text=DOB;
		part_attr.get(4).text=Tel;
		part_attr.get(5).text=em;
		part_attr.get(5).answer=smok;
		
	}
	public obj_Attribute ret_attr(String s){
		for(int i=0;i<part_attr.size();i++){
			if(part_attr.get(i).question.compareTo(s)==0){
				return part_attr.get(i);
			}
		}
		return null;
	}
	public void add_form(FormA f){
		part_forms.add(f);
	}
}
