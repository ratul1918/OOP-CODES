import java.util.Scanner;

public class Supply {
    int FoodCode;
    String FoodName;
    String Sticker;
    String FoodType;



    public void GetType(){
        if(Sticker.equals("Green")){
            FoodType="Vegetarian";
        }
        else if(Sticker.equals("Yellow")){
            FoodType="Contains eggs";
        }
        else if(Sticker.equals("Red")){
            FoodType="Non Vegetarian";
        }
    }

    public void FoodIn(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the food code: ");
        FoodCode=sc.nextInt();
        System.out.println("Enter The name of food: ");
        FoodName=sc.next();
        System.out.println("Enter the sticker colour: ");
        Sticker= sc.next();;
        GetType();

    }
    public void FoodOut(){
        System.out.println("Food type: "+FoodType);
        System.out.println("Food code: "+FoodCode);
        System.out.println("Food name: "+FoodName);
        System.out.println("Food sticker colour: "+Sticker);
    }

}
