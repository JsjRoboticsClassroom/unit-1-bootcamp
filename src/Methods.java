import java.util.Random;

/**
 */
public class Methods {
    public static void main(String args[]) {

        //ans1
        System.out.println(calculateSquare(2));

        //ans2
        System.out.println(calculateSquareRoot(4));

        //ans3
        System.out.println(toLowerCase("Hello, World!"));

        //ans4
        System.out.println(isMultiple(5,101));

        //ans5
        prettyInteger(4);

        //ans6
        System.out.println(random(1,100));




    }

    //question 1
    public static int calculateSquare(int edgeLength) {
        return edgeLength * edgeLength;
    }

    //question2
    public static int calculateSquareRoot(int number) {
        return number * number;
    }

    //question3
    public static String toLowerCase(String myString) {
        return myString.toLowerCase();

    }

    //question 4
    public static boolean isMultiple(int num1, int num2) {
        if(num2>num1) {
            if (num2 % num1 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    //question5

    public static void prettyInteger( int myInt){
        String stars =" ";
        for(int i = 0; i<myInt; i++){
           stars += "*";
        }
        System.out.println(stars+" "+myInt+stars);
    }

    //question6

    public static int random (int minValue, int maxValue){
        Random rand = new Random();
        if (!(maxValue > minValue)){
            int temp = maxValue;
            maxValue =minValue;
            minValue =temp;
        }
        return (rand.nextInt(maxValue - minValue +1) + minValue);
    }

}









