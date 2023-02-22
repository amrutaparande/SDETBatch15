package HomeWorkArrayList;

import java.util.ArrayList;

/*Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. */
public class HW4 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Soda");
        drinks.add("Coke");
        drinks.add("Tea");
        drinks.add("Milk");
        drinks.add("Gin");
        for(int i=0;i< drinks.size();i++){
            String drink=drinks.get(i);
            if(drink.contains("a") || drink.contains("e")){
                drinks.set(i,"water");
            }
        }
        System.out.println("new list of drinks"+drinks);


    }
}
