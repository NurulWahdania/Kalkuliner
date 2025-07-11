package com.example.projek.Model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Property implements Serializable {
    @SerializedName("name")
    private String name;
    @SerializedName("amount")
    private Double amount;
    @SerializedName("unit")
    private String unit;

    // Constructor, Getters, Setters
    public Property(String name, Double amount, String unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }
}