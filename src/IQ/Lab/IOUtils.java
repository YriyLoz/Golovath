package IQ.Lab;

import javax.naming.NamingEnumeration;
import java.io.*;

public class IOUtils {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream(new File("D:/TEXT.html"));
        OutputStream out = new FileOutputStream(new File("D:/TEXT3.html"));
        copyCleanZerosByByte(in, out);
    }

    public static void copyCleanZerosByByte(InputStream in, OutputStream out) throws IOException {
        int count;
        try {
            byte[] bytes = new byte[64 * 1024];
            while ((count = in.read(bytes)) != -1) {
                for (int k = 0; k < count; k++) {
                    if (bytes[k] != 0) {
                        out.write(bytes[k]);
                    }

                }
            }
        } catch (IOException e) {
            throw new IOException("HI HI");
        }

    }
}
