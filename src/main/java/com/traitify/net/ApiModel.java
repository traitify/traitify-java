package com.traitify.net;

import com.traitify.Traitify;
import org.glassfish.jersey.internal.util.Base64;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;

public abstract class ApiModel {

    public ApiModel(){
    }

    public static Invocation.Builder baseResource(String path) {
        Client client = ClientBuilder.newClient();

        return client
            .target(Traitify.getApiBase() + "/" + Traitify.apiVersion  + "/" + path)
            .request(MediaType.APPLICATION_JSON)
            .header("Authorization", authHeader())
            .header("Accept-Content-Encoding", "gzip, deflate");
    }

    public static String authHeader() {
        return "Basic " + new String(Base64.encode((Traitify.apiKey + ":x").getBytes()));
    }

}
