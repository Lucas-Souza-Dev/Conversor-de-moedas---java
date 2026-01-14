package service;

import com.google.gson.Gson;
import model.ConversionHistory;

import java.io.FileWriter;
import java.time.LocalDateTime;

public class HistoryService {

    private final Gson gson = new Gson();

    public void save(String from, String to, double value, double result) {
        try (FileWriter writer = new FileWriter("history.json", true)) {
            ConversionHistory history =
                    new ConversionHistory(from, to, value, result, LocalDateTime.now().toString());

            writer.write(gson.toJson(history) + "\n");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar histórico", e);
        }
    }
}