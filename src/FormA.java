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
	public static void delete_form() {
		counter--;
	}
	public FormA(Form_type typ) {
		attributes=new ArrayList<obj_Attribute>();
		type=typ;
		ID=counter;
		counter++;
	}
	public void add_attrib(obj_Attribute o){
		attributes.add(o);
	}
	public static void create_form(){
		formA=new ArrayList<Attribute>();
		formA.add(new Attribute("���� ������� ���� ��������� ��������� �� ����� ��� �������;",Form_type.Form1));
		formA.add(new Attribute("��� ����� ������� �� ��� ��������� �� ���� ���� �� �������� ������������; (�.�. ��������, �����������, ������)",Form_type.Form1));
		formA.add(new Attribute("���� ������� ��� �� ��� ����� ��� ������� �� ��� �� ���������;",Form_type.Form1));
		formA.add(new Attribute("���� ������� ��� ����� ���������;",Form_type.Form1));
		formA.add(new Attribute("��������� ��� ���� �� ���� � �� ��������;",Form_type.Form1));
		formA.add(new Attribute("��������� ��� ���� ��� �������� ��� ��������� �� ������� ��� �������;",Form_type.Form1));
		
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
