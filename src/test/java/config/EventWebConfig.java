package config;

public class EventWebConfig implements WebConfig {

    public String getBaseURL(){
        return "https://events.webinar.ru/";
    }
    public String getUserName(){
        return "n.zimnevich@webinar.ru";
    }

    public String getUserPassword(){
        return "Tema187tema";
    }
}
