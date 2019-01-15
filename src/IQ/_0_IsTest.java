package IQ;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class _0_IsTest {
    public static void main(String[] args) throws IOException {
        InputStream inFile = new FileInputStream("d:/txt.txt");
        readFullyByByte(inFile);
        System.out.println("\n\n\n");

        InputStream inUrl = new URL("http://google.com").openStream();
        readFullyByByte(inUrl);
        System.out.println("\n\n\n");

        InputStream inArray = new ByteArrayInputStream(new byte[]{45, 54, 23});
        readFullyByByte(inArray);
        System.out.println("\n\n\n");
    }

    public static void readFullyByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }

    }
}
