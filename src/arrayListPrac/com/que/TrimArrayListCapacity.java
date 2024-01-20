package arrayListPrac.com.que;

import java.util.ArrayList;

public class TrimArrayListCapacity {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        ArrayList<Integer> trimmedList = new ArrayList<>(myList);

        System.out.println("Original ArrayList: " + myList);
        System.out.println("Trimmed ArrayList: " + trimmedList);
    }
}
