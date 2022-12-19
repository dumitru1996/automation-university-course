package lesson7.oopconcepts.employee;

public class Manager extends Employee implements IWorkingAction {
    private String managedTeam;

    public Manager(String name, int age, String gender, String grade, int salary, String managedTeam) {
        super(name, age, gender, grade, salary);
        this.managedTeam = managedTeam;
    }

    @Override
    public void workingTask() {
        System.out.printf("Managing team %s%n", managedTeam);
    }

    public static double calculateEmployeeAnnualSalary(Employee employee) {
        return employee.getSalary() * 12;
    }

    public static double calculateEmployeeAnnualSalary(Employee employee, double bonus) {
        return employee.getSalary() * 12 + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managedTeam='" + managedTeam + '\'' +
                "} " + super.toString();
    }

    public String getManagedTeam() {
        return managedTeam;
    }

    public void setManagedTeam(String managedTeam) {
        this.managedTeam = managedTeam;
    }
}
