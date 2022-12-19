package lesson7.oopconcepts.employee;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("Alex", 20, "Male", 10, "str. Merilor 10");
        System.out.println(client);
        Client.orderProduct(client, 11);
        Client.orderProduct(client, 12, 20);

        Manager manager = new Manager("John", 26, "Male", "Junior", 10000, "Team 1");
        System.out.println(manager);

        Programmer programmer = new Programmer("Ana", 27, "Female", "Senior", 20000, "Java");
        System.out.println(programmer);

        System.out.println(Manager.calculateEmployeeAnnualSalary(manager, 15000));
        System.out.println(Manager.calculateEmployeeAnnualSalary(programmer));

        manager.workingTask();
        programmer.workingTask();
    }
}
