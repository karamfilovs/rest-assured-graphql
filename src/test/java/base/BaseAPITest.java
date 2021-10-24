package base;

import api.ClientAPI;
import api.HTTPClient;
import api.ItemAPI;
import io.restassured.authentication.BasicAuthScheme;
import org.junit.jupiter.api.BeforeAll;

public class BaseAPITest {
    protected ClientAPI clientAPI = new ClientAPI();
    protected ItemAPI itemAPI = new ItemAPI();

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Setup HTTP client");
        BasicAuthScheme scheme = new BasicAuthScheme();
        scheme.setUserName("karamfilovs@gmail.com");
        scheme.setPassword("123456");
        HTTPClient.setup(scheme,"https://st2016.inv.bg", "RESTapi");
    }
}
