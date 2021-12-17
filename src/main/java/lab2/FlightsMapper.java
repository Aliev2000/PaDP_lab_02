package lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightsMapper extends Mapper<LongWritable, Text, AirportWritableComparable, FlightWritable> {

    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        Flight data = new Flight(value.toString());
        if (!data.isCancelled()) {
            context.write(new AirportWritableComparable(data.getAirportId(), "", Type.FLIGHT),
                          new FlightWritable("", data.getDelayTime(), Type.FLIGHT));
        }
}
