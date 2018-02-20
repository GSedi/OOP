import java.util.*;
public class Manager extends Employe  {
	private double bonus;
	private Vector<Employe> team;
	
	public Manager() {
		super();
		this.bonus = 0;
		this.team = new Vector();
	}
	
	public Manager(String name, double salary, String insuranceNumber, double bonus) {
		super(name, salary,insuranceNumber);
		this.bonus = bonus;
		this.team = new Vector();
	}
	
	public void addEmployee(Employe employee) {
		team.add(employee);
	}
	public void sort() {
		Collections.sort(this.team);
	}
	
	
	public String getTeam() {return this.team.toString();}
	
	public void setBonus(double bonus) {this.bonus = bonus;}
	public double getBonus() {return this.bonus;}
	
	
	public boolean equals(Object other) {
		if(other == null) return false;
		if(this == other) return true;
		if(!(other instanceof Person)) return false;
			
		Manager m = (Manager)other;
		
		if(super.equals(other) && this.bonus == m.getBonus() && this.team.toArray().equals(m.team.toArray())) return true;
		else return false;
	}
	
	public int compareTo(Object other) {
		Manager m = (Manager)other;
		if(super.compareTo(other) == 0) {
			if(this.bonus < m.getBonus()) return -1;
			else if(this.bonus > m.getBonus()) return 1;
			else return 0;
		}
		else return super.compareTo(other);
	}
	
	public String toString() {
		return super.toString() + "\n Manager {\nBonus: " + this.bonus + "\n}\n" + "Team:\n" + this.getTeam() + "\n" ;
	}
	
	public Manager clone() throws CloneNotSupportedException{
		Manager m = (Manager)super.clone();
		m.bonus = this.bonus;
		m.team = (Vector)this.team.clone();
		return m;
		
	}
	
	
}
