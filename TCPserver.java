import java.lang.*;
import java.io.*;
import java.net.*;

class TCPserver
{
	public static void main(String args[])
	{
		String data = "TCP server";
		try
		{
			ServerSocket srvr = new ServerSocket(7890);
			Socket skt = srvr.accept();
			System.out.println("Server has connected\n");
			PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
			System.out.print("Sending string: " + data + "\n");
			out.print(data);
			out.close();
			skt.close();
			srvr.close();
		}
		catch(Exception e)
		{
			System.out.print("Not connected\n");
		}
	}
}
