package ru.netology.diplom.Test;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ApiPayTest {

    @Test
    public  void shouldReturnDemoAccounts() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("http://localhost:8080/api")
                .contentType("application/json")
                .params("number", "4444 4444 4444 4441", "year", "24","month", "12","holder", "ad dafa","cvc", "333")
                //.param("number", "4444 4444 4444 4441")
                //.param("year", "24")
                //.param("month", "12")
                //.param("holder", "ad dafa")
                //.param("cvc", "333")

                // Выполняемые действия
        .when()
                .post("/v1/pay")
                // Проверки
        .then()
                .statusCode(200)
                // специализированные проверки - лучше
                .contentType(ContentType.JSON)
                .body("status", equalTo("APPROVED"))
        ;
    }
}
