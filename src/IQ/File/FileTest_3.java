package IQ.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileTest_3 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/yriyl/Pictures/image/kkkk1/");
        initDir(file);
        fileDir(file, "a.txt", "b.txt", "c.txt");
//        delete(file);
//        naiveDir(file);
    }

    private static void initDir(File file) throws IOException {
        if (!file.exists()) {
            if (!file.mkdir()) {
                throw new IOException("KKK");
            }
        }
    }

    private static void fileDir(File dir, String... fileNames) throws IOException {
        for (String fileName : fileNames) {
            if (!new File(dir, fileName).createNewFile()) {
                throw new IOException("KKK2");
            }
        }
    }

    private static void naiveDir(File file) throws IOException {
        if (!file.delete()) {
            throw new IOException("delete");
        }
    }

    private static void delete(File file) throws IOException {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                delete(file1);
            }
        }
        file.delete();
    }
}
