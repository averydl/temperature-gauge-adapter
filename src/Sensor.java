package cs410.src;

/**
 *
 * @author DerekAvery
 */
public interface Sensor {
    double getReading(); // returns the reading of the sensor
    String getType(); // returns a String representing the type of sensor (e.g. temperature)
    String getReport(); // returns the current status of the sensor (e.g. 'DANGER', 'Ok') depending on current reading
}
