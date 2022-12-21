package composite;

public class Company {
    public static void main(String[] args) {
        Developer dev1 = new Developer(450, "senior", "John");
        Tester tester1 = new Tester(259, "junior", "Ana");//simple object

        CompanyDirector director = new CompanyDirector("Andy Brown");
        director.addEmployee(dev1);
        director.addEmployee(tester1);

        Developer dev2 = new Developer(451, "senior", "Ion");
        Tester tester2 = new Tester(258, "junior", "Anna");
        Manager manager = new Manager(300, "manager", "Alina");
        CompanyDirector director2 = new CompanyDirector("John Smith");//composite object
        director2.addEmployee(dev2);
        director2.addEmployee(tester2);
        director2.addEmployee(manager);

        CompanyDirector company = new CompanyDirector("Boss");
        company.addEmployee(director);
        company.addEmployee(director2);

        company.showDetails();
    }
}
