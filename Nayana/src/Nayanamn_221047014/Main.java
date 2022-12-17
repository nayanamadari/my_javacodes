package Nayanamn_221047014;

import static Nayanamn_221047014.MethodOverloadingEx.add;


public class Main {
    public static void main(String[] args) throws Throwable {
//        Maruti800 obj=new Maruti800();
//        obj.vehicleType();
//        obj.brand();
//        obj.speed();
// Dog dog1 = new Dog();
// dog1.printMessage();
//
    //        System.out.println("add() with 2 parameters");
  //          System.out.println(add(4, 6));

      //      System.out.println("add() with 3 parameters");
        //    System.out.println(add(4, 6, 7));

       // Dog d1 = new Dog();
      //  Animal a1 = new Animal();

       // d1.eat();
       // a1.eat();

       // Animal animal = new Dog();
        // eat() method of animal class is overridden by
        // base class eat()
       // animal.eat();

        // Creating the Object of Rectangle class
        // and using shape interface reference.
//        Shape rect = new Rectangle(2, 3);
//
//        System.out.println("Area of rectangle: "
//                + rect.area());
//
//        // Creating the Objects of circle class
//        Shape circle = new Circle(2);
//
//        System.out.println("Area of circle: "
//                + circle.area());

//        Finalize d = new Finalize();
//
//        // Calling finalize of demo
//        d.finalize();
//create an object of Student class
        Student s=new Student();
        //set fields values using setter methods
        s.setId (27);
        s.setname("Tom Lee");
        //print values using getter methods
        System.out.println("Student Data:" + "\nStudent ID:" + s.getId()
                + " Student Name:" + s.getname());
    }
}
