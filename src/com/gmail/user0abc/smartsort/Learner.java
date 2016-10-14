package com.gmail.user0abc.smartsort;/* Created by iSzerg on 8/23/2015. */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Learner {
    public Learner(long startTime) {

    }

    public void start(String output) {
        if(!FolderChecker.verifyOutput(output)){
            throw new IOError(new FileNotFoundException("Output folder not found: "+output));
        }
        File outbox = new File(output);
        List<File> folders = new ArrayList<File>();
        for(File f: outbox.listFiles()){
            if(f.exists() && f.isDirectory()){
                folders.add(f);
                Main.printer.print(" found folder "+f.getAbsolutePath()+"\n");
            }
        }
        ExecutorService executorService = Executors.newFixedThreadPool(Main.MAX_THREADS);

    }
}
