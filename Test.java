package aoop.ex;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public  static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public  static final String ANSI_RESET = "\033[0m";
    public  static final String ANSI_SOME_COLOR = "\033[0;34m";
    public static void main(String[] args){
        boolean exit = true;
        String name;
        double price,  lifting;
        int year, capacity;
        int choice;
        boolean isPassengerPlane = false;
        WorkerWithPlanes worker = new WorkerWithPlanes();
        worker.readStateList();
        while (exit){
            printMenu();
            choice = scan();
            switch (choice){
                case 1:
                    worker.print();
                    break;
                case 2:
                    System.out.println("PassengerPlane(1) or CargoPlane(2)?");
                    choice = scan();
                    switch (choice){
                        case 1:
                            isPassengerPlane = true;
                            break;
                        case  2:
                            isPassengerPlane = false;
                            break;
                        default:
                            System.out.println("Incorrect input data.Try again");
                    }
                    worker.print(isPassengerPlane);
                    break;
                case 3:
                    System.out.println("Enter name");
                    name = scanLine();
                    System.out.println("Enter year");
                    year = scan();
                    System.out.println("Enter price");
                    price = scanD();
                    System.out.println("PassengerPlane(1) or CargoPlane(2)?");
                    choice = scan();
                    switch (choice){
                        case 1:
                            isPassengerPlane = true;
                            System.out.println("Enter capacity");
                            capacity = scan();
                            worker.addNewPlane(name, year, price, capacity);
                            break;
                        case  2:
                            isPassengerPlane = false;
                            System.out.println("Enter lifting");
                            lifting = scanD();
                            worker.addNewPlane(name, year, price, lifting);
                            break;
                        default:
                            System.out.println("Incorrect input data.Try again");
                    }
                    break;
                case 4:
                    System.out.println("Enter id");
                    choice = scan();
                    worker.removePlane(choice);
                    break;
                case 5:
                    System.out.println("Enter year");//Введите штат с популяцией выше какой вы хотите найти
                    choice = scan();
                    worker.findYear(choice);
                    break;
                case 0:
                    System.out.println("Vehicles are written");
                    worker.writeStateList();
                    exit = false;
                    break;
                default:
                    System.out.println("Incorrect input data.Try again");
            }
        }

    }

    public static void printMenu(){
        System.out.println(ANSI_SOME_COLOR + "Choose:");
        System.out.println("1." + ANSI_RESET + "Show vehicles");
        System.out.println(ANSI_SOME_COLOR + "2." + ANSI_RESET  + "Show Car or Track");
        System.out.println(ANSI_SOME_COLOR + "3." + ANSI_RESET  + "Add vehicle");
        System.out.println(ANSI_SOME_COLOR + "4." + ANSI_RESET  + "Remove vehicle by id");
        System.out.println(ANSI_SOME_COLOR + "5." + ANSI_RESET  + "Find by year");
        System.out.println(ANSI_SOME_COLOR + "0." + ANSI_RESET  + "Exit");
    }


    public static int scan(){
        int choice = 0;
        boolean flag = true;
        while (flag){
            flag = false;
            try {
                choice = Integer.parseInt(in.readLine());
            } catch (NumberFormatException | IOException e){
                //e.printStackTrace();
                flag = true;
                System.err.println("Incorrect number format");
            }
        }
        return choice;
    }

    public static double scanD(){
        double choice = 0;
        boolean flag = true;
        while (flag){
            flag = false;
            try {
                choice = Double.parseDouble(in.readLine());
            } catch (NumberFormatException | IOException e){
                //e.printStackTrace();
                flag = true;
                System.err.println("Incorrect number format");
            }
        }
        return choice;
    }

    public static String scanLine(){
        String inputChoice = "";
        try {
            inputChoice = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputChoice;
    }
}
