package vsu.cs.ru.listeners;

import vsu.cs.ru.util.ArrayUtils;
import vsu.cs.ru.common.ListHandler;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListenerButtonExecute implements ActionListener {
    private JTextField fieldFirstList;
    private JTextField fieldSecondList;
    private JTextField fieldSortedList;
    private JLabel auxiliaryLabel;

    public ListenerButtonExecute(JTextField fieldFirstList, JTextField fieldSecondList, JTextField fieldSortedList, JLabel auxiliaryLabel) {
        this.fieldFirstList = fieldFirstList;
        this.fieldSecondList = fieldSecondList;
        this.fieldSortedList = fieldSortedList;
        this.auxiliaryLabel = auxiliaryLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ListHandler listHandler = new ListHandler();
        String firstSequence = fieldFirstList.getText();
        int[] firstArrayOfIntegers = ArrayUtils.toIntArray(firstSequence);
        List<Integer> firstList = Arrays.stream(firstArrayOfIntegers).boxed().collect(Collectors.toList());

        String secondSequence = fieldSecondList.getText();
        int[] secondArrayOfIntegers = ArrayUtils.toIntArray(secondSequence );
        List<Integer> secondList = Arrays.stream(secondArrayOfIntegers).boxed().collect(Collectors.toList());

        List<Integer> sortedList = listHandler.getSortedList(firstList, secondList);
        fieldSortedList.setText(String.valueOf((sortedList)));
        if (sortedList.isEmpty()) {
            auxiliaryLabel.setText("All elements of the first list are present in the second list.");
        }
    }
}


