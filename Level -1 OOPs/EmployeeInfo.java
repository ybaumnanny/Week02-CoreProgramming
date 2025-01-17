class Employee{
    String nameOfEmployee;
    int id;
    double salary;
//Constructor created 
    Employee(String nameOfEmployee,int id,double salary){
        this.nameOfEmployee = nameOfEmployee;
        this.id = id;
        this.salary = salary;
    }
    //input taken
     public void printEmployeeDetails(){
        System.out.println("Name of Employee : "+nameOfEmployee);
        System.out.println("Employee id :" + id);
        System.out.println("Salary of Employee: "+salary);
    }
}
//main method created
public class EmployeeInfo{
//calling the method
    public static void main(String[] args) {
        Employee emp1 = new Employee("Yaman", 112244, 50000);
        emp1.printEmployeeDetails();
    }

}