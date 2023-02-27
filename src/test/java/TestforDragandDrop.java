import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class TestforDragandDrop {
    @Test
    void DragAndDropfanny(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-b").shouldHave(text("A"));
        $("#column-b").shouldHave(text("A"));
        sleep(5000);
        
}
// Не работающий тест с actions (я и так его и сяк)
   @Test
  void Example(){
       Configuration.browserSize = "1920x1080";
       open("https://the-internet.herokuapp.com/drag_and_drop");
       actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).perform();
       sleep(6000);
       // Даже так не получилось actions().moveToElement($("column-a")).clickAndHold().moveByOffset(300, 0).release().perform();

    }
}
