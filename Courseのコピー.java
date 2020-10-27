
public class Course {

	private String courseName;
	private int duration;
	private Instructor instructor;

	public Course(String courseName, int duration, Instructor instructor) {

		this.courseName = courseName;
		this.duration = duration;
		this.instructor = instructor;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		if(duration >= 4) {
			this.duration = duration;
		} else {
		this.duration = 4;
	}
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

}
