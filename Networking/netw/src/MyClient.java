
import java.io.*;
import java.net.*;
public class MyClient {
	public static void main(String args[]) {
		try {
		    Socket client =new Socket(InetAddress.getLocalHost(),1234);
			//Socket client =new Socket("178.90.65.165",1234);
			InputStream clientIn =client.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
			
			OutputStream clientOut =client.getOutputStream();
			PrintWriter pw = new PrintWriter(clientOut,true);
			
			BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter radius, please: ");
			pw.println(stdIn.readLine());
			System.out.println("Server message: "+ br.readLine());
			
			pw.close();
			br.close();
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