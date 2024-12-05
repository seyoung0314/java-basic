package chap1_9.enum_.practice.q4;

public class Main {
    public static void main(String[] args) {
        WeatherApp weatherApp = new WeatherApp("SUNNY");

        weatherApp.printWeatherInfo();

        Weather weather = Weather.CLOUDY;
        System.out.println(weather.getDesc());
    }
}
