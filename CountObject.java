// 11. Create a program that keeps track of the number of objects created and displays the count in a function called display().


public class CountObject {
    private  int counter;
     CountObject(){
        counter++;
    }
    public void display(){
        System.out.println(counter);
    }

    public static void main(String[] args) {
        CountObject cb = new CountObject();
        cb.display();
        CountObject cb2 =new CountObject();
        CountObject cb3 =new CountObject();
        cb3.display();

    }

}
