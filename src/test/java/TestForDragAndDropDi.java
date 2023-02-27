import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class TestForDragAndDropDi {
    @Test
    void DragAndDropFanny() {

        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-b").shouldHave(text("A"));
        sleep(5000);

    }

    // Не работающий тест с actions
    @Test
    void Example() {
        Configuration.browserSize = "1920x1080";
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).perform();
        $("#column-b").shouldHave(text("A"));
        sleep(6000);


    }
}
