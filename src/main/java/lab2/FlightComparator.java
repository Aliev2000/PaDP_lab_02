package lab2;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class FlightComparator extends WritableComparator {
    public int compare(WritableComparable a, WritableComparable b) {
        int a_id = ((AirportWritableComparable)a).getId();
        int b_id = ((AirportWritableComparable)b).getId();
        return a_id - b_id;
}
