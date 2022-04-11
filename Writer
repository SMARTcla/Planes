package aoop.ex;


//import exam.zadanie.Article;
//import exam.zadanie.ListOfArticles;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Writer {
    private  File file;
    private SomeList list;

    public Writer(SomeList list){
        this.list = list;
    }

    public void writeInBin(){
        file = new File("src\\aoop\\ex\\file.bin");
        if(list != null){
            List<Plane> tempList = new ArrayList<>();
            for (int i = 0; i < list.getSize(); i++) {
                tempList.add(list.getOnePlane(i));
            }
            try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))){
                outputStream.writeObject(tempList);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            if(!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
