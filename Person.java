// 7. Create a class Person with firstName and lastName as data members. Override the toString() method to return the full name of the person. Define constructors to take appropriate parameters.

public class Person {
    private String firstName , lastName;

    public Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    @Override
    public String toString(){
        return firstName+" "+lastName;
    }
    public static void main(String[] args) {
        Person p = new Person("Sourabh", "Joshi");
        String full = p.toString();
        System.out.println(full);
    }

}
