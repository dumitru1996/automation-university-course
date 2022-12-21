package composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirector implements IEmployee {//composite class
    String name;
    List<IEmployee> employees = new ArrayList<>();


    public CompanyDirector(String name) {
        this.name = name;
    }

    public void addEmployee(IEmployee employee) {
        employees.add(employee);
    }

    @Override
    public void showDetails() {//includes leaf classes in method implementation
        System.out.println("Director has the following team");
        for (IEmployee employee : employees) {
            employee.showDetails();
        }
    }
}
