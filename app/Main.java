package app;

import api.ExchangeRateApiClient;
import service.CurrencyService;
import service.HistoryService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Moeda origem (ex: USD): ");
        String from = sc.nextLine().toUpperCase();

        System.out.print("Moeda destino (ex: BRL): ");
        String to = sc.nextLine().toUpperCase();

        System.out.print("Valor: ");
        double value = sc.nextDouble();

        ExchangeRateApiClient apiClient = new ExchangeRateApiClient();
        CurrencyService service = new CurrencyService(apiClient);
        HistoryService historyService = new HistoryService();

        double result = service.convert(from, to, value);
        System.out.printf("Resultado: %.2f %s%n", result, to);

        historyService.save(from, to, value, result);
    }
}