package Nayanamn_221047014;

class Dog extends Animal {
    void eat()
    {
        System.out.println("eat() method of derived class");
        System.out.println("Dog is eating.");
    }
    // overriding method
    @Override
    public void display(){
        System.out.println("I am a dog");
    }

    public void printMessage(){

      //prints current class message
        display();

        System.out.println("Calling parent class method using super key word ");
        //prints Parent(super) class message
        super.display();
    }
}
