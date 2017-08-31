package networking;

import java.io.IOException;
import java.net.URL;

public class URLDemo {

	public static void main(String[] args) {
		try{
			URL url = new URL("http://www.amrood.com/index.html?language=en#j2se");
			System.out.println("URL is " + url.toString());
			System.out.println("Protocol is " + url.getProtocol());
			System.out.println("Authority is " + url.getAuthority());
			System.out.println("file name is " + url.getFile());
			System.out.println("host is " + url.getHost());
			System.out.println("path is " + url.getPath());
			System.out.println("port is " + url.getPort());
			System.out.println("default port is " + url.getDefaultPort());
			System.out.println("query is " + url.getQuery());
			System.out.println("ref is " + url.getRef());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
