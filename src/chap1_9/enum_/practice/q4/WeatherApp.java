package chap1_9.enum_.practice.q4;

import static chap1_9.enum_.practice.q4.Weather.*;

public class WeatherApp {
    private String weather;
    private Weather weatherInfo;

    public WeatherApp(String weather) {
        this.weather = weather;
    }

    public String getWeatherInfo() {
        return this.weatherInfo.getDesc();
    }
    public void printWeatherInfo(){
        switch (this.weather){
            case "SUNNY" : weatherInfo = SUNNY; break;
            case "CLOUDY" : weatherInfo = CLOUDY; break;
            case "RAINY" : weatherInfo = RAINY; break;
            case "SNOWY" : weatherInfo = SNOWY; break;
        }
        System.out.println(weatherInfo.getDesc());
    }

}
