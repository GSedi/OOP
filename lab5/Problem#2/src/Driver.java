import java.util.*;

import java.io.*;
public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException {
		
			try {
				BufferedReader br = new BufferedReader(new FileReader("admin.txt"));
				BufferedWriter bw	= new BufferedWriter(new FileWriter("admin.txt", true));
				Date dat = null;
				StringTokenizer token;
				Scanner scan = new Scanner(System.in);
				String sw, username, password, line1, line2, firstName, lastName, 
							department, email, title, authors, courseTitle, exit;
				int choice, isbn, hashcon, hashfile;
				Instructor ins = null;
				Textbook book = null;
				Course course = null;
				Vector<Instructor> vi = new Vector<Instructor>();
				Vector<Textbook> vt = new Vector<Textbook>();
				Vector<Course> vc = new Vector<Course>();
				
				FileInputStream fisi = new FileInputStream("vi.ser");
				FileInputStream fist = new FileInputStream("vt.ser");
				FileInputStream fisc = new FileInputStream("vc.ser");
				ObjectInputStream oini = new ObjectInputStream(fisi);
				ObjectInputStream oint = new ObjectInputStream(fist);
				ObjectInputStream oinc = new ObjectInputStream(fisc);
				vi =  (Vector<Instructor>) oini.readObject();
				vt =  (Vector<Textbook>) oint.readObject();
				vc =  (Vector<Course>) oinc.readObject();
				
				
				menu : while(true) {
					System.out.println("Press a to enter as admin");
					System.out.println("Press u to enter as user");
					System.out.println("Press q to enter as exit");
					sw = scan.next();
					if(sw.equals("a")) {
						
						a : while(true) {
							System.out.println("Please enter your username and password or e to go back");
							username = scan.next();
							if(username.equals("e")) {
								continue menu;

							}
							else {
								password = scan.next();
								hashcon = Objects.hash(password);
								br = new BufferedReader(new FileReader("admin.txt"));
								line1 = br.readLine();
								line2 = br.readLine();
								hashfile = Integer.parseInt(line2);
								
								if(username.equals(line1) && hashcon == hashfile) {
								
								dat = new Date();
								bw.newLine();
								bw.write(dat + " admin logged in to a system");
								bw.newLine();
									trueadmin : while(true) {
										System.out.println("To add new course press 1");
										System.out.println("To add new instructor press 2");
										System.out.println("To add new textbook press 3");
										System.out.println("To go back press 4");
										choice = scan.nextInt();
										if(choice == 4) {
											bw.newLine();
											bw.write(dat + " admin logout in to a system");
											bw.newLine();
											continue a;
										}
										else if(choice == 2) {
											System.out.println("Please add folowing fields of instructor: firstname, lastname, department, email");
											firstName = scan.next();
											lastName = scan.next();
											department = scan.next();
											email = scan.next();
											ins = new Instructor(firstName, lastName, department, email);
											vi.add(ins);
											bw.newLine();
											bw.write(dat + " admin added new Instructor \"" + firstName + " " + lastName + "\"");
											bw.newLine();
										}
										else if(choice == 3) {
											System.out.println("Please add folowing fields of textbook: isbn, title, authors");	
											isbn = scan.nextInt();
											title = scan.next();
											authors = scan.next();
											book = new Textbook(isbn, title, authors);
											vt.add(book);
											bw.newLine();
											bw.write(dat + " admin added new Textbook \"" + title + "\"");
											bw.newLine();
											
										}
										else if(choice == 1) {
											System.out.println("Please add folowing fields of course: course title, instructor, textbook");	
											courseTitle = scan.next();
											System.out.println("if you want to add new instructor press 1 else press 2 to choice from existing instructors");
											choice = scan.nextInt();
											if(choice == 1) {
												System.out.println("Please add folowing fields of instructor: firstname, lastname, department, email");
												firstName = scan.next();
												lastName = scan.next();
												department = scan.next();
												email = scan.next();
												ins = new Instructor(firstName, lastName, department, email);
												vi.add(ins);
											}
											else if(choice == 2){
												for(int i = 0; i < vi.size(); i++) {
													System.out.println(i+1 + "-->{\n" + vi.get(i).toString() + "\n}");
												}
												System.out.println("Please enter the index of your instructor(only one)");
												choice = scan.nextInt();
												ins = (Instructor)vi.get(choice-1).clone();
											}
											
											System.out.println("if you want to add new textbook press 1 else press 2 to choice from existing textbooks");
											choice = scan.nextInt();
											
											if(choice == 1) {
												System.out.println("Please add folowing fields of textbook: isbn, title, authors");	
												isbn = scan.nextInt();
												title = scan.next();
												authors = scan.next();
												book = new Textbook(isbn, title, authors);
												vt.add(book);
											}
											else if(choice == 2) {
												for(int i = 0; i < vt.size(); i++) {
													System.out.println(i+1 + "-->{\n" + vt.get(i).toString() + "\n}");
												}
												System.out.println("Please enter the index of your textbook(only one)");
												choice = scan.nextInt();
												book = (Textbook)vt.get(choice-1).clone();
											}
											
											course = new Course(courseTitle, book, ins);
											vc.addElement(course);
											
											bw.newLine();
											bw.write(dat + " admin added new Course \"" + courseTitle + "\"");
											bw.newLine();
											
										}
									}
								
								}
								else {
									System.out.println("Wrong username or password");
									break a;
								}
							}
				
						}
					}
					else if(sw.equals("u")) {
						u: while(true) {
							System.out.println("Press 1 to view the list of available courses");
							System.out.println("Press 2 to display information about the course");
							System.out.println("Press 3 to go back");
							choice = scan.nextInt();
							if(choice == 1) {
								
								for(int i = 0; i < vc.size(); i++) {
									System.out.println(i+1 + ") " + vc.get(i).getCourseTitle());
								}
								System.out.println("Press e to go back");
								exit = scan.next();
								if(exit.equals("e")){
									 continue u;
								}
							}
							else if(choice == 2) {
								for(int i = 0; i < vc.size(); i++) {
									System.out.println(i+1 + ") " + vc.get(i).getCourseTitle());
								}
								
								while(true) {
									System.out.println("Please enter the index of course, wich about you want get more information or press 0 to go back");
									choice = scan.nextInt();
									if(choice == 0) {
										continue u;
									}
									else {
										System.out.println(vc.get(choice -1).toString());
									}
								}
							}
							else if(choice == 3){
								continue menu;
							}
						}
					}
					else if(sw.equals("q"))
						break;
				}
				FileOutputStream fosi = new FileOutputStream("vi.ser");
				FileOutputStream fost = new FileOutputStream("vt.ser");
				FileOutputStream fosc = new FileOutputStream("vc.ser");
				ObjectOutputStream oosi = new ObjectOutputStream(fosi);
				ObjectOutputStream oost = new ObjectOutputStream(fost);
				ObjectOutputStream oosc = new ObjectOutputStream(fosc);
				
				oosi.writeObject(vi);
				oost.writeObject(vt);
				oosc.writeObject(vc);
				oosi.flush();
				oosi.close();
				oost.flush();
				oost.close();
				oosc.flush();
				oosc.close();
				
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
