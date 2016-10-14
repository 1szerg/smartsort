package com.gmail.user0abc.smartsort;/* Created by iSzerg on 8/23/2015. */

import java.io.File;

class FolderChecker {
    static boolean verifyInput(String input) {
        File f = new File(input);
        return f.exists() && f.isDirectory();
    }

    public static boolean verifyOutput(String output) {
        return verifyInput(output);
    }
}
