

import org.junit.jupiter.api.Test;

public class TestDemoQADiWithPageObject extends TestBase {


    @Test
    void fillTest() {
        String userName = "Dian";
        registrationPage.openPage()
                .setFirsName(userName)
                .setLastName("Maksimowa")
                .setEmail("maksimowa@yandex.ru")
                .setGender("Female")
                .setNumber("8996266848")
                .setBirthDay("13", "March", "1993")
                .setSubject("Maths")
                .setCheckbox()
                .uploadFile("src/test/resources/pictures/temp.png")
                .setAddress("Address")
                .setState()
                .setCity()
                .setstateCity()
                .submitclick();
        registrationPage.verifiability();
        registrationPage.verifyValueTable("Student Name", userName + " Maksimowa");
        registrationPage.verifyValueTable("Student Email", "maksimowa@yandex.ru");
        registrationPage.verifyValueTable("Gender", "Female");
        registrationPage.verifyValueTable("Mobile", "8996266848");
        registrationPage.verifyValueTable("Date of Birth", "13 March,1993");
        registrationPage.verifyValueTable("Subjects", "Maths");
        registrationPage.verifyValueTable("Hobbies", "Sports");
        registrationPage.verifyValueTable("Picture", "temp.png");
        registrationPage.verifyValueTable("Address", "Address");
        registrationPage.closeModal();
    }
}
