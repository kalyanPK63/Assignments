package Html;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class htmlRequest {
    public static void main(String[] args) throws IOException, InterruptedException {
        String uri = "https://httpbin.org/get";
        HttpRequest req = HttpRequest.newBuilder().uri(URI.create(uri))
                .GET().build();
        HttpClient c = HttpClient.newBuilder().build();
        HttpResponse<String> response = c.send(req, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.headers());
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
