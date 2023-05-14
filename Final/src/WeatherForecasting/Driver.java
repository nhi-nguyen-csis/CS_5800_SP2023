package WeatherForecasting;

public class Driver {
    public static void main(String[] args) {
        User user1 = new User("Nhi", "Nguyen");
        User user2 = new User("Long", "Nguyen");
        User user3 = new User("Elon", "Musk");

        Weather weatherAPI = new WeatherAPI();
        Weather weatherGov = new WeatherGov();
        Weather weatherMeteo = new WeatherMeteo();

        user1.subscribe(weatherAPI);
        user2.subscribe(weatherAPI);
        user1.subscribe(weatherGov);
        user3.subscribe(weatherGov);
        user2.subscribe(weatherMeteo);
        weatherAPI.notifyObservers();
        weatherGov.notifyObservers();
        weatherMeteo.notifyObservers();

        user1.unsubscribe(weatherGov);
        weatherGov.notifyObservers();
    }
}
