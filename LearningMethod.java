package basics;

public class LearningMethod {

	int marks;
	
String message;
	
	
	void fan(){
		
		 message = "Your fan is running";
		System.out.println(message);
		
	}
	
	void light() {
		 message = "Your light is running";
		System.out.println(message);
	}
	
	
	void charger() {
	    message = "Your charger is running";
		System.out.println(message);
	}
	
	public static void main(String args[]) {
		
		LearningMethod obj = new LearningMethod();
		
		obj.fan();
		obj.light();
		obj.charger();
		
		
	}
	
	
}
