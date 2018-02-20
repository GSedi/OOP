
import java.net.*;
import java.io.*;

public class ReadUrl {
	public static void main(String[] args) throws Exception {
		URL kbtu = new URL("http://www.kbtu.kz/");
		BufferedReader in = new BufferedReader(new InputStreamReader(kbtu.openStream()));
		String inputLine;
		System.out.println("Source code of kbtu.kz");
		while ((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
		in.close();
	}
}

