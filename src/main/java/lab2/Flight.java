package lab2;

public class Flight{
    private static final int IS_CANCELLED_COLUMN = 19;
    private static final int DELAY_TIME_COLUMN = 18;
    private static final int AIRPORT_ID_COLUMN = 14;

    private static final String DELIMITER = ",";
    private final float delayTime;
    private final int airportId;

    public Flight (String s) {
        String[] data = s.split(DELIMITER);
        this.isCancelled = data[IS_CANCELLED_COLUMN].equals(CANCELLED_FLAG);
        this.delayTime = (data[DELAY_TIME_COLUMN].equals("")) ? 0 : Float.parseFloat(data[DELAY_TIME_COLUMN]);
        this.airportId = Integer.parseInt(data[AIRPORT_ID_COLUMN]);

    public boolean isCancelled() {
        return isCancelled;

    public float getDelayTime() {
        return delayTime;

    public int getAirportId() {
        return airportId;
}
