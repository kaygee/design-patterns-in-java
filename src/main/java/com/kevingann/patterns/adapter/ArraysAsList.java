package com.kevingann.patterns.adapter;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

    public static void main(String[] args) {

        Integer[] arrayOfIntegers = new Integer[]{42, 43, 44};

        // asList is an adapter to convert an array to a List.
        // Returns the correct object type.
        List<Integer> listOfIntegers = Arrays.asList(arrayOfIntegers);

        System.out.println(arrayOfIntegers);

        System.out.println(listOfIntegers);
    }

}
