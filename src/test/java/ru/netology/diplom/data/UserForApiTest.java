package ru.netology.diplom.data;

public class UserForApiTest {

    private String number;
    private String year;
    private String holder;
    private String month;
    private String cvv;
    /*public UserForApiTest (String number, String year, String month, String holder, String cvv) {
        this.number = number;
        this.year = year;
        this.month = month;
        this.holder = holder;
        this.cvv = cvv;
    }*/
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public String getCvv() {
        return cvv;
    }
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
