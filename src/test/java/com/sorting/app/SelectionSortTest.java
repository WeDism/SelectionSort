package com.sorting.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by WeDin on 28.04.2017.
 */
public class SelectionSortTest {
    int[] array;

    @Before
    public void setUp() throws Exception {
        array = new int[]{1, 53, 4, 3, 41, 56, 45, 68, 15, 46, 64, 5, 6, 8, 51, 33, 54};
    }

    @Test
    public void sort() throws Exception {
        SelectionSort.sort(array);
        Assert.assertArrayEquals(String.format("Arrays not equals:\n expected array - %s,\n result array - %s",
                Arrays.toString(new int[]{1, 3, 4, 5, 6, 8, 15, 33, 41, 45, 46, 51, 53, 54, 56, 64, 68}), Arrays.toString(array)),
                new int[]{1, 3, 4, 5, 6, 8, 15, 33, 41, 45, 46, 51, 53, 54, 56, 64, 68}, array);
    }

}