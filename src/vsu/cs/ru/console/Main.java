package vsu.cs.ru.console;

import vsu.cs.ru.common.ListHandler;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        InputArgs inputParams = new InputArgs(args[0], args[1]);
        ListHandler listHandler = new ListHandler();

        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        readListFromFile(firstList, secondList, inputParams);

        List<Integer> sortedList = listHandler.getSortedList(firstList, secondList);
        writeListToFile(sortedList, inputParams);
    }

    private static void readListFromFile(List<Integer> firstList, List<Integer> secondList, InputArgs inputParams) {
        File file = new File(inputParams.getInputFile());
        try {
            Scanner fileScanner = new Scanner(file);
            Scanner lineScanner = new Scanner(fileScanner.nextLine());
            while (lineScanner.hasNextInt()) {
                firstList.add(lineScanner.nextInt());
            }
            lineScanner = new Scanner(fileScanner.nextLine());
            while (lineScanner.hasNextInt()) {
                secondList.add(lineScanner.nextInt());
            }
            fileScanner.close();
        } catch (FileNotFoundException exception) {
            System.out.println("File not found!");
        }
    }

    private static void writeListToFile(List<Integer> sortedList, InputArgs inputParams) throws IOException {
        FileWriter writer = new FileWriter(inputParams.getOutputFile());
        writer.write(String.valueOf(sortedList));
        writer.close();
    }
}


