package WeatherForecasting;

import java.util.Random;

public class WeatherServiceGov implements WeatherService{
    double temperature;
    int windSpeed;
    int uvIndex;
    @Override
    public WeatherData getWeatherData() {
        // the code below mimic the real data that we fetch from Weather Gov
        Random rand = new Random();
        int minTemperature = 32;
        int maxTemperature = 100;
        temperature = minTemperature + (maxTemperature - minTemperature) * rand.nextDouble();
        //temperature = Math.round(temperature * 100.0) / 100.0;
        int minWindSpeed = 0;
        int maxWindSpeed = 50;
        windSpeed = rand.nextInt(maxWindSpeed - minWindSpeed + 1) + minWindSpeed;
        int minUVIndex = 0;
        int maxUVIndex = 11;
        uvIndex = rand.nextInt(maxUVIndex - minUVIndex + 1) + minUVIndex;
        return new WeatherData(temperature, windSpeed, uvIndex);
    }
}
