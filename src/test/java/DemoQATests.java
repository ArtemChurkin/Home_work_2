
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoQATests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void  fillFormTest() {

        open( "https://demoqa.com/text-box");
        $("#userName").setValue("Artyom");
        $("#userEmail").setValue("a.churkin@informer.com");
        $("#currentAddress").setValue("Some street 1");
        $("#permanentAddress").setValue("Another street 1");
        $("#submit").click();




    }

}
