public class Life {
    static class Human {
         String name;
         int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    static class Teacher extends Human {
        private String varsity;
        private String department;

        public Teacher(String name, int age, String varsity, String department) {
            super(name, age);
            this.varsity = varsity;
            this.department = department;
        }

        public void displayInfo() {
            super.displayInfo();
            System.out.println("University: " + varsity);
            System.out.println("Department: " + department);
        }
    }

    static class Student extends Human {
        private String id;
        private double gpa;

        public Student(String name, int age, String id, double gpa) {
            super(name, age);
            this.id = id;
            this.gpa = gpa;
        }



        public void displayInfo() {
            super.displayInfo();
            System.out.println("ID: " + id);
            System.out.println("GPA: " + gpa);
        }
    }

    public static void main(String[] args) {
        // Create a Teacher object
        Teacher teacher = new Teacher("Alice", 45, "UIU", "Computer Science");
        System.out.println("Teacher Details:");
        teacher.displayInfo();
        System.out.println();

        // Create a Student object
        Student student = new Student("John", 20, "2345", 3.75);
        System.out.println("Student Details:");
        student.displayInfo();
    }
}
