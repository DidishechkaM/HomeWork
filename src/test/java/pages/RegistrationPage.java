package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponents;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    CalendarComponents calendarComponents = new CalendarComponents();
    private final SelenideElement lastNameInput = $("#lastName");
    private final SelenideElement firstNameInput = $("#firstName");
    private final SelenideElement emailInput = $("#userEmail");
    private final SelenideElement genterRadio = $("#genterWrapper");
    private final SelenideElement Number = $("#userNumber");


    public RegistrationPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }


    public RegistrationPage SetFirsName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage SetLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage Setemail(String value) {
        emailInput.setValue(value);
        return this;
    }

    public RegistrationPage SetGender(String value) {
        genterRadio.$(byText(value)).click();
        return this;
    }

    public RegistrationPage SetNumber(String value) {
        Number.setValue(value);
        return this;
    }

    public RegistrationPage SetBirthDay(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponents.setDate(day, month, year);
        return this;

    }
}