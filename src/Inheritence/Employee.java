package Inheritence;

public class Employee {

	String Name;
	String Address;
	String Occupation;
	float experience;

	public static void main(String[] args) {
		HRExecutive hr = new HRExecutive();
		hr.specialization = new String[] { "Staffing" };
		System.out.println(hr.specialization[0]);
		hr.Name = "Pavan";
		System.out.println(hr.Name);
		hr.conductInterview();
		
		Interviewer interview = new HRExecutive();
		((HRExecutive)interview).specialization = new String[] {"Staff"};
		
	}

	interface Interviewer {
		public void conductInterview();
	}

	static class HRExecutive extends Employee implements Interviewer {
		String specialization[];

		public void conductInterview() {
			System.out.println("HR Executive conducting the interview");
		}

	}
}