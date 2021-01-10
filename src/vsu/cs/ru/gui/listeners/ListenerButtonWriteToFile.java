package vsu.cs.ru.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ListenerButtonWriteToFile implements ActionListener {
    private JTextField fieldSortedList;

    public ListenerButtonWriteToFile (JTextField fieldSortedList) {
        this.fieldSortedList = fieldSortedList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sortedListText = fieldSortedList.getText();
        try (PrintWriter out = new PrintWriter("src/vsu/cs/ru/output(2).txt")) {
            out.println((sortedListText));
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}

