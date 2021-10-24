package api;

import io.restassured.response.Response;

public class ItemAPI extends HTTPClient {
    private static final String ITEMS_URL = "/items";
    private static final String ITEM_URL = "/item";

    public Response getAllItems() {
        return get(ITEMS_URL);
    }
}
