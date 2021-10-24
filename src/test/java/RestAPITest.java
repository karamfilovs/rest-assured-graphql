import base.BaseAPITest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RestAPITest extends BaseAPITest {

    @Test
    @DisplayName("Can get all clients")
    public void canGetAllClients(){
        Response response = clientAPI.getAllClients();
        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    @DisplayName("Can get all items")
    public void canGetAllItems(){
        Response response = itemAPI.getAllItems();
        Assertions.assertEquals(200, response.statusCode());
    }
}
