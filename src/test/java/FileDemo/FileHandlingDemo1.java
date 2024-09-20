package FileDemo;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo1 {
    public static void main(String[] args) throws IOException {
        File fs = new File( System.getProperty("user.dir")+"/output.txt");
        System.out.println(fs.getAbsolutePath());
        System.out.println(fs.getPath());
        System.out.println(fs.getCanonicalPath());
    }
}
