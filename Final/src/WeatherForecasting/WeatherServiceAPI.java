package WeatherForecasting;
import java.util.Random;

public class WeatherServiceAPI implements WeatherService{
    @Override
    public WeatherData getWeatherData() {
        // the code below mimic the real data that we fetch from Weather API
        Random rand = new Random();
        int minTemperature = 32;
        int maxTemperature = 100;
        double temperature = minTemperature + (maxTemperature - minTemperature) * rand.nextDouble();
        //temperature = Math.round(temperature * 100.0) / 100.0;
        int minHumidity = 0;
        int maxHumidity = 100;
        int humidity = rand.nextInt(maxHumidity - minHumidity + 1);
        return new WeatherData(temperature, humidity);

    }
}
