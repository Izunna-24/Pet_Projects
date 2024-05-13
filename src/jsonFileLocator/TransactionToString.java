package jsonFileLocator;

import java.time.LocalDateTime;

public class TransactionToString {
    private String name;
    private String id;
    private Type type;
    private int amount;
    private LocalDateTime date;

    public TransactionToString(String name, String id, Type type, int amount, LocalDateTime date){
        this.name = name;
        this.amount = amount;
        this.date = date;
        this.id = id;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
