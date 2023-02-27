import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class TestforDragandDrop {
    @Test
    void DrugAndDropfanny(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-b").shouldHave(Condition.text("A"));
        sleep(5000);






    }


   // Запрограммируйте Drag&Drop с помощью Selenide.actions()
    // - Откройте https://the-internet.herokuapp.com/drag_and_drop
    // - Перенесите прямоугольник А на место В
    // - Проверьте, что прямоугольники действительно поменялись
    // - В Selenide есть команда $(element).dragAndDrop($(to-element)), проверьте работает ли тест, если использовать её вместо actions()


}
