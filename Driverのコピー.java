import java.util.ArrayList;
import java.util.Scanner; 
import java.util.Arrays;
import java.util.List;

public class Driver {

	public static void main(String[] args) {

		ArrayList<Instructor> instructor = new ArrayList<Instructor>();

		Instructor aidan1 = new Instructor("Aidan", "Dandan",123456789,3);
		Instructor aidan2 = new Instructor("Aidan2", "Dandan2",23232323, 4);
		Instructor aidan3 = new Instructor("Aidan3", "Dandan3",89898989, 5);
		Instructor aidan4 = new Instructor("Aidan4", "Dandan4",19191919, 6);

		Course course1 = new Course("happycourse", 3, aidan1);
		Course course2 = new Course("happycourse2", 5, aidan2);
		Course course3 = new Course("happycours3", 6, aidan3);
		Course course4 = new Course("happycourse4", 2, aidan4);

		ArrayList<Course> list = new ArrayList<Course>();
		list.add(course1);
		list.add(course2);
		list.add(course3);
		list.add(course4);

		printSomething(list);
		Scanner hello = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter instructor first name");

	    String instName = hello.nextLine(); 
	    
	   
	    boolean inst = false;
	    	for (int i = 0; i < list.size(); i++) {
		    	if (instName.equals(list.get(i).getInstructor().getFirstName())) {
		    		System.out.println("Your course is " + list.get(i).getCourseName());
		    		
		    		inst = true;
		    	}
		    }
	    if (inst == false) {
	 	    	System.out.println("This Instructor does not teach any courses");
	    }
	} 

	public static void printSomething(ArrayList <Course> courses,int num) {
		
		System.out.println("Course name is " + courses.get(num).getCourseName() + 
				" which takes " + courses.get(num).getDuration() + " weeks. \n"
						+ "The Instructor of this course is " +
						courses.get(num).getInstructor().getFirstName() +" \n" +
						courses.get(num).getInstructor().getLastName() + " who is \n" +
						getStatus(courses.get(num).getInstructor().getExperienceYear()) +
						" with" + courses.get(num).getInstructor().getExperienceYear() +
						" year of experience. \nThe phone number of Instructor is " +
						courses.get(num).getInstructor().getPhoneNumber() +
						"\n--------------------");
	
		
	}
	
	public static void printSomething(ArrayList <Course> courses) {
		for (Course i : courses) {
		System.out.println("Course name is " + i.getCourseName() + 
				" which takes " + i.getDuration() + " weeks. \n"
						+ "The Instructor of this course is " +
						i.getInstructor().getFirstName() +" \n" +
						i.getInstructor().getLastName() + " who is \n" +
						getStatus(i.getInstructor().getExperienceYear()) +
						" with" + i.getInstructor().getExperienceYear() +
						" year of experience. \nThe phone number of Instructor is " +
						i.getInstructor().getPhoneNumber() +
						"\n--------------------");
	
		}
	}
	
	public static String getStatus(int year) {
		String status = "";
		if (year < 2 ) {
			status = "Junior Instructor";
		} else if (year >=2 && year <4) {
			status = "intermediate Instructor";
		} else {
			status = "Senior Instructor";
		}
		return status;
	}
}
