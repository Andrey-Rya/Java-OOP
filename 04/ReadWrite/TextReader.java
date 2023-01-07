package ReadWrite;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextReader<T> {
    public void textReader(T object) {
        try (FileReader reader = new FileReader("base.txt")) {

            char[] chars = new char[reader.read()];
            reader.read(chars);

            String sum = "i";

            for (int i = 0; i < chars.length; i++) {

                sum += chars[i];

            }

            sum = ("- "+sum).trim();


            System.out.println(sum);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
