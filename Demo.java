import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

public class Demo {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		String r = HttpClientWithCookie.get("/login");
		System.out.println(r);
		r = HttpClientWithCookie.get("/status");
		System.out.println(r);
	}

}
