import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Testforma {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";}
    @Test
    void fillTest(){
        Configuration.holdBrowserOpen = true;
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Diana");
        $("#lastName").setValue("Maksimowa");


    }
}
