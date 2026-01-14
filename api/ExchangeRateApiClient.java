package api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateApiClient {

    private static final String API_KEY = System.getenv("EXCHANGE_API_KEY");

    public String getRates(String baseCurrency) {
        try {
            String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + baseCurrency;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao acessar API", e);
        }
    }
}