package classes;

public class ClassesObjectsDemo {

    public static void main(String[] args) {

        System.out.println("In the main method");
        Car car1 = new Car();
        car1.brand ="Toyota";
        car1.speed = 100;
        car1.color = "red";
        car1.drive();

        Car car2 = new Car();
        car2.brand ="BMW";
        car2.speed = 140;
        car2.color = "Blue";
        car2.drive();

        



    }
}
