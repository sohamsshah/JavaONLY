// Here, we will introduce functional programming using a few Interfaces.

// This is where the main interfaces sit.

import java.util.function.*;
import java.util.ArrayList;
import java.util.List;

public class FunctionalProgramming {
    public static void main(String[] args) {
        // Creating a dynamic array using the array list.
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(3);
        array.add(2);
        array.add(5);
        array.add(9);
        array.add(3);
        array.add(7);
        array.add(4);
        array.add(10);

        // Here we pass the original array list to the function and it returns back all the even elements.
        ArrayList<Integer> filteredList = filter(array, e -> e % 2 == 0);
    }

    // The second parameter of the function is of type java.util.function.Predicate<Integer>
    // This will accept an Integer as paramter to a function called boolean test(Integer t)
    // of return type boolean.
    private ArrayList<Integer> filter(ArrayList arrayList, Predicate<Integer> predicate) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            int element = arrayList.get(i);
            if (predicate.test(element)) // Check if predicate is true.
                newList.add(element);
        }
        return newList;
    }
}
/*
In the background, this is how the predicate function will look like.

public class PredicateImpl implements Predicate<Integer> { // PredicateImpl is a random class name which is assigned for simplicity
    public boolean test(Integer e) {
        return e % 2 == 0;
    }
}

Predicate<Integer> functionalObj = new PredicateImpl();
filter(array, functionalObj);

This entire work has been shortened by Java using the concepts of Functional Programming.
Check out the java.util.function package in https://docs.oracle.com/javase/8/docs/api/index.html to see all the different
functional programming interfaces.
 */