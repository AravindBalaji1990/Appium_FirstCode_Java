package FileDemo;

import java.io.File;

public class FileHandlingDemo2 {

    public static void main(String[] args) {
        File file = new File("/Users/aravindbalaji/Documents/SeleniumDocuments");
        String[] fileList = file.list();
        for (int i = 0; i < fileList.length; i++) {
            System.out.println(fileList[i]);
        }
    }
}
