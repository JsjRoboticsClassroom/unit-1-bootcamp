/**
 * Created by alexandraqin on 4/14/15.
 * 1_ Write a program that creates three variables: an int, a double, and a String.
 *    Put the value 113 into the first variable, the value 2.71828 into the second,
 *    and the value "Computer Science" into the third. It does not matter what you call the variables... this time.
 *    Then, display the values of these three variables on the screen, one per line.
 *
 * 2_ Consider a method isOdd. What type should it return? What type(s) should it take in?
 *    Create the method signature.
 *
 * 3_ Consider a method printHelloWorld. What type should it return? What type(s) should it take in?
 *    Create the method signature.
 *
 * 4_ Consider a method greatestCommonFactor. What type should it return? What type(s) should it take in?
 *    Create the method signature.
 */
public class Variables {

  public static void main (String args[]) {

    //Solution 1
    int i = 113;
    double d = 2.71828;
    String s = "Computer Science";

    System.out.println("This is room # "+i);
    System.out.println("e is close to "+d);
    System.out.println("I am learning a bit about "+s);
  }

  //Solution2 : It returns boolean trype (True or False) and takes numeric types; integer , double or long
  public boolean isOdd(int number){
    return true;
  }
  //Solution3 : It void type method means doesn't return anything, and takes String type argument.
  public void printHelloWorld( String helloWorld){}

  //Solution4 : Return integer ( or double and long) type value, and takes integer(or double or long) type arguments.
  public int greatestCommonFactor(int num1, int num2 , int gcf){
    return gcf;
  }


}
