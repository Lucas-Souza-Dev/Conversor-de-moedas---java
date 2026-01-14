package model;

import java.time.LocalDateTime;

public class ConversionHistory {
    private String from;
    private String to;
    private double value;
    private double result;
    private String timestamp;

    public ConversionHistory(String from, String to, double value, double result, String timestamp) {
        this.from = from;
        this.to = to;
        this.value = value;
        this.result = result;
        this.timestamp = timestamp;
    }
}