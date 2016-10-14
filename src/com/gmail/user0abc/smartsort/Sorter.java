package com.gmail.user0abc.smartsort;/* Created by iSzerg on 8/23/2015. */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sorter {
    public Sorter(long startTime) {

    }

    public void start(String input, String output) {
        if(!FolderChecker.verifyInput(input)) {
            throw new IOError(new FileNotFoundException("Input folder not found: "+input));
        }
        if(!FolderChecker.verifyOutput(output)){
            throw new IOError(new FileNotFoundException("Output folder not found: "+output));
        }
        File inbox = new File(input);
        List<File> files = new ArrayList<File>();
        for(File f: inbox.listFiles()){
            if(f.exists() && !f.isDirectory()){
                files.add(f);
                Main.printer.print(" added "+f.getAbsolutePath()+"\n");
            }
        }
        ExecutorService executorService = Executors.newFixedThreadPool(Main.MAX_THREADS);

    }
}
