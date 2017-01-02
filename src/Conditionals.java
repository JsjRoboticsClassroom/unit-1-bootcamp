import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.SortedMap;


public class Conditionals {

    public static void main(String args[]) {
        //A1
        System.out.println(isOdd(5));

        //A2
        System.out.println(isMultipleOfThree(9));

        //A3
        System.out.println(isOddAndIsMultipleOfThree(9));
        System.out.println(isOddAndIsMultipleOfThree(18));

        //A4
        System.out.println(isOddAndIsMultipleOfThree2(4));
        System.out.println(isOddAndIsMultipleOfThree2(9));
        System.out.println(isOddAndIsMultipleOfThree2(18));

        //A5
        fizzMultipleofThree(2);
        fizzMultipleofThree(6);

        //Person.java Answer 1 and 2
        Person p1 = new Person();
        p1.setName("George Micheal");
        p1.setCity("London");

        System.out.println(isPersonBritish(p1));
        personNameLength(p1);

        //Cigar Party
        System.out.println(isSuccessfulParty(39, true));//false
        System.out.println(isSuccessfulParty(40, true));//true
        System.out.println(isSuccessfulParty(150, false));//false
        System.out.println(isSuccessfulParty(41, false));//true

        // Caught Speeding
        System.out.println(coughtSpeeding(60, false)); //0
        System.out.println(coughtSpeeding(65, false)); //1
        System.out.println(coughtSpeeding(65, true));//0

        // Alarm Clock
        System.out.println(alarmClock(1, false));//"7:00"
        System.out.println(alarmClock(5, false));//"7:00"
        System.out.println(alarmClock(0, false));//10:00"

        //Lottery Ticket
        System.out.println(lotteryTicket(10, 20, 30));// 0
        System.out.println(lotteryTicket(10, 10, 10));// 20
        System.out.println(lotteryTicket(10, 10, 30));// 10
        System.out.println(lotteryTicket(10, 20, 10));// 10
        System.out.println(lotteryTicket(10, 20, 20));// 10

        // Black Jack
        System.out.println(blackJack(19, 21));//21
        System.out.println(blackJack(21, 19)); //21
        System.out.println(blackJack(19, 22)); //19
        System.out.println(blackJack(22, 34)); //0
        System.out.println(blackJack(-1, 7)); //error

        // Evenly Spaced
        System.out.println(evenlySpaced(2, 4, 6)); //true
        System.out.println(evenlySpaced(4, 6, 2)); //true
        System.out.println(evenlySpaced(4, 6, 3)); //false
    }


    //Q1
    public static boolean isOdd(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    //Q2
    public static boolean isMultipleOfThree(int n) {
        if (n % 3 == 0) {
            return true;
        }
        return false;
    }

    //Q3
    public static boolean isOddAndIsMultipleOfThree(int n) {
        if (isOdd(n) && isMultipleOfThree(n)) {
            return true;
        }
        return false;
    }

    //Q4

    public static boolean isOddAndIsMultipleOfThree2(int n) {
        if (n % 6 == 0) {
            return true;
        }
        return false;
    }

    //Q5
    public static void fizzMultipleofThree(int n) {
        if (n % 3 != 0) {
            System.out.println(n);
        } else {
            System.out.println("Fizz");
        }
    }

    //Person. java Q1
    public static boolean isPersonBritish(Person person) {
        if (person.getCity() == "London") {
            return true;
        }
        return false;
    }

    //Person. java Q2

    public static void personNameLength(Person person) {
        if ((person.getName().length()) > 5) {
            System.out.println(person.getName());
        } else {
            System.out.println("Name is too short");
        }
    }

    //Cigar party
    public static boolean isSuccessfulParty(int cigarNumber, boolean isWeekend) {
        while (isWeekend) {
            if (cigarNumber >= 40) {
                return true;
            }
            return false;
        }
        if (cigarNumber >= 40 && cigarNumber <= 60) {
            return true;
        }
        return false;
    }

    //Caught Speeding
    public static int coughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            return caughtSpeedingHelper(speed, 5);
        } else {
            return caughtSpeedingHelper(speed, 0);
        }
    }

    //Caught Speeding - Helper Method
    private static int caughtSpeedingHelper(int speed, int extraSpeed) {
        int result;
        if (speed <= (60 + extraSpeed)) {
            result = 0;
        } else if (speed >= (61 + extraSpeed) && speed <= (80 + extraSpeed)) {
            result = 1;
        } else {
            result = 2;
        }
        return result;
    }

    public static String alarmClock(int day, boolean inVacation) {
        if (!(inVacation)) {
            if (!(isWeekend(day))) {
                return "7:00";
            } else {
                return "10:00";
            }
        } else {
            if (!(isWeekend(day))) {
                return "10:00";
            } else {
                return "off";
            }
        }
    }

    //Alarm Clock Helper method
    private static boolean isWeekend(int day) {
        if (day == 0 || day == 6) {
            return true;
        }
        return false;
    }

    //Lottery Ticket
    public static int lotteryTicket(int a, int b, int c) {
        int[] inputNums = {a, b, c};
        Arrays.sort(inputNums);

        if (inputNums[0] == inputNums[1] && inputNums[0] == inputNums[2]) {
            return 20;
        } else if (inputNums[0] < inputNums[1] && inputNums[1] < inputNums[2]) {
            return 0;

        } else if (inputNums[0] == inputNums[1] || inputNums[0] == inputNums[2] || inputNums[1] == inputNums[2]) {
            return 10;
        }
        return -1;

    }

    //Black Jack
    public static int blackJack(int num1, int num2) {
        if (num1 > 0 && num2 > 0) {
            if (num1 > 21 && num2 > 21) {
                return 0;

            } else if (difference(num1) < difference(num2) || num2 > 21) {
                return num1;

            } else if (difference(num2) < difference(num1) || num1 > 21) {
                return num2;

            } else {
                return 0;
            }
        }
        System.out.print("Error : Inputs should be greater than zero. ");
        return -1;

    }

    //Black Jack Helper
    private static int difference(int num) {
        int difference;
        if (num <= 21) {
            difference = 21 - num;
        } else {
            difference = 21;
        }
        return difference;
    }

    // Evenly Spaced
    public static boolean evenlySpaced(int num1, int num2, int num3) {
        int[] inputs = {num1, num2, num3};
        Arrays.sort(inputs);
        if ((inputs[1] - inputs[0]) == (inputs[2] - inputs[1])) {
            return true;
        } else {
            return false;
        }
    }
}

