package SingleResponsibilityPrinciple;

/* Below is the example which violates the Single Responsibility Principle
according to which "A class should have single reason to change.
class Employee{
    public void calculatePay(){}
    public void saveToDatabases(){}
    public void generateReport(){}
}
 */

class Employee{
    private String name;
    private double salary;
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }
}

class PayrollCalculator{
    public double calculatePay(Employee employee){
        return employee.getSalary();
    }
}

class EmployeeRepository{
    public void save(Employee employee){
        //code to save employee
    }
}

class ReportGenerator{
    public void generateReport(){
        // code to generate report
    }
}

public class SingleResponsibilityPrinciple {
}
