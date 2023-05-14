package WeatherForecasting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private HashMap<Weather, WeatherData> subscribedApps;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        subscribedApps = new HashMap<>();
    }

    public void subscribe(Weather weatherApp) {
        subscribedApps.put(weatherApp, null);
        weatherApp.subscribe(this);
    }

    public void unsubscribe(Weather weatherApp) {
        subscribedApps.remove(weatherApp);
        weatherApp.unsubscribe(this);
    }

    public void update(Weather weatherApp, WeatherData weatherData){
        subscribedApps.put(weatherApp, weatherData);
        weatherApp.display();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
