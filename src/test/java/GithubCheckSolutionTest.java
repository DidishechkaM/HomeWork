import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



public class GithubCheckSolutionTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void CheckSolutionForGit() {
      open("https://github.com/");
      $(byText("Solutions")).hover();
      $(byText("Enterprise")).click();
      $("main.font-mktg, h1").shouldHave(text("Build like the best"));
     // $("main.font-mktg").$("h1").shouldHave(text("Build like the best"));Вариант 2













    }


}



