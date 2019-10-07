package br.usp.ime.maratona.util;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Thiago Nascimento <nascimenthiago@gmail.com>
 */
public class FileHelper {
    
    private final File folder;
    
    public FileHelper(String dir) {
        this.folder = new File(dir);
    }
    
    public List<File> getFiles() {
        return Arrays.asList(this.folder.listFiles());
    }
    
    public void showFiles() {
        Arrays.asList(this.folder.listFiles())
                .forEach(f -> {
                    if (f.isFile())
                        System.out.println(f.getName());
                });
    }
    
}
