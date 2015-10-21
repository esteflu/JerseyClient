package com.lundberg.client;

import com.sun.jersey.api.client.Client;

import javax.ws.rs.core.MediaType;

public class JerseyClient {

    public static void main(String[] args) {
        try {

            Client client = Client.create();
            client.setReadTimeout(5000);
            String input = "a string response";
            String response = client
                    .resource("http://localhost:8080/stuff")
                    .type(MediaType.APPLICATION_JSON_TYPE)
                    .post(String.class, input);

            System.out.println("Output from Server ..." + response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
