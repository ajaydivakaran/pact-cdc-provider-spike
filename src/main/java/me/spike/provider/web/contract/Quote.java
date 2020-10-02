package me.spike.provider.web.contract;

public class Quote {
    private final String message;
    private final String id;

    public Quote(String message, String id) {
        this.message = message;
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public String getId() {
        return id;
    }
}
