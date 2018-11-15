import java.util.ArrayList;
import java.util.List;

public class FormA {
	static List<Attribute> formAttributes;
	static Form_type type;
	//static int totalPoints;
	
	public FormA(Form_type type) {
		// TODO Auto-generated constructor stub
		this.type=type;
		
		formAttributes = new ArrayList<Attribute>();
		switch(type){
		case Participant:
			formAttributes.add(new Attribute("Name",Form_type.Participant));
			formAttributes.add(new Attribute("Surname",Form_type.Participant));
			formAttributes.add(new Attribute("ID",Form_type.Participant));
			formAttributes.add(new Attribute("Telephone",Form_type.Participant));
			formAttributes.add(new Attribute("DateOfBirth",Form_type.Participant));
			formAttributes.add(new Attribute("Email",Form_type.Participant));
			formAttributes.add(new Attribute("Smoker",Form_type.Participant));
			break;
		case Form1: 
			formAttributes.add(new Attribute("���� ������� ���� ��������� ��������� �� ����� ��� �������;",Form_type.Form1));
			formAttributes.add(new Attribute("��� ����� ������� �� ��� ��������� �� ���� ���� �� �������� ������������; (�.�. ��������, �����������, ������)",Form_type.Form1));
			formAttributes.add(new Attribute("���� ������� ��� �� ��� ����� ��� ������� �� ��� �� ���������;",Form_type.Form1));
			formAttributes.add(new Attribute("���� ������� ��� ����� ���������;",Form_type.Form1));
			formAttributes.add(new Attribute("��������� ��� ���� �� ���� � �� ��������;",Form_type.Form1));
			formAttributes.add(new Attribute("��������� ��� ���� ��� �������� ��� ��������� �� ������� ��� �������;",Form_type.Form1));
			break;
		}
		
			
		
	}

}
