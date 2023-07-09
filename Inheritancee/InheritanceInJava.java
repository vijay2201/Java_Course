package Inheritancee;

public class InheritanceInJava {

   public static void main(String []args){
       //AdvanceCalculator ac = new AdvanceCalculator(); //This is Single Level inheritance
       ScientificCalculator sc = new ScientificCalculator(); //Here We are Using Multi Level inheritance

       System.out.println("Addition : "+sc.add(1,2)
               +"\nSubtraction : "+ sc.subtract(4,5)
               +"\nMultiplication : "+ sc.multiply(5,5)
               +"\nDivision  : "+sc.divide(90,10)
                +"\nPower : "+sc.power(5,5));

       /*
       1.Method Overriding : That means when we two Classes One Parent And one Child : imagine there is Inheritance Between the Classes
       So Now When You Create the Method with same name and Parameters then
        the Compiler will the Method of Child That is Called as Overriding of method


       2.Naming Convention : So Naming Convention is refers to name of the
       variables,method ,Class ,interface and all :There are ways how you can write a variable name
       such as it should be in small case ,If you are creating a Constant then you write in CAPITAL such like
       Class name With the First letter capital ,method with Camel Casing and so on.

       3.Why Multiple Inheritance Does not work in java : Let's say we have two classes A and B
       which are parent for Class C and If A and B both class have same Method as Add() Then
       Compiler will get Confuse at the time of calling the method by the object of C class,that is why there is
       no such concept like Multiple Inheritance in Java.

       4.Packages In Java : Package is like a folder in java :Let's say if you have two java files in the same package
       then it is possible to use the functionality(if not private) in between both the files.

       Now there are some In Built Classes such as Util,Math which we use by Importing the Package :

       Some Packages are in built ,so we do not need to import separately.

       5.Access Modifier : Default, Public ,Protected ,Private
       Default can be accessed inside the same package.
       Public : Can be accessed anywhere in class,package,subclass.
       Protected : can be in class,same package ,another package but subclass
       Private : Can be accessed inside the class only

       Remember : You cannot have two public class in same java file

       */

   }


}
