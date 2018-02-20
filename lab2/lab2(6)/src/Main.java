import java.util.Scanner;
public class Main {
	public static String inWords(int num) {
		String s = "";
		
		String[] w = new String[20];
		w[0] = "zero";
		w[1] = "one";
		w[2] = "two";
		w[3] = "three";
		w[4] = "four";
		w[5] = "five";
		w[6] = "six";
		w[7] = "seven";
		w[8] = "eight";
		w[9] = "nine";
		w[10] = "ten";
		w[11] = "eleven";
		w[12] = "twelve";
		w[13] = "thirteen";
		w[14] = "fourteen";
		w[15] = "fifteen";
		w[16] = "sixteen";
		w[17] = "seventeen";
		w[18] = "eighteen";
		w[19] = "nineteen";
		
		String[] q = new String[8];
		q[0] = "twenty";
		q[1] = "thirty";
		q[2] = "forty";
		q[3] = "fifty";
		q[4] = "sixty";
		q[5] = "seventy";
		q[6] = "eighty";
		q[7] = "ninety";
		
		
		
		if(num >= 0 && num < 20) {
			for(int i = 0; i <= 19; i++ ) {
				if(num == i) {
					s += w[i];
				}
			}
		}
		else if(num >= 20 && num < 100) {
			int a = num/10;
			int b = num%10;
			for(int i = 2; i <= 9; i++ ) {
				if(a == i) {
					s += q[i - 2] + " ";
				}
				
			}
			for(int i = 1; i <= 9; i++ ) {
				if(i == b) {
					s += w[i];
				}
			}
		}
		else if(num >= 100 && num < 1000) {
			int a = num/100;
			int b = (num%100)/10;
			int c = (num%100)%10;
			int d = num%100;
			for(int i = 1; i <= 9; i++ ) {
				if(b==0 && c==0) {
					if(i == a) {
						s += w[i] + " hundred";
					}
				}
				else {
				if(i == a) {
					s += w[i] + " hundred" + " [and] ";
				}
				}
			}
			for(int i = 10; i <= 19; i++ ) {
				if(d == i) {
					s += w[i];
					return s;
				}
			}
			for(int i = 2; i <= 9; i++ ) {
				if(b == i) {
					s += q[i - 2] + " ";
				}
				
			}
			for(int i = 1; i <= 9; i++ ) {
				if(i == c) {
					s += w[i];
				}
			}
		}
		else if(num >=1000 && num < 10000) {
			int a = num/1000;
			int b = (num%1000)/100;
			int c = ((num%1000)%100)/10;
			int d = ((num%1000)%100)%10;
			int e =( num%1000)%100;
			
			for(int i = 1; i <= 19; i++) {
				if(a == i) {
					s += w[i] + " thousand ";
				}
				
			}
			
			
			for(int i = 1; i <= 9; i++) {
				if(c==0 && d==0) {
					if(i == b) {
						s += w[i] + " hundred";
					}
				}
				else {
				if(i == b) {
					s += w[i] + " hundred" + " [and] ";
				}
				}
			}
			for(int i = 10; i <= 19; i++ ) {
				if(e == i) {
					s += w[i];
					return s;
				}
			}
			for(int i = 2; i <= 9; i++ ) {
				if(c == i) {
					s += q[i - 2] + " ";
				}
			}
			
			for(int i = 1; i <= 9; i++ ) {
				if(i == d) {
					s += w[i];
				}
			}
		}
		
		else if(num >=10000 && num < 100000) {
			int a = num/1000;
			int b = (num%1000)/100;
			int c = ((num%1000)%100)/10;
			int d = ((num%1000)%100)%10;
			int e =( num%1000)%100;
			if(a < 20) {
			for(int i = 1; i <= 19; i++) {
				if(a == i) {
					s += w[i] + " thousand ";
				}
				
			}
			}else {
				int x = a/10;
				int y = a%10;
				
				for(int i = 2; i <= 9; i++ ) {
					if(x == i) {
						s += q[i - 2] + " ";
					}
				}
				
				for(int i = 1; i <= 9; i++) {
					if(y == i) {
						s += w[i] + " thousand ";
					}
					
				}
				
			}
			
			for(int i = 1; i <= 9; i++) {
				if(c==0 && d==0) {
					if(i == b) {
						s += w[i] + " hundred";
					}
				}
				else {
				if(i == b) {
					s += w[i] + " hundred" + " [and] ";
				}
				}
			}
			for(int i = 10; i <= 19; i++ ) {
				if(e == i) {
					s += w[i];
					return s;
				}
			}
			for(int i = 2; i <= 9; i++ ) {
				if(c == i) {
					s += q[i - 2] + " ";
				}
			}
			
			for(int i = 1; i <= 9; i++ ) {
				if(i == d) {
					s += w[i];
				}
			}
			
			
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int n = num.nextInt();
		System.out.println(n + " - " + inWords(n));
		
		
		
		num.close();

	}

}
