package lesson7.oopconcepts.employee;

public class Employee extends Person {
    private String grade;
    private int salary;

    public Employee(String name, int age, String gender, String grade, int salary) {
        super(name, age, gender);
        this.grade = grade;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender='" + super.getGender() + '\'' +
                "grade='" + grade + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
