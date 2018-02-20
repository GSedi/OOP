import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner str = new Scanner(System.in);
    	Data dat = new Data();
    	String s = str.next();
    	if(s == "Q") {
    		System.out.print("Average = 0.0");
    		System.out.print("Maximum = 0.0");
    		return;
    	}
    	dat.setData(Double.parseDouble(s));
    	while(s != "Q") {
    		s = str.next();
    		dat.maxData(Double.parseDouble(s));
    		dat.cnt(Double.parseDouble(s));
    	}
    	
    	
    	System.out.println("Maximum = " + dat.setData());
    	System.out.println("Average = " + dat.avgData());
	}

}
