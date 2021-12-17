package lab2;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class StatisticCounter extends Reducer<AirportWritableComparable, FlightWritable, IntWritable, Text> {
    private static final String format = "Airport:%s  Average_delay:%f, Minimum_delay %f, Maximum_delay:%f, Total_flights:%d";

    @Override
    protected void reduce(AirportWritableComparable key, Iterable<FlightWritable> values, Context context) throws IOException, InterruptedException {
        float averageDelay = 0;
        float maxDelay = 0;
        float minDelay = Float.MAX_VALUE;



    }
}
