package FileDemo;

import java.io.*;

public class BufferReaderWriterDemo {

    public static void main(String[] args) throws IOException {
//        demoBufferReader();
//        demoBufferereaderBufferSize();
        demoBufferWriter();
    }

    public static void demoBufferReader() throws FileNotFoundException {
        try(BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/test/resources/testfiles/output.txt"))){
            String line ;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void demoBufferWriter() throws FileNotFoundException {
        try(BufferedWriter writerdemo = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/test/resources/testfiles/outputWriterDemo.txt"))){
           writerdemo.write("this is the writer demo check");
           writerdemo.write("data to append");
           writerdemo.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void demoBufferereaderBufferSize() throws IOException {
        int buffersize = 8*1024;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/test/resources/testfiles/output.txt"),buffersize);
        String line ;
        while((line= bufferedReader.readLine()) != null) {
            //do something with line

            //line = bufferedReader.readLine();
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
