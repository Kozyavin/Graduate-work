package ru.netology.diplom.data;
import com.github.javafaker.Faker;
import lombok.Value;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Integer.parseInt;

public class DataHelper {

    private DataHelper() {  }   //пустой контейнер
     static Faker faker = new Faker();

    public static String getApprovedCardNumber(){
        String numberApprovedCard = "4444444444444441";
        return numberApprovedCard;
    }
    public static String generateRandomMonth() //метод генерации случайного числа месяца
    {
        LocalDateTime now = LocalDateTime.now();
        int nowMonth = now.getMonthValue();
        int randomNumberPlusMonth = ThreadLocalRandom.current().nextInt(13-nowMonth); //генерация в диапазоне от нынешнего месяца до 12-го
        int generateMonth = nowMonth+randomNumberPlusMonth;
        if(generateMonth < 10)
        {
            DecimalFormat df = new DecimalFormat("00");
            String s = df.format(generateMonth);
            int number = parseInt(s.trim());
            return Integer.toString(number);
        } else {
        return Integer.toString(generateMonth);}
    }
    public static  String generateRandomYear() //метод генерации случайного года
    {
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int randomNumberPlusYear = ThreadLocalRandom.current().nextInt(5);
        int generateYear = year+randomNumberPlusYear;
        return Integer.toString(generateYear-2000);
    }

    public static String generateName(String locale) {
        return faker.name().lastName() + " " + faker.name().firstName();
    }
    public static String generateCVV() {
        return Integer.toString(faker.number().numberBetween(100,999));
    }

    public static CardInfo validClient(){
        return new CardInfo(getApprovedCardNumber(), generateRandomMonth(), generateRandomYear(), generateName("en"), generateCVV());
    }
    @Value
    public static class CardInfo {
        private String numberCard;
        private String month;
        private String year;
        private String name;
        private String cvc;
    }

}
