public class Calender {
    public static void main(String[] args) {
        String day="Friday";

        switch (day){
            case "Sunday":
                System.out.println("It is sunday");
                break;
            case "monday":
                System.out.println("It is monday");
            break;
            case "tuesday":
                System.out.println("It is tuesday");
            break;
            case "wednesday":
                System.out.println("It is wednesday");
            break;
            case "Thursday":
                System.out.println("It is thursday");
            break;
            case "Friday":
                System.out.println("It is friday");
            break;
            case  "Saturday":
            System.out.println("It is saturday");
            break;
            default:
                System.out.println("Is not a day");
                break;
        }
    }
}
