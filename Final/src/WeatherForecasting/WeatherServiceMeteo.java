package WeatherForecasting;

import java.util.Random;

public class WeatherServiceMeteo implements WeatherService{

    @Override
    public WeatherData getWeatherData() {
        // the code below mimic the real data that we fetch from Weather Meteo
        Random rand = new Random();
        int minTemperature = 32;
        int maxTemperature = 100;
        double temperature = minTemperature + (maxTemperature - minTemperature) * rand.nextDouble();
        double minPressure = 80.0;
        double maxPressure = 120.0;
        double pressure = minPressure + (maxPressure - minPressure) * rand.nextDouble();
        return new WeatherData(temperature, pressure);
    }
}
