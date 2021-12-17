package lab2;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class App {
    private static final String usageString = "Usage: WordCountApp <input path> <input path> <output path>";
    private static final String jobName = "lab2";

    public static void main(String[] args) throws Exception {

    }
}