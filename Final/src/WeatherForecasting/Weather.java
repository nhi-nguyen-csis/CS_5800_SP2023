package WeatherForecasting;

import java.util.ArrayList;
import java.util.List;

public abstract class Weather {
    WeatherData weatherData;
    WeatherService weatherService;
    List<User> observers;

    abstract void subscribe(User user);

    abstract void unsubscribe(User user);

    abstract void notifyObservers();

    abstract void display();
}
