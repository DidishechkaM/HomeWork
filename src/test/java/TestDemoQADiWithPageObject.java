

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestDemoQADiWithPageObject extends TestBase {


    @Test
    void fillTest() {
        String userName = "Dian";

        registrationPage.openPage()
                .SetFirsName(userName)
                .SetLastName("Maksimowa")
                .Setemail("maksimowa@yandex.ru")
                .SetGender("Female")
                .SetNumber("8996266848")
                .SetBirthDay("13", "March", "1993");


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
