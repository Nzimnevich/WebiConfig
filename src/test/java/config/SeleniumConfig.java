package config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface SeleniumConfig extends Config {

    @DefaultValue("http://localhost:4444/wd/hub")
    @Key("webdriver.remote.url")
    URL getRemoteURL();

    @DefaultValue("false")
    @Key("webdriver.remote")
    boolean isRemote();

}
