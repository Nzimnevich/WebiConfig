package config;

import org.aeonbits.owner.Config;

@Config.Sources({"file:/tmp/ci.properties" +
        "classpath:${stage}.properties"})
@Config.LoadPolicy(Config.LoadType.FIRST)
public interface WebConfig extends Config {
    @Key("base.url")
    String getBaseURL();

    @Key("base.user")
    String getUserName();

    @Key("base.password")
    String getUserPassword();

}
