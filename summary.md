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
