package WeatherForecasting;

public class serviceGov implements WeatherService{
    @Override
    public void getWeatherData(String city) {
        System.out.println("Getting weather data for " + city + " 32 degrees");
    }
}
