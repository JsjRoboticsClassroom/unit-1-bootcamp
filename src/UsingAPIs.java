import java.util.HashSet;
import java.util.Set;

/**
 * Create an iterator for the union set.
 * For fun - try this again but with two books from the same author!
 */
public class UsingAPIs {

    public static void main(String args[]) {

        //A1
        Set<String> mySet1A = new HashSet<>();
        Set<String> mySet1B = new HashSet<>();

        //A2
        String myString1A = "A Tale of Two Cities";
        String myString1B = "Moby Dick";
        System.out.println("There are " + numberOfUniqueWords(myString1A, mySet1A) + " unique words in the HashSet");//5
        System.out.println("There are " + numberOfUniqueWords(myString1B, mySet1B) + " unique words in the HashSet");//2

        //A3
        String myString2 = "A a a. Tale tale TALE two. two Two citiES? .ci;ties ";
        Set<String> mySet2 = new HashSet<>();
        System.out.println("there are " + numberOfUniqueWords(myString2, mySet2) + " unique words in the HashSet");//5

        //A4 Intersection
        Set<String> set1 = new HashSet<>(); //A Tale of Two Cities
        set1.add("A");
        set1.add("Tale");
        set1.add("of");
        set1.add("Two");
        set1.add("Cities");

        Set<String> set2 = new HashSet<>();//Moby Dick
        set2.add("Moby");
        set2.add("Dick");

        Set<String> intersaction = new HashSet<>(set1);//Because i want to keep set1 as it is.
        intersaction.retainAll(set2);
        System.out.println("Size of Intersaction is "+ intersaction.size()); //0, No common element between 2 sets

        //A5 Union
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of "+ set1 +" and "+ set2+" is "+ union);

        //A6
        for(String word: union){
            System.out.println(word);
        }



    }
    public static int numberOfUniqueWords(String myStr, Set<String> mySet) {
        String[] myStrArray = myStr.split(" ");

        for (String word : myStrArray) {
            if (!(word.equals(""))) {
                mySet.add(word.toLowerCase().replaceAll("[-+.^:,]", ""));// Converts the letters of the word to lower case and clean all the punctuations
            }
        }
        return mySet.size();
    }




}
