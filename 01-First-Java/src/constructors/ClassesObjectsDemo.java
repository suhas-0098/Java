package constructors;
public class ClassesObjectsDemo {

    public static void main(String[] args) {

        System.out.println("In the main method");
        Car car1 = new Car("Toyota","red",100);
        car1.drive();

        Car car2 = new Car("BMW","blue",140);
        car2.drive();
    }
}
