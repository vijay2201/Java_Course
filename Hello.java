
//Classes In Java 
/*(Class provides blueprint of Behaviour & properties to the object 
which is Instance of Class through 
which we can access the class properties)
*/

/*Every time when you create any variable it is stored inside the stack memory by JVM 
 and When you even call the method It creates new stack memory and stores the value 
 but when you create object ..JVM creates object Inside Heap memory where the the value for object is stored
 But the Reference variable (Object) is Stored inside the stack with its Reference value So this is how heap memory and Stack memory are connected with each other
  
 */

class Calcultor {
  // this is called as instance variable
  int b5 = 90;

  // here num1 & num2 are local variable
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  public int add(int num1, int num2, int num3) {
    return num1 + num2 + num3;
  }

  public double add(int num1, double num2) {
    return num1 + num2;
  }

}

class Hello {
  public int calculateSum(int a, int b) {
    int sum = a + b;
    return sum;

  }

  public static void main(String a[]) {
    // Explanation of return keyword(Refer the Class)
    Hello example = new Hello();
    int result = example.calculateSum(5, 3);
    System.out.println("The sum is: " + result);

    // Creating an object for the Calculator class and perfoming different operation
    // using method overloading
    Calcultor obj1 = new Calcultor();

    int result6 = obj1.add(3, 4, 5);
    System.out.println("Performing Method Overloading :  " + result6);

    System.out.println("God Father of Java is James Gosling:His team(GrrenTeam) introduced Java In 1995");

    // literals

    // Binary Number
    int num1 = 0b1001;

    // Hexa decimal Number
    int num2 = 0x1001;

    System.out.println("1 : Literals");
    System.out.println(num1);
    System.out.println(num2);
    System.out.println("*************");

    // Type Conversion
    Byte b = 127;

    int i = 12;

    i = b;
    System.out.println("2 : Type Conversion or Implicit Conversion");
    System.out.println(i);
    System.out.println("*************");

    // Type casting

    Byte x = 126;
    int y = 564;

    y = (Byte) x;
    System.out.println("3 : Type casting or Explicit Conversion");
    System.out.println(y);
    System.out.println("*************");

    // Type Promotion
    byte q = 10;
    byte w = 20;

    int result1 = q * w;
    System.out.println("4: Type Promotion");
    System.out.println(result1);

    // Increment & Decrement
    int m = 3;
    int n = 3;

    int d = ++n;
    int c = m++;

    System.out.println("Post-Increment Example");
    System.out.println(c);
    System.out.println("Pre-Increment Example");
    System.out.println(d);

    // Relational operator(&& AND , || OR, ! NOT)

    int r = 3;
    int t = 4;

    int u = 5;
    int o = 8;

    boolean result3 = r > t && u < o;
    System.out.println("Using AND operator : " + result3);

    boolean result4 = r > t || u < o;
    System.out.println("Using OR operator : " + result4);

    boolean result5 = r > t && u < o;
    System.out.println("Using NOT operator : " + !result5);

    // Conditional Statements(if...else)

    int c1 = 6;
    int c2 = 7;

    if (c1 > c2)
      System.out.println("C1 is Greater " + c1);
    else {
      System.out.println("C2 is Greater : " + c2);
      System.out.println("That is the Correct Answer"); // when you have more than two lines inside the block you need
                                                        // {} other wise not

    }

    // (if....else if Example)
    int x1 = 6;
    int x2 = 7;
    int x3 = 8;

    if (x1 > x2 && x1 > x3)
      System.out.println("X1 is Greatest Value among all : " + x1);

    else if (x2 > x3)
      System.out.println("X2 is Greatest Value among all : " + x2);
    else
      System.out.println("X3 is Greatest Value among all : " + x3);

    // Ternary Operator(?:)

    int b1 = 5;

    result = b1 % 2 == 0 ? 10 : 20;
    System.out.println("Ternary Operator example now result = " + result);

    // Swtich Statement (It is used for removing multiple if else block using simple
    // syntax .
    /*
     * One thing to remember if we will not use the break statement after every case
     * then
     * it will execute not only matched case but also the rest of the cases
     * as it doesn't check the value after getting the mached case)
     */

    int y1 = 2;

    switch (y1) {
      case 1:
        System.out.println("Today is Monday");
        break;
      case 2:
        System.out.println("Today is Tuesday");
        break;
      case 3:
        System.out.println("Today is Wednesday");
        break;
      case 4:
        System.out.println("Today is Thurday");
        break;
      case 5:
        System.out.println("Today is Friday");
        break;
      case 6:
        System.out.println("Today is Saturday");
        break;
      case 7:
        System.out.println("Today is Sunday");
        break;
      default:
        System.out.println("Enter valid input");

    }

    // Loops (This concept is used for doing one thing or operation multiple times)
    // 1.While loop && Nested while Loop

    int a1 = 1;

    while (a1 <= 2) {
      System.out.println("Hello : " + a1);

      int a2 = 1;
      while (a2 <= 2) {
        System.out.println("Vijay : " + a2);
        a2++;
      }
      a1++;

    }

    // Do...While Loop (This is similar While loop but it runs atleast one time even
    // if the condition is false)

    int a2 = 1;

    do {
      System.out.println("Hello Java  : " + a2);
      a2++;

    } while (a2 <= 2);

    // Nested For loop (It is kind of while but when you know how many iteration you
    // want in advance then it is used)

    int w1;

    for (w1 = 1; w1 < 8; w1++) {
      System.out.println("");
      int w2;
      for (w2 = 1; w2 < 25; w2++) {
        System.out.println("Hour : " + w2);
      }

    }

  }

}