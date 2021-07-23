import com.codeborne.selenide.Configuration;
import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebinarTest {

    //private WebConfig webConfig = ConfigFactory.create(WebConfig.class,System.getProperties());


    @Test
    public void auth() throws InterruptedException {
//        if (!Objects.nonNull(System.getProperty("stage"))) {
//            System.setProperty("stage", "event");
//        }
//        WebConfig webConfig = ConfigFactory.create(WebConfig.class,System.getProperties());

//        Configuration.baseUrl= webConfig.getBaseURL();
        open("/signin");
//        $("#e-mail").sendKeys(webConfig.getUserName());
//        $("#password").sendKeys(webConfig.getUserPassword());
//        $(".success").click();
//        $("[data-original-title='Информация о тарифе']").shouldBe(visible);
    }

    @Test
    public void authTwo() throws InterruptedException {

//        if (!Objects.nonNull(System.getProperty("stage"))) {
//            System.setProperty("stage", "event");
//        }
//        WebConfig webConfig = ConfigFactory.create(WebConfig.class,System.getProperties());
//
//        Configuration.baseUrl= webConfig.getBaseURL();
        open("/signin");
//        $("#e-mail").sendKeys(webConfig.getUserName());
//        $("#password").sendKeys(webConfig.getUserPassword());
//        $(".success").click();
//        $("[data-original-title='Информация о тарифе']").shouldBe(visible);
    }

}
