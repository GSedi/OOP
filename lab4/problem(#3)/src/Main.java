
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person("Sedi");
		Person pclone = p.clone();
		pclone.setName("fserfsfsf");
		//System.out.println(p.toString() + "\n" + pclone.toString());
		Employe e = new Employe("Sedi", 5000000, "kcdcmskdcmsdoc");
		Employe eclone = e.clone();
		//e.setSalary(1000000);;
		//e.setName("sfvsdfvsfv");
		e.setInsuranceNumber("abbabbabba");
		
		
		//System.out.println(e.toString()+ "\n" + eclone.toString());
		
		Manager m = new Manager("Sedi", 5000000, "kcdcmskdcmsdoc", 2000);
		Manager mclone = m.clone();
		m.setBonus(99999);
		m.addEmployee(e);
		m.addEmployee(eclone);
		mclone.addEmployee(eclone);
		//System.out.println(m.toString()+ "\n" + mclone.toString());
		m.sort();
		System.out.println(m.getTeam().toString());
	}

}
