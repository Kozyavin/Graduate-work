package ru.netology.diplom.PageObject;
import ru.netology.diplom.data.DataHelper;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PayFunctionPage {

    public PayFunctionPage() {
        $$("html h3").last().shouldHave(visible);
    }


        public void enterDataUser(DataHelper.CardInfo card){


            $$("html button").findBy(text("Купить")).click();

            $("[placeholder='0000 0000 0000 0000'].input__control").setValue(card.getNumberCard());
            $("[placeholder='08'].input__control").setValue(card.getMonth());
            $("[placeholder='22'].input__control").setValue(card.getYear());
            $("[placeholder='999'].input__control").setValue(card.getCvc());
            $("[value=''].input__control").setValue(card.getName());

            $$("html button").findBy(text(" Продолжить")).click();

        }
    }

