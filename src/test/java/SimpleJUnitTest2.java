import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJUnitTest2 {

    int result;

    @BeforeEach
    void beforeEach(){
        int result = getResult();
        System.out.println( "###    beforeEach()");
        result = getResult();
    }
    @Test
    void firstTest(){
        int result = getResult();
        System.out.println("###       firstTest()");
        //сообщение в консоли чтобы видеть тесты;
        Assertions.assertTrue( result > 2);

    }



    @Test
    void secondTest(){
        int result = getResult();
        System.out.println("###       secondTest()");
        Assertions.assertTrue( result > 2);

    }

    @Test
    void thirgTest(){
        int result = getResult();
        System.out.println("###       thirdTest()");
        Assertions.assertTrue( result > 2);

    }
    private int getResult(){
        return 3;
    }




}
