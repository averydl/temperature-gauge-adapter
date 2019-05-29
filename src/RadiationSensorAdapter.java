package cs410.src;
import sensor.RadiationSensor;

/**
 *
 * @author DerekAvery
 */
public class RadiationSensorAdapter implements Sensor {
    private RadiationSensor sensor;
    public RadiationSensorAdapter(RadiationSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getReading() {
        return sensor.getRadiationValue();
    }

    @Override
    public String getType() {
        return sensor.getName();
    }

    @Override
    public String getReport() {
        return sensor.getStatusInfo();
    }
    
}
