import java.util.ArrayList;
import java.util.List;

public class FormA {
	static ArrayList<Attribute> formA;
	static ArrayList<Attribute> formParticipant;
	Form_type type;
	
	ArrayList<obj_Attribute> attributes;
	//static int totalPoints;
	
	public FormA(Form_type typ) {
		type=typ;
	}
	public void add_attrib(obj_Attribute o){
		attributes.add(o);
	}
	public static void create_form(){
		formA.add(new Attribute("���� ������� ���� ��������� ��������� �� ����� ��� �������;",Form_type.Form1));
		formA.add(new Attribute("��� ����� ������� �� ��� ��������� �� ���� ���� �� �������� ������������; (�.�. ��������, �����������, ������)",Form_type.Form1));
		formA.add(new Attribute("���� ������� ��� �� ��� ����� ��� ������� �� ��� �� ���������;",Form_type.Form1));
		formA.add(new Attribute("���� ������� ��� ����� ���������;",Form_type.Form1));
		formA.add(new Attribute("��������� ��� ���� �� ���� � �� ��������;",Form_type.Form1));
		formA.add(new Attribute("��������� ��� ���� ��� �������� ��� ��������� �� ������� ��� �������;",Form_type.Form1));
		
		formParticipant.add(new Attribute("Name",Form_type.Participant));
		formParticipant.add(new Attribute("Surname",Form_type.Participant));
		formParticipant.add(new Attribute("ID",Form_type.Participant));
		formParticipant.add(new Attribute("Telephone",Form_type.Participant));
		formParticipant.add(new Attribute("DateOfBirth",Form_type.Participant));
		formParticipant.add(new Attribute("Email",Form_type.Participant));
		formParticipant.add(new Attribute("Smoker",Form_type.Participant));
	}
}
