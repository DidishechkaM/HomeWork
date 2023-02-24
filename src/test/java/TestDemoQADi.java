import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestDemoQADi {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void fillTest(){

        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");


        $("#firstName").setValue("Dian");
        $("#lastName").setValue("Maksimowa");
        $("#userEmail").setValue("maksimowa@yandex.ru");
        $(byText("Female")).click();
        $("#userNumber").setValue("8996266848"); //8996266848
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").$(byText("1993")).click();
        $(".react-datepicker__month-select").$(byText("March")).click();
        $(".react-datepicker__month-container").$(byText("13")).click();
        $("#subjectsInput").setValue("Math").pressEnter();



        $(By.cssSelector("label[for='hobbies-checkbox-1']")).click();

        File fileToUpload = new File("src/test/resources/pictures/temp.png");
        $("#uploadPicture").uploadFile(fileToUpload);

        $("#currentAddress").setValue("Address");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Uttar Pradesh")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Agra")).click();
        $("#submit").click();
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));



        $(".modal-body").shouldHave(text("Dian Maksimowa"));
        $(".modal-body").shouldHave(text("maksimowa@yandex.ru"));
        $(".modal-body").shouldHave(text("Female"));
        $(".modal-body").shouldHave(text("8996266848"));
        $(".modal-body").shouldHave(text("13 March,1993"));
        $(".modal-body").shouldHave(text("Math"));
        $(".modal-body").shouldHave(text("Sports"));
        $(".modal-body").shouldHave(text("temp.png"));
        $(".modal-body").shouldHave(text("Address"));

        $("#closeLargeModal").click();







    }
}
