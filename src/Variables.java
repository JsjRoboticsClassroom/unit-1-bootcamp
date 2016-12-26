/**
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
