import config.ProxiesConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProxyTest {

    @Test
    public void proxyTest() {

        ProxiesConfig config = ConfigFactory.create(ProxiesConfig.class, System.getProperties());
        assertThat(config.getProxy().host).isEqualTo("127.0.0.1");
        assertThat(config.getProxy().port).isEqualTo(4444);

    }

    @Test
    public void proxiesTest() {
        ProxiesConfig config = ConfigFactory.create(ProxiesConfig.class, System.getProperties());
        assertThat(config.getProxies()).hasSize(2);


    }
}
