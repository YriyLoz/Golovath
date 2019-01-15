package IQ;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class _2_ISTest_array {
    public static void main(String[] args) throws IOException {
        String fileName = "d:/txt.txt";
        InputStream inFile = null;
        try {
            inFile = new FileInputStream(fileName);
            readFullyByArray(inFile);
        } catch (IOException e) {
            throw new IOException(" Exception when open and read file " + fileName, e);
        } finally {
            closeQuietly(inFile);
        }


    }

    private static void readFullyByArray(InputStream inFile) throws IOException {
        byte[] buff = new byte[5];
        while (true) {
            int count;
            if ((count = inFile.read(buff)) != -1) {
                System.out.println("count = " + count + ", buff =" + Arrays.toString(buff) + ", str ="
                        + new String(buff, 0, count, "UTF8"));
            } else {
                break;
            }
        }

    }

    public static void closeQuietly(InputStream in) throws IOException {
        if (in != null) {
            in.close();
        }

    }
}
