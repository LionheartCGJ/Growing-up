package com.cgj.test.quartz;

import java.io.File;
import java.io.FileFilter;

/**
 * A FileFilter that only passes Files of the specified extension. Directories
 * do not pass the filter.
 */
public class FileExtensionFileFilter implements FileFilter {

    private String extension;

    public FileExtensionFileFilter(String extension) {
        this.extension = extension;
    }

    /*
     * Pass the File if it has the extension.
     */
    public boolean accept(File file) {
        // Lower case the filename for easier comparison
        String lCaseFilename = file.getName().toLowerCase();

        return (file.isFile() && (lCaseFilename.endsWith(extension))) ? true : false;
    }
}