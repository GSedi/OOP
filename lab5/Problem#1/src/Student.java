import java.util.*;
public class Student extends Person implements Comparable {
	private int score;
	 
	private Grade grade;
	public Student() {
		super();
		this.score = 0;
	}
	
	public Student(String name, String surname, int score) {
		super(name, surname);
		this.score = score;
		grade = Grade.F;
	}
	
	public void setScore(int score) {
		this.score = score;	
	}
	public int getScore() {return this.score;}
	
	public void setGrade(Grade grade) {
			this.grade = grade;
	}
	public Grade getGrade() {
			return this.grade;
	}
	
	public int compareTo(Object other) {
		Student s = (Student)other;
		
		if(this.score > s.score) return 1;
		else if(this.score < s.score) return -1;
		else return 0;
	}
	public String toString() {
		return super.toString() + "\nStudent score: " + this.score + "\nGrade: " + this.grade;
	}
}
