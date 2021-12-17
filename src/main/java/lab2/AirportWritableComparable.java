package lab2;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

enum Type{
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(type.ordinal());
