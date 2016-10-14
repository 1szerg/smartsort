package com.gmail.user0abc.smartsort;

import java.io.File;
import java.util.Set;

/**
 * Created by Sergey
 * at 8/4/14 12:40 PM
 */
public interface FileReader {
    Set<String> readFile(File file);
}
