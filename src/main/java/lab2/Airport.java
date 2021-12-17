package lab2;

public class Airport {
    private static final String DELIMITER = ",";
    private final int id;
    private final String name;

    public Airport(String s){
        String[] data = s.split(DELIMITER);
        this.name = data[1];
    }

    public int getId(){
        return this.id;

    public String getName() {
        return name;
    }
}
