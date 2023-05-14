package WeatherForecasting;

public class WeatherData {
    private double temperatureF;
    private int humidity;
    private int uvIndex;
    private int windSpeed;
    private double pressure;

    public WeatherData(){}

    public WeatherData(double temperatureF, int humidity){
        this.temperatureF = temperatureF;
        this.humidity = humidity;
    }

    public WeatherData(double temperatureF, int windSpeed, int uvIndex){
        this.temperatureF = temperatureF;
        this.windSpeed = windSpeed;
        this.uvIndex = uvIndex;
    }

    public WeatherData(double temperatureF, double pressure){
        this.temperatureF = temperatureF;
        this.pressure = pressure;
    }

    public double getTemperatureF() {
        return temperatureF;
    }

    public int getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public int getUvIndex() {
        return uvIndex;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setTemperatureF(double temperatureF) {
        this.temperatureF = temperatureF;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setUvIndex(int uvIndex) {
        this.uvIndex = uvIndex;
    }
}
