
public class Instructor {

	private String firstName;
	private String lastName;
	private int experienceYear;
	private int phoneNumber;
	
	public Instructor(String firstName, String lastName, int phoneNumber, int experienceYear) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.experienceYear = experienceYear;
		this.phoneNumber = phoneNumber;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getExperienceYear() {
		return experienceYear;
	}
	public void setExperienceYear(int experienceYear) {
		if(experienceYear >= 1) {
			this.experienceYear = experienceYear;
		} else {
		this.experienceYear = 1;
	}
		this.experienceYear = experienceYear;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	

}
