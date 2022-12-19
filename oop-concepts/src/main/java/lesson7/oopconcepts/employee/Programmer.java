package lesson7.oopconcepts.employee;

public class Programmer extends Employee implements IWorkingAction {
    private String programmingLanguage;

    public Programmer(String name, int age, String gender, String grade, int salary, String programmingLanguage) {
        super(name, age, gender, grade, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void workingTask() {
        System.out.println("Delivering tickets");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                "} " + super.toString();
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
