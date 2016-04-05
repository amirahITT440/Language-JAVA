import java.lang.*;
import java.io.*;
import java.net.*;

class TCPclient
{
	public static void main(String args[])
	{
		try
		{
			Socket skt = new Socket("localhost", 7890);
			BufferedReader in = new BufferedReader(new InputStreamReader
						(skt.getInputStream()));
			System.out.print("Received string : ");

			while(!in.ready()) {}
			System.out.println(in.readLine());

			System.out.print("\n");
			in.close();
		}
		catch(Exception e)
		{
			System.out.print("Not connected\n");
		}
	}
}
