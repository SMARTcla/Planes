package aoop.ex;


public class WorkerWithPlanes {
    private SomeList planeList;
    private final Reader reader = new Reader();

    public void readStateList() {//прочитали + создали массив фильмов
        planeList = reader.readFromDat();
        if (reader.isRead()){
            System.out.println("Planes read");
        }else {
            System.out.println("File with Planes is empty");
        }
    }


    public void writeStateList() {
        if(reader.isRead()){//если мы прочитали файл и работали  с данными, то нам есть ,что записать
            Writer writer = new Writer(planeList);
            writer.writeInBin();
        }
    }


    public void addNewPlane(String name, int year, double priceOfPetrol, int capacity){
            if (year > 0 && name != null && year > 0 && priceOfPetrol > 0 && capacity > 0) {
                    planeList.addVehicle(new PassengerPlane(planeList.lastID() + 1, name, year, priceOfPetrol, capacity));
                reader.setRead(true);
            }else{
                System.out.println("Planes not added");
            }
    }
    public void addNewPlane(String name, int year, double priceOfPetrol, double lifting){
        if (year > 0 && name != null && year > 0 && priceOfPetrol > 0 && lifting > 0) {
            planeList.addVehicle(new CargoPlane(planeList.lastID() + 1, name, year, priceOfPetrol, lifting));
            reader.setRead(true);
        }else{
            System.out.println("Planes not added");
        }
    }

    public void removePlane(int id) {
        if (reader.isRead()) {
            if (planeList.remove(id)) {
                System.out.println("Plane  deleted");
            } else {
                System.out.println("Plane  not found or file is empty");
            }
        } else {
            System.out.println("Plane list not read");
        }
    }



    public void findYear(int year) {
        if (reader.isRead()) {
            SomeList v= planeList.find(year);//получили массив фильмов с нужным годом
            for (int i = 0; i < v.getSize(); i++) {
                System.out.println(v.getOnePlane(i));
            }
        } else {
            System.out.println("Plane list not read");
        }
    }

    public void print() {
       if (reader.isRead()) {
            for (int i = 0; i < planeList.getSize(); i++) {
                System.out.println(planeList.getOnePlane(i));
            }
        } else {
            System.out.println("List not read");
        }
    }
    public void print(boolean isPassengerPlane) {
       if (reader.isRead()) {
            for (int i = 0; i < planeList.getSize(); i++) {
                if(isPassengerPlane && planeList.getOnePlane(i) instanceof PassengerPlane){
                    System.out.println(planeList.getOnePlane(i));
                }else if(!isPassengerPlane && planeList.getOnePlane(i) instanceof CargoPlane){
                    System.out.println(planeList.getOnePlane(i));
                }
            }
        } else {
            System.out.println("Vehicles list not read");
        }
    }

}
