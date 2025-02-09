import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Object> food=new ArrayList<>();

        food.add("Pizza");
        food.add("Apple");
        food.add("Banana");
        food.add("Bread");

        food.set(0,"Burger");
        food.remove(2);
        

        for (int i=0;i<food.size();i++) {
            System.out.println(food.get(i));
        }

    }
}
