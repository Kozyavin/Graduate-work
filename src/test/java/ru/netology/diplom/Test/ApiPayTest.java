package ru.netology.diplom.Test;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import ru.netology.diplom.data.UserForApiTest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ApiPayTest {

    @Test
    public  void shouldReturnDemoAccounts() {

        /*UserForApiTest user = new UserForApiTest();
        user.setNumber("4444444444444441");
        user.setMonth("12");
        user.setYear("25");
        user.setHolder("Li Gua");
        user.setCvv("333");
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("http://localhost:8080")
                .contentType("application/json")
                .body(user)
                // Выполняемые действия
        .when()
                .post("/api/v1/pay")
                // Проверки
        .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("status",equalTo("APPROVED"));*/
        String payload = "{\"number\":\"4444 4444 4444 4441\",\"year\":\"25\",\"month\":\"12\",\"holder\":\"Li Gua\",\"cvc\":\"333\"}";
        given()
                .baseUri("http://localhost:8080")
                .contentType("application/json")
                .body(payload)
                // Выполняемые действия
                .when()
                .post("/api/v1/pay")

                // Проверки
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("status",equalTo("APPROVED"));
    }
}
