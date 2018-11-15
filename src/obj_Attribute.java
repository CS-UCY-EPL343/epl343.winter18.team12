
public class obj_Attribute extends Attribute{

	int decider;
	String text;
	int value;
	boolean answer;
	public obj_Attribute(String q, Form_type f,String t, int v, boolean a, int d) {
		super(q,f);
		text=t;
		value=v;
		answer=a;
		decider=d;
	}

}
