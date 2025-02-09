public class Info {
    public static void main(String[] args) {
        Teacher teacher =new Teacher();
        teacher.name="Rafiur rahman";
        teacher.age=21;
        teacher.gender="male";
        System.out.println("Name: "+teacher.name);
        System.out.println("Age: "+teacher.age);
        System.out.println("Gender: "+teacher.gender);
        teacher.Laliga();
        teacher.Addnum(20,30);
        teacher.Mulnum(10,20);
        System.out.println("Value of x: "+teacher.x);
        System.out.println("Value of y: "+teacher.y);
        teacher.insVariable();


    }
}
