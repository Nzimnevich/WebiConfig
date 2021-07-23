package config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface FruitsConfig extends Config {
    @Separator(";")
    @Key("webinar.fruits")
    List<String> getFruits();


    @Separator(",")
    @Key("webinar.fruits")
    @DefaultValue("Apply,Orange,Banana")
    List<String> getFruitsDefaultValue();

}
