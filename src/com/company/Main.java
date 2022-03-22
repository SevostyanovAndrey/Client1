package com.company;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GreetClient client = new GreetClient();
        client.startConnection("192.168.9.103", 8080);
        System.out.println(client.sendMessage("hello server"));
        client.stopConnection();
    }

}
