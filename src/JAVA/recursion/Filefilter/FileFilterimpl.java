package JAVA.recursion.Filefilter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterimpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()) {
            return true;
        }else{
            return pathname.getName().endsWith(".htm");
        }
    }
}
