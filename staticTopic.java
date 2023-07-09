class Employee {

    int empId;
    String empName;
    static String dressCode; // Static variable belongs to the class : So it should be called by the name of
                             // the class
                             // You can call the variable by object as well but that's not a good Practice

    static void show() {
        System.out.println("we are in static method and Today's Dress code is : " + dressCode);
        /*
         * This is static method : Without creating object of class you can call this
         * method and this function of Static method is Very Useful in Code readability
         * and Performnce
         */
    }

    static {
        System.out.println("We are in static class");
        // this method will execute once only
    }

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;

    }

    public int getID() {

        return empId;

    }

    public String getName() {
        return empName;
    }

    // Let's learn About Encapsulation : Encapsulation means we are biniding the
    // data with our methods that means no one from outside world is able to access
    // the data
    // But you can use that data inside the class using methods


    //This Keyword : this keyword is used to represent the current object of the class

    private String bossName;
    private int bossAge;

    public void setName(String bossName) {
        this.bossName = bossName;
    }

    public void setAge(int age) {
        bossAge = age;
    }

    public String get_Name() {
        return bossName;
    }

    public int get_Age() {
        return bossAge;
    }

}

public class staticTopic {

    // Here in Main Method We are using static keyword that means the main method is
    // static so we do not need to create the object of staticTopic Class
    // If we don't make the main method as static then the Execution of Program will
    // not start
    public static void main(String args[]) {

        // Even if you are creating more than one Object of the Class Employee here :
        // The value for static variable is same for all the object
        // So it is useful in terms of Memory Effciency

        Employee emp = new Employee(201, "Vijay");
        Employee.dressCode = "Blue";
        Employee.show();

        System.out.println("This is Constuctor with having values :" + emp.getID() + " : " + emp.getName());
        // Constuctor
        // is used
        // for
        // assigning
        // the
        // intial
        // value to
        // the
        // object
        // and it is
        // called
        // automatically
        // when you
        // create
        // the
        // object of
        // the class

        // Let's create a example for Encapsulation

        Employee e = new Employee(4505, "Babalu");
        e.setAge(70);
        e.setName("Vijju");

        System.out.println("Name : " + e.get_Name() + " : age :" + e.get_Age());

    }

}
