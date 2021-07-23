package config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface ProxiesConfig extends Config {

    @ConverterClass(ProxyConverter.class)
    @DefaultValue("127.0.0.1:4444")
    @Key("webinar.proxy")
    Proxy getProxy();

    @ConverterClass(ProxyConverter.class)
    @Separator(",")
    @DefaultValue("127.0.0.1:4444,127.0.0.1:4446")
    @Key("webinar.proxies")
    List<Proxy> getProxies();

}
