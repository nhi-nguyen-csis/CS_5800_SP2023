package WeatherForecasting;

public class ServiceAPI implements WeatherService{

    @Override
    public void getWeatherData(String city) {
        System.out.println("Getting weather data for " + city + "32 degrees");
    }
}
