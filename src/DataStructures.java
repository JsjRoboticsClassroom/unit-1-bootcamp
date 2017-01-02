import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import com.sun.tools.hat.internal.util.ArraySorter;

import java.lang.reflect.Array;
import java.util.*;


public class DataStructures {

    public static void main(String args[]) {

        //Q1-A1 : Cool Cats Pt. II

        List<Cat> catList = Arrays.asList(
                new Cat("garfield"),
                new Cat("catWoman"),
                new Cat("pinkPanther"),
                new Cat("toby"),
                new Cat("grumpy")
        );
        for (int i = 0; i < catList.size(); i++) {
            System.out.println(catList.get(i).getName());
        }

        //A2 Most Frequent Element
        ArrayList<Integer> myNumList = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 2, 3, 0, 0, 0, 0));
        mostFrequentElement(myNumList);

        //Q3-A3 Pod HashMap
        Map<String, Integer> myPod = new HashMap<String, Integer>();
        myPod.put("Mel", 31);
        myPod.put("Shannon", 28);
        myPod.put("Shawn", 25);
        myPod.put("Ashique", 20);

        for (String key : myPod.keySet()) {
            System.out.println(key + "=" + myPod.get(key));
        }

        //A4 canRentACar
        System.out.println(canRentACar(myPod));

        //A5 wordsWithoutList
        String[] strArr1 = {"a", "bb", "b", "ccc"};
        String[] strArr2 = {"a", "bb", "b", "ccc"};
        String[] strArr3 = {"a", "bb", "b", "ccc"};

        System.out.println(wordsWithoutList(strArr1, 1)); // {"bb", "ccc"}
        System.out.println(wordsWithoutList(strArr2, 3)); // {"a", "bb", "b"}
        System.out.println(wordsWithoutList(strArr3, 4)); //{"a", "bb", "b", "ccc"}

        //A7 Sorting Sentence
        sortingSentence("Hello, are you there");
        sortingSentence("Bye bye Linda");


    }

    //Q2 : Most Frequent Element
    public static void mostFrequentElement(ArrayList<Integer> myList) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < myList.size(); i++) {

            if (!(hm.containsKey(myList.get(i)))) {
                hm.put(myList.get(i), 1);

            } else {
                hm.put(myList.get(i), (Integer.valueOf(hm.get(myList.get(i)) + 1)));

            }
        }
        System.out.println(hm);
    }

    //Q4. canRentACar
    public static boolean canRentACar(Map<String, Integer> myPod) {
        for (String key : myPod.keySet()) {
            if (myPod.get(key) >= 25) {
                return true;
            }
        }
        return false;
    }

    //Q5. wordsWithoutList
    public static List<String> wordsWithoutList(String[] strArr, int givenLength) {
        List<String> returnList = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            if (!(strArr[i].length() == givenLength)) {
                returnList.add(strArr[i]);
            }
        }
        return returnList;
    }

    //Q7. Sorting sentences
    public static void sortingSentence(String sentence) {
        List<String> wordList = Arrays.asList(sentence.split(" "));

        if (wordList.size() > 1) {
            wordList.sort(String::compareToIgnoreCase);

            for (String words : wordList) {
                System.out.println(words);
            }
        }
    }

}

