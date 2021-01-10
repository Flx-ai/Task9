package vsu.cs.ru.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vsu.cs.ru.common.ListHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListHandlerTest {

    @Test
    void getFirstSortedList() {
        ListHandler listHandler = new ListHandler();
        List<Integer> firstList = new ArrayList<>(Arrays.asList(1, 3, 5, 6, 4, 8, -5, 2));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(2, 4, 6, 6, 8, 9));

        List<Integer> actualList = listHandler.getSortedList(firstList, secondList);
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 3, 5, -5));
        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void getSecondSortedList() {
        ListHandler listHandler = new ListHandler();
        List<Integer> firstList = new ArrayList<>(Arrays.asList(7, 4, 3, 2, 1, 9, 8));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(0, 7, 6, 3, 5, 1, 9, 6, 5));

        List<Integer> actualList = listHandler.getSortedList(firstList, secondList);
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(4, 2, 8));
        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void getThirdSortedList() {
        ListHandler listHandler = new ListHandler();
        List<Integer> firstList = new ArrayList<>(Arrays.asList(2, 5, 0, -7, 5, -1, 3));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(1, 8, 4, -8, 7, -5, 2));

        List<Integer> actualList = listHandler.getSortedList(firstList, secondList);
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(5, 0, -7, 5, -1, 3));
        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void getFourthSortedList() {
        ListHandler listHandler = new ListHandler();
        List<Integer> firstList = new ArrayList<>(Arrays.asList(-4, 3, 2, -9, 0, -1, 8));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(7, 8, 3, -5, 1, 9, 2));

        List<Integer> actualList = listHandler.getSortedList(firstList, secondList);
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(-4, -9, 0, -1));
        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void getFifthSortedList() {
        ListHandler listHandler = new ListHandler();
        List<Integer> firstList = new ArrayList<>(Arrays.asList(9, 6, 13, 7, 4, -9, 8));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(1, 0, 2, 7, 3, 9, 6));

        List<Integer> actualList = listHandler.getSortedList(firstList, secondList);
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(13, 4, -9, 8));
        Assertions.assertEquals(expectedList, actualList);
    }
}