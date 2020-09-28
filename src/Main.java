import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        var values = new HashMap<String, String>() {{
            put("name", "John Doe");
            put("occupation", "gardener");
        }};

        String requestBody = "{'x' : 10}";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:9999/"))
                .header("Content-Type", "application/json")
                .POST(BodyPublishers.ofString("{\"x\":1}"))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }

}
