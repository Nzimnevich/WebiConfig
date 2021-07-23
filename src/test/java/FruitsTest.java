import config.FruitsConfig;
import config.SeleniumConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FruitsTest {


    @Test
    public void fruitsTest() {
        System.setProperty("webinar.fruits","ApplyOrange");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());

        assertThat(config.getFruits()).
                containsExactly("Apply", "Orange");
    }

    @Test
    public void fruitsTestDefaultValue() {
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());

        assertThat(config.getFruitsDefaultValue()).
                containsExactly("Apply", "Orange","Banana");
    }
}
