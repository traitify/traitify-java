package com.traitify.net;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.Base64;
import com.traitify.Traitify;

import javax.ws.rs.core.MediaType;

public abstract class ApiModel {

    public ApiModel(){
    }

    public static WebResource.Builder baseResource(String path) {
        Client client = Client.create();

        return client
            .resource(Traitify.getApiBase() + "/" + Traitify.apiVersion  + "/" + path)
            .accept(MediaType.APPLICATION_JSON)
            .type(MediaType.APPLICATION_JSON)
            .header("Authorization", authHeader())
            .header("Accept-Content-Encoding", "gzip, deflate");
    }

    public static String authHeader() {
        return "Basic " + new String(Base64.encode(Traitify.apiKey + ":x"));
    }

}
