package api;

import io.restassured.response.Response;

public class ClientAPI extends HTTPClient {
    private static final String CLIENTS_URL = "/clients";
    private static final String CLIENT_URL = "/client";

    public Response getAllClients(){
        return get(CLIENTS_URL);
    }

}
