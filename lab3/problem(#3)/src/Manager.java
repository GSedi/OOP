import java.util.*;
public class Manager extends Employee {
	
	private double bonus;
	private Vector<Employee> team;
	
	public Manager() {
		super();
		this.bonus = 0;
		this.team = new Vector();
	}
	
	public Manager(String name, double salary, int year, String insuranceNumber, double bonus) {
		super(name, salary, year, insuranceNumber);
		this.bonus = bonus;
		this.team = new Vector();
	}
	
	public void addEmployee(Employee employee) {
		team.add(employee);
	}
	
	public String getTeam() {return this.team.toString();}
	
	public void setBonus(double bonus) {this.bonus = bonus;}
	public double getBonus() {return this.bonus;}
	
	
	public boolean equals(Manager m) {
		if(super.equals(m) && this.bonus == m.bonus) return true;
		else return false;
	}
	
	public String toString() {
		return super.toString() + "\n Manager {\nBonus: " + this.bonus + "\n}\n" + "Team:\n" + this.getTeam() ;
	}
}
