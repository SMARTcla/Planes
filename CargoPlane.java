package aoop.ex;

public class CargoPlane extends Plane{
    private double lifting;

    public CargoPlane(int id, String name, int year, double priceOfPetrol, double lifting) {
        super(id, name, year, priceOfPetrol);
        this.lifting = lifting;
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                "lifting=" + lifting +
                '}' +  "Plane{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", year=" + super.getYear() +
                ", priceOfPetrol=" + super.getPriceOfPetrol() +
                '}';
    }
}
