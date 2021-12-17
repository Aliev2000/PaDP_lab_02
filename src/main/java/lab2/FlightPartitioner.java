package lab2;

import org.apache.hadoop.mapreduce.Partitioner;

public class FlightPartitioner extends Partitioner<AirportWritableComparable, FlightWritable> {
