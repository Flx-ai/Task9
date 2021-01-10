package vsu.cs.ru.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerButtonRemove implements ActionListener {
    private JTextField fieldFirstList;
    private JTextField fieldSecondList;
    private JTextField fieldSortedList;
    private JLabel auxiliaryLabel;

    public ListenerButtonRemove(JTextField fieldFirstList, JTextField fieldSecondList, JTextField fieldSortedList, JLabel auxiliaryLabel) {
        this.fieldFirstList = fieldFirstList;
        this.fieldSecondList = fieldSecondList;
        this.fieldSortedList = fieldSortedList;
        this.auxiliaryLabel = auxiliaryLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        fieldFirstList.setText("");
        fieldSecondList.setText("");
        fieldSortedList.setText("");
        auxiliaryLabel.setText("");
    }
}
