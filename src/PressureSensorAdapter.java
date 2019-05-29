package cs410.src;
import sensor.PressureSensor;

/**
 *
 * @author DerekAvery
 */
public class PressureSensorAdapter implements Sensor {
    private PressureSensor sensor;
    public PressureSensorAdapter(PressureSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getReading() {
        return sensor.readValue();
    }

    @Override
    public String getType() {
        return sensor.getSensorName();
    }

    @Override
    public String getReport() {
        return sensor.getReport();
    }
}
