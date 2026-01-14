package service;

import api.ExchangeRateApiClient;
import com.google.gson.Gson;
import model.ExchangeRateResponse;

public class CurrencyService {

    private final ExchangeRateApiClient apiClient;
    private final Gson gson = new Gson();

    public CurrencyService(ExchangeRateApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public double convert(String from, String to, double amount) {
        String json = apiClient.getRates(from);
        ExchangeRateResponse response =
                gson.fromJson(json, ExchangeRateResponse.class);

        Double rate = response.getConversion_rates().get(to);

        if (rate == null) {
            throw new RuntimeException("Moeda inválida");
        }

        return amount * rate;
    }
}