package IQ;

import java.io.*;

public class _4_OSTest {
    public static void main(String[] args) throws IOException {
        String fileName = "d:/txt.txt";
        InputStream infileName = null;
        try {
            infileName = new FileInputStream(fileName);
            byte[] data = writeFullyByByte(infileName);
            System.out.println(new String(data, "UTF8"));
            ByteArrayInputStream two= new ByteArrayInputStream(data);
            System.out.println((char)two.read());

        } catch (IOException e) {
            throw new IOException(" Exception when open and read file " + infileName, e);
        } finally {
            closeQuietly(infileName);
        }

    }

    private static byte[] writeFullyByByte(InputStream in) throws IOException {
        int oneByte;
        ByteArrayOutputStream one = new ByteArrayOutputStream();
        while ((oneByte = in.read()) != -1) {
            one.write(oneByte);
            one.flush();
        }
        return one.toByteArray();
    }

    public static void closeQuietly(InputStream in) throws IOException {
        if (in != null) {
            in.close();
        }
    }
}
