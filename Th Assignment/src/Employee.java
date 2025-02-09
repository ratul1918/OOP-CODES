class Employee {
    protected String name;
    protected int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public double calculateSalary(double baseSalary) {
        return baseSalary;
    }
    public double calculateSalary(double baseSalary, double bonus) {
        return baseSalary + bonus;
    }
}
 class Manager extends Employee {

    private int teamSize;

     Manager(String name, int id, int teamSize) {
        super(name, id);
        this.teamSize = teamSize;
    }
    @Override
    public double calculateSalary(double baseSalary, double bonus) {
        double managementBonus = teamSize * 100;
        return baseSalary + bonus + managementBonus;
    }
}