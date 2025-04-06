import java.util.Collections;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        // there is no need to input data from the command line
        // instead, use arguments elem, list1 and list2
        int elemOccurences1 = 0, elemOccurences2 = 0;

        for (Integer i : list1) {

            if (elem == i) elemOccurences1++;

        }
        for (Integer i : list2) {

            if (elem == i) elemOccurences2++;
        }

        return elemOccurences1 == elemOccurences2;


    }
}