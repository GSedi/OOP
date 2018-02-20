import java.util.*;
public class Main {

	public static void main(String[] args) {
		//ArrayList<Degree> degree = new ArrayList<Degree>(Arrays.asList(Degree.values()));
		//List<Degree> degree = Arrays.asList(Degree.values());
		/*List<Degree> degree =
                new ArrayList<Degree>(EnumSet.allOf(Degree.class));
		System.out.println(degree.toString());
		for(Degree deg : degree) {
			System.out.println(deg.toString());
		}*/
		
		for(Degree value: Degree.values()){
		    System.out.println("name="+value.name());
		}
		

	}

}
