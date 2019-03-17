package IQ.File;

import java.io.File;

public class FileLab_LookFor_question {
    public static void main(String[] args) {
        File file = new File("C:/Users/yriyl/Pictures/image");
        print(file);

    }

    public static void print(File root) {
        if (root.isFile()) {
            System.out.print(root);
        } else {
            File[] fileArray =  root.listFiles();

            for (File file1 : fileArray) {
                System.out.println();
                print(file1);
            }
        }
    }
}
