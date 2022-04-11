package aoop.ex;



import java.util.ArrayList;
import java.util.List;

public class SomeList {//класс , который работает со списком фильмов
    private final List<Plane> planes = new ArrayList<>();

    public void addVehicle(Plane plane){
        planes.add(plane);
    }

    public boolean remove(int id){//удалять по айди
        Plane plane;
        if(id > 0){
            plane = findById(id);// получили
            if(plane != null){
                    planes.remove(plane);
                return  true;
            }
        }
        return false;
    }


    public Plane findById(int id){//вернет фильм по айди
        Plane neededPlane = null;
        for (Plane vehicle : planes) {
            if(id == vehicle.getId()){
                neededPlane = vehicle;
            }
        }
        return neededPlane;
    }

    public int lastID(){
        return planes.size() == 0 ? 0 : planes.get(planes.size() - 1).getId();
    }


    public Plane getOnePlane(int index){
        if(index >= 0){
            return planes.get(index);
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

//    public SomeList find(int p){
//        SomeList moviesByYear = new SomeList();//вернет список фильмов по году
//        for (Vehicle vehicle : vehicles) {
//            if(p == vehicle.getPopulation()){
//                moviesByYear.addState(state);
//            }
//        }
//        return moviesByYear;
//    }

    public SomeList find(int year){
        SomeList moviesByYear = new SomeList();//вернет список фильмов по году
        for (Plane vehicle : planes) {
            if(year == vehicle.getYear()){
                moviesByYear.addVehicle(vehicle);
            }
        }
        return moviesByYear;
    }

    public int getSize(){
        return  planes.size();
    }
}
