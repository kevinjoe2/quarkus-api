package service;

import dto.TemperatureDto;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.*;

@ApplicationScoped
public class TemperatureService {

    private final List<TemperatureDto> temperatures = new ArrayList<>();

    public List<TemperatureDto> findAll() {
        return Collections.unmodifiableList(temperatures);
    }

    public TemperatureDto findOne(String id) {
        return temperatures.stream().filter(tem -> Objects.equals(tem.getId(), id)).findAny()
                .orElseThrow(() -> new NoSuchElementException("Not found temperature with id: " + id));
    }

    public TemperatureDto create(TemperatureDto temperatureDto) {
        temperatureDto.setId(UUID.randomUUID().toString());
        this.temperatures.add(temperatureDto);
        return temperatureDto;
    }
}
