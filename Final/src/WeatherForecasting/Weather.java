package WeatherForecasting;

import java.util.ArrayList;
import java.util.List;

public abstract class WeatherApp {
    private WeatherService weatherService;
    private List<User> observers = new ArrayList<>();

    public void subscribe(User user) {
        observers.add(user);
    }

    public void unsubscribe(User user) {
        observers.remove(user);
    }

    public abstract void notifyObservers() {}

}
