package lab2;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class StatisticCounter extends Reducer<AirportWritableComparable, FlightWritable, IntWritable, Text> {
