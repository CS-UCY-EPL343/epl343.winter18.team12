import java.util.ArrayList;
import java.util.List;

public class FormA {
	static ArrayList<Attribute> formA;
	static ArrayList<Attribute> formParticipant;
	Form_type type;
	int ID;
	static int counter;
	
	ArrayList<obj_Attribute> attributes;
	//static int totalPoints;
	
	public FormA(Form_type typ) {
		type=typ;
		ID=counter;
		counter++;
	}
	public void add_attrib(obj_Attribute o){
		attributes.add(o);
	}
	public static void create_form(){
		formA=new ArrayList<Attribute>();
		formA.add(new Attribute("Πόσο γρήγορα αφού ξυπνήσετε καπνίζετε το πρώτο σας τσιγάρο;",Form_type.Form1));
		formA.add(new Attribute("Σας είναι δύσκολο να μην καπνίσετε σε μέρη όπου το κάπνισμα απαγορεύεται; (π.χ. εκκλησία, βιβλιοθήκες, σινεμά)",Form_type.Form1));
		formA.add(new Attribute("Ποιο τσιγάρο σας θα σας είναι πιο δύσκολο να μην το καπνίσετε;",Form_type.Form1));
		formA.add(new Attribute("Πόσα τσιγάρα την ημέρα καπνίζετε;",Form_type.Form1));
		formA.add(new Attribute("Καπνίζετε πιο πολύ το πρωί ή το απόγευμα;",Form_type.Form1));
		formA.add(new Attribute("Καπνίζετε και όταν μια αρρώστια σας αναγκάζει να μείνετε στο κρεβάτι;",Form_type.Form1));
		
		formParticipant=new ArrayList<Attribute>();
		formParticipant.add(new Attribute("Name",Form_type.Participant));
		formParticipant.add(new Attribute("Surname",Form_type.Participant));
		formParticipant.add(new Attribute("ID",Form_type.Participant));
		formParticipant.add(new Attribute("Telephone",Form_type.Participant));
		formParticipant.add(new Attribute("DateOfBirth",Form_type.Participant));
		formParticipant.add(new Attribute("Email",Form_type.Participant));
		formParticipant.add(new Attribute("Smoker",Form_type.Participant));
	}
}
