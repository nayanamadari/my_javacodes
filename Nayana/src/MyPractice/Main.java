package MyPractice;

import static MyPractice.Static.myStaticMethod;

public class Main {
    public static void main(String[] args) {
//        myStaticMethod();
//       Public obj= new Public();
//        obj.Public();
//
//        Constructor newObj= new Constructor(1999,"BMW");
//        System.out.println(newObj.modelYear + " " +newObj.modelName);

        Person myobj= new Person();
        myobj.setName("Nayana");
        System.out.println(myobj.getName());
    }
}
