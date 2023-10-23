package ru.netology.diplom.Test;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import lombok.SneakyThrows;
import org.junit.jupiter.api.*;
import ru.netology.diplom.PageObject.PayFunctionPage;
import ru.netology.diplom.PageObject.StartPage;
import ru.netology.diplom.data.DataHelper;

import static com.codeborne.selenide.Selenide.open;


public class PayTest {

    PayFunctionPage payFunctionPage;//экземпляр страницы LoginPage

    @BeforeAll
    static void setUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }

    @BeforeEach
    void setUp() {
        payFunctionPage = open("http://localhost:8080", PayFunctionPage.class);//обращение к экземпляру открывает страницу
    }

    @SneakyThrows
    @Test
    void validUserTest() {

        var startPage = new StartPage();
        startPage.startPageVisible(); //проверяем видимость страницы DashboardPage

        PayFunctionPage page = new PayFunctionPage();
        var user1 = DataHelper.validClient();
        page.enterDataUser(user1);

    }
}