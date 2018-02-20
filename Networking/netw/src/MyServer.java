
import java.net.*;
import java.io.*;
public class MyServer {
	public static void main(String [] args) throws IOException{
		System.out.println("-----Calculate Area service-----");
		ServerSocket server = null;
		Socket client = null;
		try {
			server = new ServerSocket(1234);//1234 is an unused port number
		} catch (IOException ie) {
			System.out.println("Cannot open socket.");System.exit(1);
		}
		while(true) {
			try {
				client = server.accept();
				OutputStream clientOut =client.getOutputStream();//Returns:an output stream for writing bytes to this socket. 
				PrintWriter pw = new PrintWriter(clientOut, true);

				InputStream clientIn =client.getInputStream();//Returns an input stream for reading bytes from this socket. 
				BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
				int r = Integer.parseInt(br.readLine());

				double answer = Math.PI*r*r;
				pw.println("Answer is: "+answer);
				System.out.println("1 client connected and requested the area of a circle with radius "+r+". Answer is "+answer);
			} catch (IOException ie) {}
			finally {
				client.close();
			}
		}
	}
}