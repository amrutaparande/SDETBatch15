package HomeWorkArrayList;

import java.util.ArrayList;

/*Create an arraylist of cars and retrieve all the values using 3 different ways.*/
public class CarArray {
    public static void main(String[] args) {
        ArrayList<String> cars= new ArrayList<>();
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Tesla");
        cars.add("Nissan");
        System.out.println(cars);
        System.out.println("_-------------------");
        for (String car:cars) {
            System.out.println(car);
        }
        System.out.println("---------------------");
        for(int i=0;i< cars.size();i++){
            System.out.println(cars.get(i));
        }


    }

}
