package ru.netology.diplom.Test;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ApiPayTest {

    @Test
    void shouldReturnDemoAccounts() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("http://localhost:8080/api")
                // Выполняемые действия
                .when()
                .post("/v1/pay")
                // Проверки
                .then()

                .statusCode(200)
                // специализированные проверки - лучше
                .contentType(ContentType.JSON)
                .body("", hasSize(1))
                .body("status", equalTo("APPROVED"))
        ;
    }
}

