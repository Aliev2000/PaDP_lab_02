package lab2;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

enum Type{
    FLIGHT
}
public class AirportWritableComparable implements WritableComparable<AirportWritableComparable> {
    private Type type;
    private int id;

    public AirportWritableComparable(){

    public String getName(){
        return name;

    public AirportWritableComparable(int id, String name, Type type){
        this.id = id;
        this.type = type;
        this.name = name;

    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(type.ordinal());
