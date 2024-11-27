package com.example.junit5.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Catalog {
    public static String main = "https://dev.smarta.lc/catalog/smartphones/";
    //Rename
    public static SelenideElement PhoneLink = $(By.xpath("*//a[@href=\"/product/714/Apple_iPhone_15_Pro_Max_512_\"]"));
    public static SelenideElement ProgrammOptionsButton = $(By.xpath("*//button[contains(text(),'Выбрать условия покупки')]"));
    public static SelenideElement ThirdProgrammButton = $(By.xpath("(*//button[contains(text(),'Выбрать')])[3]"));
    public static SelenideElement NoAccsButton = $(By.xpath("*//button[contains(text(),'Продолжить без аксессуаров')]"));
    public static SelenideElement NoAppsButton = $(By.xpath("*//button[contains(text(),'Продолжить без приложений')]"));
    public static SelenideElement OrderButton = $(By.xpath("*//button[contains(text(),'Оформить')]"));
    public static SelenideElement PhoneNumberInputForm = $(By.xpath("*//input"));

    public static SelenideElement SubmitPhoneNumberInputForm = $(By.xpath( "*//button[@type=\"submit\"]"));
    public static SelenideElement AuthorizationPin1 = $(By.xpath("(*//input[@type=\"password\"])[1]"));
    public static SelenideElement AuthorizationPin2 = $(By.xpath("(*//input[@type=\"password\"])[2]"));
    public static SelenideElement AuthorizationPin3 = $(By.xpath("(*//input[@type=\"password\"])[3]"));
    public static SelenideElement AuthorizationPin4 = $(By.xpath("(*//input[@type=\"password\"])[4]"));
    public static SelenideElement DeclineOrderButton = $(By.xpath("*//span[contains(text(),'Аннулировать заявку')]"));
    public static SelenideElement ApproveButton = $(By.xpath("*//button[contains(text(),'Да')]"));
    public static SelenideElement StartCyberityButton = $(By.xpath("*//button[contains(text(),'Начать')]"));
    public static SelenideElement NextStepCyberityButton = $(By.xpath("*//button[contains(text(),'Следующий шаг')]"));
 //   public static SelenideElement DeclineButton = $(By.xpath(""));

}
