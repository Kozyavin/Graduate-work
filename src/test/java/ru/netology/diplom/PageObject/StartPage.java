package ru.netology.diplom.PageObject;

import ru.netology.diplom.data.DataHelper;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class StartPage {

    public void startPageVisible() {    //конструктор на проверку видимости (загрузки) окна Dashboard при создании экземпляра
        $(".heading").shouldBe(visible);
    }



}
