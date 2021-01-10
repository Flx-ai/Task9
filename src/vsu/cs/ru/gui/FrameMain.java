package vsu.cs.ru.gui;

import vsu.cs.ru.listeners.ListenerButtonExecute;
import vsu.cs.ru.listeners.ListenerButtonRemove;
import vsu.cs.ru.listeners.ListenerButtonWriteToFile;
import javax.swing.*;

public class FrameMain extends JFrame {
    private JPanel panelMain;
    private JTextField fieldFirstList;
    private JTextField fieldSecondList;
    private JTextField fieldSortedList;
    private JButton buttonExecute;
    private JButton buttonRemove;
    private JButton buttonWriteToFile;
    private JLabel auxiliaryLabel;

    public FrameMain() {
        setTitle("Program");
        setContentPane(panelMain);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 500, 400, 190);
        setResizable(true);

        buttonExecute.addActionListener(new ListenerButtonExecute(fieldFirstList, fieldSecondList, fieldSortedList, auxiliaryLabel));
        buttonRemove.addActionListener(new ListenerButtonRemove(fieldFirstList, fieldSecondList, fieldSortedList, auxiliaryLabel));
        buttonWriteToFile.addActionListener(new ListenerButtonWriteToFile(fieldSortedList));
    }
}


