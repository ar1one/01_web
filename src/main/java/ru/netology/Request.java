package ru.netology;

public class Request {
    private String requestMethod;
    private String path;

    public Request(String requestMethod, String path) {
        this.requestMethod = requestMethod;
        this.path = path;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public String getPath() {
        return path;
    }
}
