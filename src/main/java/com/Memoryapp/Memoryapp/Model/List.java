package com.Memoryapp.Memoryapp.Model;

import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "list")
public class List<L> {
    @Id
    private String id;
    @NonNull
    private int Day;
    @NonNull
    private int Month;
    @NonNull
    private String Name;

    public List() {
    }
    public List(String id, int Day, int Month, String Name){
        this.id = id;
        this.Day = Day;
        this.Month = Month;
        this.Name = Name;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setDay(int day) {
        Day = day;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return id;
    }

    public int getDay() {
        return this.Day;
    }

    public int getMonth() {
        return Month;
    }

    public String getName() {
        return Name;
    }
}
