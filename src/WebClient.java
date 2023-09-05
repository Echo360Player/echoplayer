import java.io.IOException;
import java.net.http.*;
import java.net.URI;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.*;

class WebClient {

    public WebClient() { }

    public static void main(String[] args) throws IOException, InterruptedException {
		HttpClient client = HttpClient
				.newBuilder()
				.followRedirects(HttpClient.Redirect.NORMAL)
				.build();

		HttpRequest request = HttpRequest
				.newBuilder()
				.uri(URI.create("https://echo360.net.au/media/3dbbe835-0eea-43ff-83b2-32b7a3df63e8/transcription/latest"))
				.build();

		HttpResponse<String> response = client
				.send(request, BodyHandlers.ofString());

		Map<String, List<String>> headers = response.headers().map();
		String body = response.body();

		System.out.printf(
				"Header: %s\nBody: %s\n",
				headers,
				body);
	}

}
