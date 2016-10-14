package com.gmail.user0abc.smartsort;/* Created by iSzerg on 8/23/2015. */

import java.io.File;
import java.util.List;
import java.util.Set;

class FolderDictionary {
    File folder;
    List<File> files;
    Set<String> words;

    FolderDictionary(File folder) {
        this.folder = folder;
    }

    void setFiles(List<File> files) {
        this.files = files;
    }
}
