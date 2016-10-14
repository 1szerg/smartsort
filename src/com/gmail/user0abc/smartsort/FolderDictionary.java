package com.gmail.user0abc.smartsort;/* Created by iSzerg on 8/23/2015. */

import java.io.File;
import java.util.List;
import java.util.Set;

public class FolderDictionary {
    File folder;
    List<File> files;
    Set<String> words;

    public FolderDictionary(File folder) {
        this.folder = folder;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
