package IQ;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class _1_ISTest_close_short {
    public static void main(String[] args) throws IOException {

        String fileName = "d:/txt.txt";
        InputStream inFile = null;
        try {
            inFile = new FileInputStream(fileName);
            readFullyByByte(inFile);

        } catch (IOException e) {
            throw new IOException(" Exception when open and read file " + fileName, e);

        } finally {
            closeQuietly(inFile);
        }
    }

    public static void readFullyByByte(InputStream in) throws IOException {
        int oneByte;
        while ((oneByte = in.read()) != -1) {
            System.out.print((char) oneByte);

        }
    }

    public static void closeQuietly(InputStream in) {
        if (in != null) {
            try {
                in.close();
            } catch (IOException ignore) {

            }
        }
    }
}
