
import java.io.*;
import java.net.*;
import java.util.Vector;
public class ClientTeacher {
	public static void main(String args[]) throws ClassNotFoundException {
		try {
		    Socket client =new Socket(InetAddress.getLocalHost(),1234);
			InputStream clientIn =client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(clientIn);
		    
			OutputStream clientOut =client.getOutputStream();
			PrintWriter pw = new PrintWriter(clientOut,true);
			
		    Vector<Student> s = (Vector<Student>)ois.readObject();
			for(int i=0; i<s.size(); i++) System.out.println(i+ ")"+s.get(i).name+" "+s.get(i).gpa);
			
			BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter student index and mark ");
			pw.println(stdIn.readLine());
			
			System.out.println("Updated successfully!");
			pw.close();
			ois.close();
			client.close();
		} catch (ConnectException ce) {
			System.out.println("Cannot connect to the server.");
		} catch (IOException ie) {
			System.out.println("I/O Error.");
		}
		finally {
			System.out.println("Bye!");
		}
	}
}