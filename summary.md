Java Notes:
-----------------------------------------------

**What is Java ?**

- Java is a popular and powerful programming language, created in 1995.

- It is owned by Oracle, and more than 3 billion devices run Java.

- It is used for:
- Mobile applications (specially Android apps)
- Desktop applications
- Web applications
- Web servers and application servers
- Games
- Database connection
- And much, much more!

**History**

- Java was created in 1991 by james gosling and his team at Sun Microsystems

- The original project was called "Oak".

- Later renamed to Java inspried by java coffee

- In 2009, Oracle corporation acquired sun microsystem, and now oracle maintains java

**Java SE - Standard Edition** : Core Java (OPPS, Collections, Multithreading)

**Java EE (Jakarta EE) - Enterprise Edition** : Servlets, JSP, EHB.

**Java ME - Micro Edition** : For embedded or mobile devices


JDK vs JRE vs JVM :
-------------------

JRE : Java Runtime Environment (JVM + Standard Libraries)
JDK : Java Development Kit (JRE + Development Tools)
JVM : Java Virtual Machine (Runs code)

- Java code compile process :

java program(.java) > complile (javac) > .class file(bytecode) > JRE > output


**Java File Run steps in cmd**

1. Save file name using .java (HelloWorld.java)
2. Open CMD - (where your file save)
3. javac HelloWorld.java
4. In same Folder you see .class File
5. java HelloWorld
6. Output - Hello,java!

Note : if any changes in the program, you will have to complie it again 


What is Boilerplate code in java ?
----------------------------------

Boilerplate code means the standard, repetitive code that you have to write again and again in java (or any language) Just to make your program work even if it does not do anything unique.

- Example of Boilerplate code in java : 

public class HelloWorld{
    public  static  void main(String[] args){
        System.out.println("Hello World");
    }
        }

- public class HelloWorld : Declares a class Helloworld. Every java program must have at least one class

- {.....} : Curly braces define the body of the class or method

- public  static  void main(String[] args) : This is the main method the starting point of any java program 

- System.out.println(" "); : prints text to the console

Key New Features in Java 25 :
-----------------------------

1. Compact source file :

You no longer need to write public class for small programs 

eg : void main(){
    System.out.println("Hello Java 25");
}

Makes writing small or script like programs easier

2. Flexible Constructor Bodies :

You can now write logic before calling super() or this () in constructors.

eg : Class Student{
    Student(String name){
      System.out.println("Validation");
      this.name=(name==null) ? "unknown":name;
    }
}

Easier to add validation, logging, or pre-checks inside constructors.

3. Module Import Declarations :

You can now import modules direclty inside your java file.

eg : import module mytools;

    void main(){
      System.out.println("Module imported!");
    }

Makes modular programming simpler and more flexible.

4. Pattern matching for primitives :

Pattern matching now works with primitive types like int, double , etc 

Object obj = 25;
if(obj instanceof int i){
  System.out.println("Value : " +i);
}

"Cleaner and more readable code when working with primitives"

5. Compact object Headers :

JVM now uses smaller object headers less memory usage. Internal improvement no - Better memory effieciency and faster performance.

6. Generational Shenandoah :

The Shenandoah garbage collector now supports generational mode. Handles short-lived and long-lived objects separately faster GC and smooth performance

7. Removed 32 bit :

Java 25 no longer supports 32 bit system only 64 bit platforms are supported 

cleaner, more optimized JVM for moderm system 

Variables in Java :
-------------------

A variable in java is a name that stores a value in memory 
it acts like a container that holds data which can be used and changed in a program 

Syntax of a variable : 

dataType variableName = value;

int age = 25;

int : data type 
age : variable name 
25  : value 


- Constant Variable (Final) :

if you do not want the value to change use Final.

Final double PT = 3.14;

Now, PI cannot be changed;

Java Keywords :
-------------------

Keywords are reserved words in java that have a special meaning to the compiler.

eg : int , class , if , for , return all are java keywords.

- Total Keywords in Java : 

Java has 67 keywords (as of java 25). These words are predefined and cannot be changed.

What is a Comment :
-------------------

A comment in java is non-excutable text used to explain code. The complier ignores comments They are only for readability and documentation.

Single    : // ---   : for short notes
MultiLine : /*----*/ : for long
Documentations : /**----*/ : for api or project docs

Package (Folder) :
------------------

A Package in java is way to group class and interfaces like folders on your computer. It helps to organize code, avoid name conflicts and control access.

Types :
--------

1. Built - in packages (predefined) like 
   Java.util, Java.io, Java.sql 

2. User-defined Packages : The ones we create ourselves

eg : file 1 ;

    package MyPackage;
    public class MyClass{
     public static void show(){
       System.out.println("Hello World");
        } 
        }

   : file 2 ;

   import MyPackage.MyClass;
   public class Test {
    public static void main(String[] args){
      MyClass obj = new Myclass();
      obj.show();
    }
   }

Main Points : 
-------------

- Package = Folder for java Class 
- Helps in code management 
- Avoids naming conflicts 
- Controls access

Rules of Variable Declaration :
-------------------------------

- Case-Sensitive (age != Age)
- Must begin with a letter , '_' or '$' (but prefer letters)
- Cannnot start with a digit 
- No Spaces or special symbols (%,#,@,etc)
- Cannot be a Java Keyword (eg, int, class , etc)
- can contain letters digit , '_' or '$' after the first character 
- use meaningful names (avoid x1, x2, a2)
- use lowerCamelCase for normal 
- use UPPER_CASE_WITH_U

What are Data Types :
---------------------

A data type defines what kind of data a variable can store.

eg : int age = 25 ; --> age is an integer
     String name = "Suhas"; --> name is string


- Think of it as the "shape" or "Category" of the data

- Types : 

**1. Primitive Data Types :** These are the most types directly stored in memory.

- byte, short, int, long, float, double, char, boolean

- A bit is the smallest unit of data in a computer. It can have only two possible values 0 (off) or 1 (on).

- Unicode :

Unicode is a standard system that gives a unique number to every character used in any language.

It helps computers and display text properly across all language 

eg : A = \u0041,
     a = \u0061, etc


**2. Non-Primitive Data Types :**

These are created by the programmers or java itself.

1. String : (sequence of characters)/text
2. Array  : Collection of same data type values
3. Class  : Blueprint or template for creating objects
4. Object : Instance of a class 
5. Interface : Like a blueprint of a class(contains only method declarations)


- Primitive holds value directly 
- Non-Primitive holds reference(address) of object.

Control Flow :
--------------

Control flow means the order in which statements, instructions, or function calls are executed in a program

- 3 main types of control flow statements:

1. Decision Making : Choose one path from many
2. Looping         : Repeat a block of code
3. Jumping         : Jump from one point to another

- Decision Making : if , if-else, else if ladder , switch statement

- Looping : for , while , do while

- Jumping : break , continue, return


What is a method in java ?
--------------------------

- A method in java is block of statements that perform a specific task.
- It is also called function
- method help in resuing code
- Advantages of methods : 
  - Orgainzes code
  - Reuses code
  - Makes program readable and maintainable.


Operators in Java :
-------------------

Symbols that tell compiler to perform some operation 

1. Arithemtic operators : +,-,*,/,%
2. Relational operators : ==,!=,>,<,>=,<=
3. Logical operators    : $$, ||, !
4. Assignment operators : =


Types of Programming Languages:
-------------------------------

1. Low-level language :

These are closest to the computer hardware and are directly understood by the machine

eg : Machine language written in binary code 

2. Assembly language : 

uses symbolic codes (like : mov, add, sub, etc)
used for system programming device drivers and embedded systems

3. High-level Language : 

These are easy for humans to understand and write they require a compiler or interpreter to translate into machine code 

eg : c, c++, java, python etc.

4. Procedural Language :

These are based on a step-by-step procedure or instructions.

eg : c, pascal, fortran

used : Scientific, Mathematical and general purpose programming

5. Functional Language : 

These focus on functions and avoid changing state or data

eg : Lisp, Haskell, Scala

used : Artifical Intelligence, Mathematical computation, and data analysis

6. Scripting Languages :

These are mainly used for automationn and web scripting 

eg : JavaScript, Python, PHP, Perl, etc

used : Web developmenet, automation scripts, and server management

7. Markup and Query Language:

These are used to structure, format or manage data.

eg : HTML, SQL, XML/JSON

8. Object Oriented Programming(OOPs) :

- Everything is represented in the form of objects.
- Objects are instance of classes
- Class is like a blueprint, Object is a real thing built from the blueprint
- OOPs help us desing software by thinking in terms of real-world entities -- like a car, student, bank account etc.

- OOPs Principles : 

**Encapsulation**
**Abstraction**
**Inheritance**
**Polymorphism**

Class in Java : 
----------------

A class in a blueprint or template for creating objects. It defines what data(variable) and functions(methods) an object will have

```
public class Car {
    String brand;
    String color;
    int speed;

    public Car(String brand,String color,int speed){
        this.brand = brand;
        this.color = color;
        this.speed=speed;
    }

    void drive(){
        System.out.println(this.brand +" " + this.color + " is driving at speed " + this.speed);
    }

    void display(){
        System.out.println(this.brand+" "+this.color+" "+this.speed);
    }

}

```

Object in Java :
-----------------

An object is an instance of a class- a real example created using that blueprint

```
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
```

What is a constructor in Java ?
-------------------------------

A constructor is a special method in java that is automatically called when an object of a class is created.

- Important Rules : 
  - The constructor's name must be the same as the class name
  - It has no return type not even void

- Types of Constructors :

  1. Default Constructor : 
  A constructor with no parameters if you do not define any constructor, java auutomatically provides a default constructor.

  2. Parameterized Constructor : 
  A constructor that takes parameters to initialize specific values 

  3. Copy constructor(user-defined) :
  Java does not have a built in copy constructor like c++, but we can make one manually to copy data from an other object

```
package constructors;

public class Car {
    String brand;
    String color;
    int speed;

    public Car(String brand,String color,int speed){
        this.brand = brand;
        this.color = color;
        this.speed=speed;
    }

    void drive(){
        System.out.println(this.brand +" " + this.color + " is driving at speed " + this.speed);
    }

    void display(){
        System.out.println(this.brand+" "+this.color+" "+this.speed);
    }

}

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

```

- Note : 
**"this"** keyword in java is a reference variable that refers to the current object (the object which is calling the method or constructor)

Getter and Setter in Java :
---------------------------

Getters and Setters are special methods used to access and modify private variables of a class.

They help in encapsulation hiding data and controlling access to it.

- Why to use them ?

  1. To make class fields private(data hiding)
  2. To provide controlled access to variables
  3. To validate or modify data before setting or returning it 


what is Encapsulation in Java :
-------------------------------

Encapsulation means binding data(variables) and method(functions) that operate on the data into a single unit(class) and restricting direct access to the data

- Key concept : 

  - Make variables private not accessible directly
  - use getter and setter methods to access or modify data safely

- Advantages :
  1. Data Security
  2. Data Control 
  3. Code Flexibility
  4. Improved Maintenance

```
package encapsulation;

public class Car {
    String brand;
    String color;
    int speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car(String color, int speed, String brand) {
        this.color = color;
        this.speed = speed;
        this.brand = brand;
    }


    void drive(){
        System.out.println(this.getBrand() +" " + this.getColor() + " is driving at speed " + this.getSpeed());
    }



}


package encapsulation;

public class ClassesObjectsDemo {

    public static void main(String[] args) {

        Car car1 = new Car("red",100,"Toyota");
        car1.drive();

        Car car2 = new Car("blue",140,"BMW");
        car2.drive();


    }
}

```

Inheritance in Java :
---------------------

Inheritance is a mechanism in java by which one class (child/subclass) can acquire properties and behaviors(Fields and Methods) of another class (Parent/superclass)

- Purpose : 
  - To reuse code 
  - To avoid duplication
  - To establish relationship between classes
  - To support polymorphism


- Types of Inheritance in java :
  1. Single Inheritance : One class inherits another
  2. Multilevel Inheritance : Class inherits from another class which is already a subclass
  3. Hierarchial Inheritance : Multiple Subclasses inherit from one parent 
  4. Multiple Inheritance (through interfaces) : one class implements multiple interfaces

- Advantages of Inheritance :
  1. Code Reusability
  2. Easy Maintenance
  3. Method Overriding
  4. Clean Structure

- Rules of Inheritance : 
  1. Private memebers of parents are not inherited
  2. constructors are not inherited but can be called using super()
  3. Java does not support multiple inheritance with classes(only via interfaces)
  4. Order of Constructor call : Parent, Child

```
package inheritance;

public class Vehicle {
    private String brand;
    private int speed;

    public Vehicle() {
    }

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " hm/hr");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

package inheritance;

public class Car extends Vehicle {
    private int doors;


    public Car(String brand, int speed, int doors) {
        super(brand, speed);
//        this.brand = brand;
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + getBrand() + ", Speed: " + getSpeed() + " hm/hr " + doors + " doors");
    }
}

package inheritance;

public class Bike extends  Vehicle{
    private boolean hasCarrier;

    public Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + getBrand() + ", Speed: " + getSpeed() + " hm/hr " + hasCarrier);
    }
}

package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 200, 5);
        c1.displayInfo();

        Bike b1 = new Bike("Yamaha", 120, true);
        b1.displayInfo();
    }
}

```


Polymorphism in Java :
----------------------

Polymorphism means "one name with many forms".
In Java it allows a single method or object to behave differently based on context or object type 

- Types of Polymorphism in Java :
  1. Compile Time : also called static polymorphism/ method overloading 

  2. Runtime : Dynamic Polymorphism/ Method overriding


```
public class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void start() {
        System.out.println("Starting Vehicle...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " hm/hr");
    }
}

public class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void start() {
        System.out.println("Starting Bike...");
    }

    public void start(String greet) {
        System.out.println("Starting Bike..." + greet);
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + getBrand() + ", Speed: " + getSpeed() + " hm/hr " + hasCarrier);
    }
}

public class Car extends Vehicle {
    private int doors;


    public Car(String brand, int speed, int doors) {
        super(brand, speed);
//        this.brand = brand;
        this.doors = doors;
    }

    @Override
    public void start() {
        System.out.println("Starting Car...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + getBrand() + ", Speed: " + getSpeed() + " hm/hr " + doors + " doors");
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}


public class PolymorphismDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 200, 5);
        c1.displayInfo();

        Bike b1 = new Bike("Yamaha", 120, true);
        b1.displayInfo();

        c1.start();
        b1.start();

        Vehicle v1 = new Vehicle("VehicleBrand", 202);
        v1.start();

        // Method Overriding (Runtime Polymorphism)
        Vehicle v2 = new Car("Ford", 210, 6);
        v2.start();

        Vehicle v3 = new Bike("Yamaha", 120, true);
        v3.start();


        // Method overloading
        b1.start();

        Calculator calculator = new Calculator();
        System.out.println("SUM(int): " + calculator.add(5, 6));
        System.out.println("SUM(int): " + calculator.add(5.6, 6.7));
    }
}
```


Abstraction in Java :
---------------------

Abstraction is the OOP concept of hiding internal implementation details and showing only essential features to the user

1. Abstract class :

A class declared with 'abstract' keyword can have abstract methods(no body) and concrete method(with body) 
can not create objects of an abstract class directly

  - Key Points :
    - Abstract class - Blueprint for subclasses
    - Subclass must implement all abstract method
    - can have constructors, fields, and normal methods
    - can achieve partial abstraction

```
package abstraction;

abstract public class BankAccount {

    private String accountNumber;
    private double balance;

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

package abstraction;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposited Current");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawn Current");
    }
}
package abstraction;

public class KidsAccount extends BankAccount{

    public KidsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }
}
package abstraction;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposited");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawn");
    }
}

package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("kfgkaofa", 100);
        savingsAccount.deposit(100);

        BankAccount savingsAccount1 = new SavingsAccount("afasfafca", 500);
                    savingsAccount1 = new CurrentAccount("Aagwqgwbvgw", 900);
                    savingsAccount1.deposit(200);

        System.out.println(savingsAccount1.getAccountNumber());
        savingsAccount1 = new SavingsAccount("SAVING", 1000);
        System.out.println(savingsAccount1.getAccountNumber());
    }
}


```

2. Interface :

Pure abstraction only methods signatures 
declared using interface keyword classes implement the interface using implements keyword

```
package interfacedemo;

public interface CarControls {
    void turnRight();
    void turnLeft();
    void applyBrakes();

//    default void accelerate() {
//
//    }
}

package interfacedemo;

public class ElectricCar implements CarControls{
    @Override
    public void turnRight() {
        System.out.println("ELECTRIC RIGHT");
    }

    @Override
    public void turnLeft() {
        System.out.println("ELECTRIC LEFT");
    }

    @Override
    public void applyBrakes() {
        System.out.println("ELECTRIC BRAKES");
    }
}

package interfacedemo;

public class SportsCar implements CarControls {
    @Override
    public void turnRight() {
        System.out.println("SPORTS RIGHT");
    }

    @Override
    public void turnLeft() {
        System.out.println("SPORTS LEFT");
    }

    @Override
    public void applyBrakes() {
        System.out.println("SPORTS BRAKES");
    }
}

package interfacedemo;

public class InterfaceDemo {
    public static void main(String[] args) {
//        ElectricCar e1 = new ElectricCar();
//        e1.applyBrakes();
//        e1.turnLeft();

        CarControls myCar1 = new ElectricCar();
        myCar1.turnLeft();

        CarControls myCar2 = new SportsCar();
        myCar2.turnLeft();
    }
}
```


Difference between Abstract class and Interfaces :
--------------------------------------------------
| Feature               | Abstract class              | Interface                              |
|------------------------|------------------------------|-----------------------------------------|
| Inheritance            | extends                     | implements                              |
| Methods                | Abstract class + concrete   | only abstract (before Java 8)           |
| Variables              | can have instance variables | only constants (public, static, final)  |
| Constructor            | yes                          | no                                       |
| Multiple Inheritance   | Not allowed                  | Allowed                                  |
| Object creation        | no                            | no                                       |