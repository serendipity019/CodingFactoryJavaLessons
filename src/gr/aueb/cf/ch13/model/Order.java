package gr.aueb.cf.ch13.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Order {
    private int nomOfOrders;
    private int id;
    private double amount;
    private LocalDateTime timestamp;
    private String uuid; // This gone to be with random UUID numbers in overloaded constructor
    private String description;
    private String state;
    private String formattedTimestamp;

    public Order() {
        nomOfOrders++;
    }

    public Order(int id, double amount, String state, String description) {
        this.id = id;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.uuid = UUID.randomUUID().toString();
        this.state = state;
        this.description = description;
        this.formattedTimestamp = this.timestamp.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        nomOfOrders++;
    }

    public int getNomOfOrders() {
        return nomOfOrders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormattedTimestamp() {
        return formattedTimestamp;
    }

    public void setFormattedTimestamp(String formattedTimestamp) {
        this.formattedTimestamp = formattedTimestamp;
    }
}
