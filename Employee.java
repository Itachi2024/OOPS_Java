// 3. Create a class Employee with overloaded constructors to initialize employee details based on different combinations of arguments. Ensure the constructors support the creation of objects in various ways.
// Solution:

public class Employee {
    private String name;
    private int id;
    private String department;

    public Employee(String name){
        this.name = name;
    }
    public Employee(String name , int id){
        this.name = name;
        this.id =id;
    }
    public Employee(String name, int id , String department){
        this.name = name;
        this.id =id;
        this.department=department;
    }
    void display(){
        System.out.println("Employee name :"+this.name);
        if(id!=0)System.out.println("Employee id:"+this.id);
        if(department!=null)System.out.println("Employee department :"+this.department);

    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Sourabh");
        emp1.display();
        Employee emp2 = new Employee("Sourabh",10);
        emp2.display();
        Employee emp3 = new Employee("Sourabh",10,"Jaipur");
        emp3.display();
    }
}
