package WeatherForecasting;

import java.util.ArrayList;

public class WeatherAPI extends Weather{
    static final String appName = "Weather API";

    public WeatherAPI(){
        weatherService = new WeatherServiceAPI();
        weatherData = new WeatherData();
        observers = new ArrayList<>();
    }

    @Override
    public void subscribe(User user){
        System.out.printf("%s %s has subscribed to %s\n", user.getFirstName(), user.getLastName(), appName);
        observers.add(user);
    }
    @Override
    public void unsubscribe(User user){
        System.out.printf("\n%s %s has unsubscribed from %s\n", user.getFirstName(), user.getLastName(), appName);
        observers.remove(user);
    }

    @Override
    public void notifyObservers(){
        // fetch the data from WeatherServiceAPI to get the current updated weather
        weatherData = weatherService.getWeatherData();
        for (User user : observers) {
            System.out.printf("\nHi %s %s, here is the updated weather data from WeatherAPI " +
                    "\n", user.getFirstName(), user.getLastName());
            user.update(this, weatherData);
        }
    }
    @Override
    public void display(){
        System.out.printf("\tTemperature: %.2f (Fahrenheit)", weatherData.getTemperatureF());
        System.out.printf(" - Humidity: %d%%\n", weatherData.getHumidity());
    }
}
