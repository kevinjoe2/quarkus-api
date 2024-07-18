package dto;

public class TemperatureDto {

    private String id;
    private String city;
    private double temperature;
    private double humidity;

    public TemperatureDto(String id, String city, double temperature, double humidity) {
        this.id = id;
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}
