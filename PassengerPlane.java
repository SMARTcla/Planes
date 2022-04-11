package aoop.ex;

public class PassengerPlane extends Plane{
    private  int capacity;

    public PassengerPlane(int id, String name, int year, double priceOfPetrol, int capacity) {
        super(id, name, year, priceOfPetrol);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "capacity=" + capacity +
                '}' + "Plane{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", year=" + super.getYear() +
                ", priceOfPetrol=" + super.getPriceOfPetrol() +
                '}';
    }
}
