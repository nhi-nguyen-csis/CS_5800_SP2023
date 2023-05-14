package WeatherForecasting;
import java.util.ArrayList;

public class WeatherMeteo extends Weather{
    static final String appName = "Weather Meteo";

    public WeatherMeteo(){
        weatherService = new WeatherServiceMeteo();
        weatherData = new WeatherData();
        observers = new ArrayList<>();
    }

    @Override
    void subscribe(User user) {
        System.out.printf("%s %s has subscribed to %s\n", user.getFirstName(), user.getLastName(), appName);
        observers.add(user);
    }

    @Override
    void unsubscribe(User user) {
        System.out.printf("\n%s %s has unsubscribed from %s\n", user.getFirstName(), user.getLastName(), appName);
        observers.remove(user);
    }

    @Override
    public void notifyObservers(){
        for (User user : observers) {
            // fetch the data from WeatherServiceAPI to get the current updated weather
            weatherData = weatherService.getWeatherData();
            System.out.printf("\nHi %s %s, here is the updated weather data from %s\n",
                    user.getFirstName(), user.getLastName(), appName);
            user.update(this, weatherData);
        }
    }

    @Override
    void display() {
        System.out.printf("\tTemperature: %.2f (F)", weatherData.getTemperatureF());
        System.out.printf(" | Pressure: %.2f (hPa)\n", weatherData.getPressure());
    }
}
