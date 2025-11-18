// 17. Create a class Employee with members empNo, name, department, and salary. In main, create a reference variable of type Employee, allocate memory for the Employee object using the new operator, and initialize the data members using command line arguments. Display the data members.

public class EmployeeCMD {
    private int empNo;
    private double salary;
    private String name , department;

    EmployeeCMD(int empNo , String name , String department , double salary){
        this.empNo=empNo;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee Number: " + empNo);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        if(args.length!=4){
            System.out.println("Please provide all required command line arguments: empNo name department salary");
            return;
        }
        int empNo=Integer.parseInt(args[0]);
        String name = args[1];
        String department = args[2];
        double salary = Double.parseDouble(args[3]);

        EmployeeCMD emp = new EmployeeCMD(empNo, name, department, salary);
        emp.displayEmployeeDetails();

    }


}
