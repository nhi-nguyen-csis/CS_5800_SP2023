package WeatherForecasting;

import java.util.ArrayList;

public class WeatherGov extends Weather{
    static final String appName = "Weather Gov";

    public WeatherGov(){
        weatherService = new WeatherServiceGov();
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
            System.out.printf("\nHi %s %s, here is the updated weather data from %s\n",
                    user.getFirstName(), user.getLastName(), appName);
            user.update(this, weatherData);
        }
    }

    @Override
    public void display(){
        System.out.printf("{\n\tTemperature: %.2f (F),\n\tWind Speed: %d (mph),\n\tUV Index: %d\n}\n",
                weatherData.getTemperatureF(), weatherData.getWindSpeed(), weatherData.getUvIndex());
    }
}
