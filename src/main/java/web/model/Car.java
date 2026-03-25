package web.model;

public class Car {
    private int series;
    private String name;
    private String colour;

    public Car(int series, String name, String colour) {
        this.series = series;
        this.name = name;
        this.colour = colour;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setEngine(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
