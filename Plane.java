package aoop.ex;

import java.io.Serializable;

abstract class Plane implements Serializable {
    private static final long serialVersionUID = 6668;
    private int id;
    private  String name;
    private int year;
    private double priceOfPetrol;

    public Plane(int id, String name, int year, double priceOfPetrol) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.priceOfPetrol = priceOfPetrol;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getPriceOfPetrol() {
        return priceOfPetrol;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", priceOfPetrol=" + priceOfPetrol +
                '}';
    }
}
