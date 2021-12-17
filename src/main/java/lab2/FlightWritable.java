package lab2;

import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class FlightWritable implements Writable {
    public String getName() {
        return name;

    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(name);
        dataOutput.writeFloat(delay);
        dataOutput.writeInt(type.ordinal());

