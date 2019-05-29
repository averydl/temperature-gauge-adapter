package cs410.src;
import sensor.TemperatureSensor;
/**
 *
 * @author DerekAvery
 */
public class TemperatureSensorAdapter implements Sensor {
    private TemperatureSensor sensor;
    public TemperatureSensorAdapter(TemperatureSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getReading() {
        return sensor.senseTemperature();
    }

    @Override
    public String getType() {
        return sensor.getSensorType();
    }

    @Override
    public String getReport() {
        return sensor.getTempReport();
    }
    
}
