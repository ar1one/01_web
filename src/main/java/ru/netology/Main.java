package ru.netology;

public class Main {
    public static void main(String[] args) {
       final var server = new Server(64);

        // добавление хендлеров (обработчиков)
        server.addHandler("GET", "/message", (server::responseError));
        server.addHandler("GET", "/spring.png", ((request, responseStream) -> System.out.println("Привет из GET, spring.png")));

       server.start(9999);
    }
}


