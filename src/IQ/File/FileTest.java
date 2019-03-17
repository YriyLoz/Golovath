package IQ.File;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file =new File("C:/Users/yriyl/Pictures/image/kkkk.txt");
        System.out.println(file.exists());
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println(file.delete());
        System.out.println(file.exists());
    }
}
