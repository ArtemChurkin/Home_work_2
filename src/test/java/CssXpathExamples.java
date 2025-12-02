import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {

    void cssXpath(){
        //<input tipe="email@ class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("[data-testid=email]").setValue("1");
        $(by("data-testid", "email")).setValue("1");
        $x("//*{@data-testid='email']").setValue("1");

        //<input tipe="email@ class="inputtext login_form_input_box" name="email" id="email">
        $("[id=email]").setValue("2");
        $(by("id","email")).setValue("2");
        $(byId("email")).setValue("2");
        $("#email").setValue("2");//Лучшее обращение по Id//
        $x("//*{@id='email']").setValue("2");

        //<input tipe="email@ class="inputtext login_form_input_box" name="email">
        $("[name=email]").setValue("3");
        $(by("name","email")).setValue("3");
        $(byName("email")).setValue("3");
        $x("//*{@id='email']").setValue("3");

        //<input tipe="email@ class="inputtext login_form_input_box">
        $("[class=inputtest][class=login_form_input_box]").setValue("4");
        $(".inputtest.login_form_input_box").setValue("4");
        $(".login_form_input_box").setValue("4");
        $("input.inputtext.login_form_input_box").setValue("4");
        $x("//input[@class='inputtext'][@class='login_form_input_box']").setValue("4");

        // <div class="inputtext">
        //      <input type="email" class="login_form_input_box">
        // </div>
        $(".inputtext .login_form_input_box").setValue("1");
        $(".inputtext").$(".login_form_input_box").setValue("1");
        $("div.inputtext").$("input.login_form_input_box").setValue("1");
        $("div.inputtext input.login_form_input_box").setValue("1");

        // <div>Hello, qa.guru!</div>
        $(byText("Hello, qa.guru!"));
        $(withText("llo, qa.g"));
        $x("//*[text()='Hello, qa.guru!']"); // wrong
        $x("//*[contains(text(),'Hello, qa.guru!')]");
    }
}
