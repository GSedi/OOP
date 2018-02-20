
import java.net.*;
import java.io.*;
import java.util.*;

//import Serialization.Book;
public class IntranetServer {
	static Vector<Student> students = new Vector<Student>();
	static Vector<Student> deserialize() throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("students.out");
		ObjectInputStream oin = new ObjectInputStream(fis);
		Vector<Student> b = (Vector<Student>) oin.readObject(); fis.close(); oin.close();
		return b;
	}
	static void serialize() throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("students.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(students);oos.flush();oos.close();fos.close();
	}
	public static void main(String [] args) throws IOException, ClassNotFoundException{
		ServerSocket server = null;
		Socket client = null;
		boolean ok = true;
		try {
			server = new ServerSocket(1234);
		} catch (IOException ie) {
			System.out.println("Cannot open socket."); System.exit(1);
		}
		System.out.println("---Intranet Server at kbtu.kz---");
		if(new File("students.out").exists()) students = deserialize();
		
		while(ok) {
			try {
				client = server.accept();
				OutputStream clientOut =client.getOutputStream();//Returns:an output stream for writing bytes to this socket. 
				ObjectOutputStream  oos = new ObjectOutputStream(clientOut);	

				InputStream clientIn =client.getInputStream();//Returns an input stream for reading bytes from this socket. 
				BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));

				oos.writeObject(students);

				String ans[] = (br.readLine()).split(" ");
				int index  = Integer.parseInt(ans[0]); double mark = Integer.parseInt(ans[1]);
				students.get(index).setGpa(mark);
				oos.close();
				serialize();
				System.out.println("1 teacher connected and put mark "+mark+" to  "+students.get(index).name);
			} catch (IOException ie) {ie.printStackTrace();}
		}
		client.close();
	}
}