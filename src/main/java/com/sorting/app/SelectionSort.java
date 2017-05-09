package com.sorting.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(new Scanner(System.in).nextLine());

        while (scanner.hasNextInt())
            list.add(scanner.nextInt());

        int[] array = Arrays.stream(list.toArray()).mapToInt(i -> ((Integer) i).intValue()).toArray();

        //selection sort
        sort(array);

        Arrays.stream(array).forEach(value -> System.out.print(value + " "));
    }
    
    public static void sort(int[] array){
        if (array.length > 0) {
            int temp;
            for (int j = 0; j < array.length - 1; j++) {
                for (int i = j + 1; i < array.length; i++) {
                    if (array[j] > array[i]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
    }
}
