import java.util.*;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

    public static void main(String args[]) {
        //A1
        printNumbers();

        //A2
        printNumbers2();

        //A3
        printNumbersOneToN(5);

        //A4
        printEvenNums(10);

        //A5
        sumOfTenNumbers();

        //A6
        sumOfNNumbers(10);

        //A7
        sumOfNNumbers(1000);

        //A8
        printString(5, "*");

        //A9
        printConcatenatedString(5, "!");

        //A10
        firstTenFibonacci();

        //A11
        sumOfTenFibonacci();

        //A12
        sumOfNNumbers(1);
        sumOfNFibonacci(15);

        //sumNumbers
        System.out.println(sumNumbers("abc123xyz")); //123
        System.out.println(sumNumbers("aa11b33")); // 44
        System.out.println(sumNumbers("7 11")); // 18

        //isNot
        System.out.println(isNot("is test")); // "is not test"
        System.out.println(isNot("is-is")); // "is not-is not"
        System.out.println(isNot("This is right")); // "This is not right

        //Number Puzzle
        System.out.println(numberPuzzle());

        //PositiveNums
        positiveNums();
    }

    //Q1
    public static void printNumbers() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    //Q2
    public static void printNumbers2() {
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
    }

    //Q3
    public static void printNumbersOneToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    //Q4
    public static void printEvenNums(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    //Q5
    public static void sumOfTenNumbers() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);

    }

    //Q6
    public static void sumOfNNumbers(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);

    }

    //Q7 : See A7 above

    //Q8
    public static void printString(int n, String s) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(s + " ");
            }
        } else {
            System.out.println(" ");
        }
        System.out.println("\n");
    }

    //Q9
    public static void printConcatenatedString(int n, String s) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                s += s;
            }
        } else {
            System.out.println(" ");
        }
        System.out.println(s);
    }

    //Q10
    public static void firstTenFibonacci() {
        List<Integer> fibNumbers = new ArrayList<>(Arrays.asList(0, 1));
        for (int i = 2; i < 10; i++) {
            fibNumbers.add(i, (fibNumbers.get(i - 1) + fibNumbers.get(i - 2)));
        }
        System.out.println(fibNumbers);
    }

    //Q11
    public static void sumOfTenFibonacci() {
        List<Integer> fibNumbers = new ArrayList<>(Arrays.asList(0, 1));
        int sum = 1; // sum of 2 existence elements in  the array
        for (int i = 2; i < 10; i++) {
            fibNumbers.add(i, (fibNumbers.get(i - 1) + fibNumbers.get(i - 2)));
            sum += fibNumbers.get(i);
        }
        System.out.println(sum);

    }

    //Q12
    public static void sumOfNFibonacci(int n) {
        if (n < 2) {
            System.out.println(n);
        } else {
            List<Integer> fibNumbers = new ArrayList<>(Arrays.asList(0, 1));
            int sum = 1;
            for (int i = 2; i < n; i++) {
                fibNumbers.add(i, (fibNumbers.get(i - 1) + fibNumbers.get(i - 2)));
                sum += fibNumbers.get(i);
            }
            System.out.println(sum);
        }

    }


    /* Sum Numbers : Given a string, return the sum of the numbers appearing in the string,
     * ignoring all other characters. A number is a series of 1 or more digit chars in a row.
     */

    //sumNumbers
    public static int sumNumbers(String s) {
        int sum = 0;
        s = (s.replaceAll("\\D+", " ")).trim(); // replace all non-digit chars (\\D+) with " ".
        String[] myNums = s.split(" ");
        for (int i = 0; i < myNums.length; i++) {
            if (myNums[i].equals("")) {
                i++;
            } else {
                sum += Integer.parseInt(myNums[i]);
            }
        }
        return sum;
    }


    /* Is Not: Given a string, return a string where every appearance of the lowercase word "is" has been
     * replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter --
     * so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
     */

    // isNot
    public static String isNot(String s) {
        s = s.replaceAll("\\bis\\b", "is not");
        return s;
    }


    /* Number Puzzle: Use nested for loops to generate a list of all the pairs of positive two digit numbers
     * whose sum is 60, and whose difference is 14.
     */

    // number puzzle
    public static List<Map> numberPuzzle() {
        Map hm = new HashMap();
        List<Map> hmList = new ArrayList<>();
        for (int i = 10; i < 50; i++) {
            for (int j = 50; j > 10; j--) {
                if ((i + j == 60 || j + i == 60) && (i - j == 14 || j - i == 14)) {
                    hm.put(i, j);
                }
            }
        }
        hmList.add(hm);
        return hmList;
    }


    /* Positive Numbers : generate a list of all the positive two digit numbers.
     * Display the numbers, and the sums of their digits.
     */

    // positive Numbers
    public static void positiveNums() {
        for (int i = 10; i < 100; i++) {
            System.out.println(i + ", " + (i / 10) + " + " + (i % 10) + " = " + ((i / 10) + (i % 10)));
        }
    }
}
