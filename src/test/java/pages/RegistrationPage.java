package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.components.CalendarComponents;
import pages.components.RegistrationressultModal;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    RegistrationressultModal registrationressultModal = new RegistrationressultModal();
    CalendarComponents calendarComponents = new CalendarComponents();


    public RegistrationPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    private final SelenideElement firstNameInput = $("#firstName");

    public RegistrationPage setFirsName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    private final SelenideElement lastNameInput = $("#lastName");

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    private final SelenideElement emailInput = $("#userEmail");

    public RegistrationPage setEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    private final SelenideElement genderRadio = $("#genterWrapper");

    public RegistrationPage setGender(String value) {
        genderRadio.$(byText(value)).click();
        return this;
    }

    private final SelenideElement Number = $("#userNumber");

    public RegistrationPage setNumber(String value) {
        Number.setValue(value);
        return this;
    }

    private final SelenideElement SetSubject = $("#subjectsInput");

    public RegistrationPage setSubject(String value) {
        SetSubject.setValue(value).pressEnter();
        return this;
    }

    private final SelenideElement SetCheckbox = $(By.cssSelector("label[for='hobbies-checkbox-1']"));

    public RegistrationPage setCheckbox() {
        SetCheckbox.click();
        return this;
    }

    private final SelenideElement UploadFile = $("#uploadPicture");

    public RegistrationPage uploadFile(String path) {
        UploadFile.uploadFile(new File(path));
        return this;
    }

    private final SelenideElement setAddress = $("#currentAddress");

    public RegistrationPage setAddress(String value) {
        setAddress.setValue(value);
        return this;
    }

    private final SelenideElement setState = $("#state");

    public RegistrationPage setState() {
        setState.click();
        return this;
    }

    private final SelenideElement setCity = $("#stateCity-wrapper");

    public RegistrationPage setCity() {
        setCity.$(byText("Uttar Pradesh")).click();
        $("#city").click();
        return this;
    }

    private final SelenideElement estateCity = $("#stateCity-wrapper");

    public RegistrationPage setstateCity() {
        estateCity.$(byText("Agra")).click();
        return this;

    }

    private final SelenideElement clickSubmit = $("#submit");

    public RegistrationPage submitclick() {
        clickSubmit.click();
        return this;
    }

    public RegistrationPage setBirthDay(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponents.setDate(day, month, year);
        return this;

    }

    private final SelenideElement closemodal = $("#closeLargeModal");

    public RegistrationPage closeModal() {
        closemodal.click();
        return this;
    }

    public RegistrationPage verifiability() {
        registrationressultModal.verifyModalText();
        return this;
    }

    public RegistrationPage verifyValueTable(String key, String value) {
        registrationressultModal.verifyValueTable(key, value);
        return this;
    }
}
