package json_file_manipulation;

import java.io.FileWriter;
import java.io.IOException;

public class file_write {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("./src/main/resources/test.txt",true);
        fw.write("Hello World");
        fw.write("\n");
        fw.write("Hello Earth");
        fw.close();

    }
}
