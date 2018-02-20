import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		try {
			Vector<Student> students = new Vector<Student>();
			 BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
	         BufferedWriter bw = new BufferedWriter(new FileWriter("grades.txt", true));
	         
	       
	         String name, surname, line = br.readLine(), sc;
	         int score;
	         Student s;
	         StringTokenizer token;
	         while(line != null) {
				token = new StringTokenizer(line, " ", false);
				name = token.nextToken();
				surname = token.nextToken();
				score = Integer.parseInt(token.nextToken());
				s = new Student(name, surname, score);
				students.add(s);
				line = br.readLine();
	         }
	         students.sort(null);
	         int cnt = 0;
			for(int i = 0; i < students.size(); i++) {
				cnt+= students.get(i).getScore();
				if(students.get(i).getScore() > students.get(3).getScore()-10) {
					students.get(i).setGrade(Grade.A);
				}
				else if(students.get(i).getScore() >= students.get(3).getScore()-20) {
					students.get(i).setGrade(Grade.B);
				}
				else if(students.get(i).getScore() >= students.get(3).getScore()-30) {
					students.get(i).setGrade(Grade.C);
				}
				else if(students.get(i).getScore() >= students.get(3).getScore()-40) {
					students.get(i).setGrade(Grade.D);
				}
				else {
					students.get(i).setGrade(Grade.F);
				}
					
			}
			
			for(int i = students.size()-1; i >= 0; i-- ) {
				bw.write(students.size()-i + ") " + students.get(i).getSurname() + " " + students.get(i).getName() + " - \"" + students.get(i).getGrade() + "\"");
			
				bw.newLine();
			}
			
			bw.write("Average - " + cnt/students.size());
			bw.newLine();
			bw.write("Maximum - " + students.get(students.size()-1).getScore());
			bw.newLine();
			bw.write("Minimum - " + students.get(0).getScore());
			
			br.close();
			bw.close();
		}
		catch(FileNotFoundException fe) {
            System.out.println("File not found");
		} catch(IOException ioe) {
            System.out.println("Can’t read from file");
    }
	}

}
