// 8. Create a Student class with name, rollNo, and marks as attributes. Write a method to calculate the grade based on the marks and display the grade. Create multiple instances of the Student class and print their grades.
public class Student {
    private String name;
    private int rollNo;
    private double marks;
    public Student(String name , int rollNo , double marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public String calculateGrade(){
        if(marks>=90) return "A";
        else if(marks>=80) return "B";
        else if(marks>=70) return "C";
        else if(marks>=60) return "D";
        else return "F";
    }
    public static void main(String[] args) {
        Student s = new Student("Sourabh", 116, 77);
        String res = s.calculateGrade();
        System.out.println(res);
    }
}
