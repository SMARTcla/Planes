package aoop.ex;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Reader {
     private SomeList planes;
     private File file;
     private boolean isRead;

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public  SomeList readFromDat(){
        planes = new  SomeList();
        List<Plane> tempMovie;
        file = new File("src\\aoop\\ex\\file.bin");
        if(file.exists() && file.length() != 0){
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                tempMovie = (ArrayList<Plane>)inputStream.readObject();
                for (int i = 0; i < tempMovie.size(); i++) {
                    planes.addVehicle(tempMovie.get(i));
                    isRead = true;
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return planes;
    }
}
