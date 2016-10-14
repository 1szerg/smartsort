package com.gmail.user0abc.smartsort;

import java.util.Date;

/**
 * Created by Sergey
 * at 7/31/14 3:50 PM
 */
public class Main {
    public static final int MAX_THREADS = 10;
    private RunModes command;
    private String input, output;
    public static Printer printer = new StdOutPrinter();

    public static void main(String[] args) {
        printer.print("Smart sort by Sergii Ivanov 2006(v1)-2014(reborn) Java port\n");
        new Main().run(args);
    }

    private void run(String[] args) {
        if (!parseArgs(args)) {
            printer.print("Usage:\nsmartsort -sort|learn [-input=<input_path>] [-output=<output_path>]");
            return;
        }
        switch (command) {
            case LEARN:
                printer.print("Learning output folder " + output + "\n");
                new Learner(new Date().getTime()).start(output);
                break;
            case SORT:
                printer.print("Sorting files from " + input + " to " + output + "\n");
                new Sorter(new Date().getTime()).start(input, output);
                break;
            default:
                Main.printer.print("Command not implemented " + command);
        }
    }

    private boolean parseArgs(String[] args) {
        for (String param : args) {
            if (param.startsWith("-sort")) command = RunModes.SORT;
            else if (param.startsWith("-learn")) command = RunModes.LEARN;
            else if (param.startsWith("-input=")) input = param.replace("-input=", "");
            else if (param.startsWith("-output=")) output = param.replace("-output=", "");
            else return false;
        }
        return command != null;
    }

}
