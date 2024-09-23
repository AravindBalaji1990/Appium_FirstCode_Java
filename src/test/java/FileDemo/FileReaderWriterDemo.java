package FileDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
    public static void main(String[] args) throws IOException {
//        fileReaderDemo();
        fileWriterDemo();
    }


    public static void fileReaderDemo() throws FileNotFoundException {
        try(FileReader fr = new FileReader(System.getProperty("user.dir")+"/src/test/resources/testfiles/output.txt")){
            int character;
            while((character = fr.read())!=-1){
                System.out.println((char)character);
            }

            fr.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fileWriterDemo() throws IOException {
        try(FileWriter fw = new FileWriter(System.getProperty("user.dir")+"/src/test/resources/testfiles/outputdemo.txt")){
            fw.write("hello this is a write from fielwriter");

            fw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
