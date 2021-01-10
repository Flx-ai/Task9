package vsu.cs.ru.common;

import java.util.ArrayList;
import java.util.List;

public class ListHandler {

    public List<Integer> getSortedList(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < firstList.size(); i++) {
            if (!secondList.contains(firstList.get(i))) {
                sortedList.add(firstList.get(i));
            }
        }
        return sortedList;
    }
}
