import java.util.*;
import java.io.Serializable;
public class Course implements Serializable {
	private String courseTitle;
	private Textbook textbook;
	private Instructor instructor;
	
	public Course() {
		this.courseTitle = "unknown";
		this.textbook = null;
		this.instructor = null;
		
	}
	
	public Course(String courseTitle, Textbook textbook, Instructor instructor) {
		this.courseTitle = courseTitle;
		this.textbook = new Textbook(textbook.getIsbn(), textbook.getTitle(), textbook.getAuthors());
		this.instructor = new Instructor(instructor.getFirstname(), instructor.getLastName(), instructor.getDepartment(), instructor.getEmail());
	}
	
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public void setTextbook(Textbook textbook) {this.textbook = textbook;}
	public void setInstructor(Instructor instructor) {this.instructor = instructor;}
	
	public String getCourseTitle() {return this.courseTitle;}
	public Textbook getTextbook() {return this.textbook;}
	public Instructor getInstructor() {return this.instructor;}
	
	public boolean equals(Object other) {
		if(other == null) return false;
		if(this == other) return true;
		if(!(other instanceof Course)) return false;
		
		Course course = (Course)other;
		
		if(this.courseTitle.equals(course.courseTitle) && this.textbook.equals(course.textbook) && this.instructor.equals(course.instructor)) return true;
		else return false;
	}
	
	public String toString() {
		return "\nCourse title: " + this.courseTitle + textbook.toString() + instructor.toString();
	}
	
}
