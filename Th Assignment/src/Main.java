public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("Rafiur", 370);


        System.out.println("Employee Salary base only: " + emp.calculateSalary(100000));
        System.out.println("Employee Salary base + bonus: " + emp.calculateSalary(100000, 500));


        Manager mgr = new Manager("Ratul", 371, 5);


        System.out.println("Manager Salary base only: " + mgr.calculateSalary(3200000));
        System.out.println("Manager Salary base + bonus + team bonus: " + mgr.calculateSalary(3200000, 500));
    }
}
