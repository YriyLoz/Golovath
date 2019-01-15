package IQ.leson_2;

import java.io.*;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class _6_OSTest_different_buffers {
    public static void main(String[] args) throws IOException {
        String fileFromName = "C:/Users/yriyl/Pictures/image/hi.jpg";
        String fileToName = "C:/Users/yriyl/Pictures/image/hik.jpg";


        for (int k = 1; k < 33* 1024; k *= 2) {
            InputStream in = null;
            OutputStream out = null;
            try {
                in = new BufferedInputStream(new FileInputStream(fileFromName), k);
                out = new BufferedOutputStream(new FileOutputStream(fileToName), k);
                long startTime = System.currentTimeMillis();
                copy(in, out);
                long stopTime = System.currentTimeMillis();
                System.out.println(stopTime - startTime);
            } catch (IOException e) {
                throw new IOException("kkkkkkkkkkk");
            } finally {
                closeQuietly(in);
                close(out);

            }
        }
    }

    public static void copy(InputStream in, OutputStream out) throws IOException {

        int count;
        while ((count = in.read()) != -1) {
            out.write(count);

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

    public static void close(OutputStream out) {
        if (out != null) {
            try {
                out.flush();
                out.close();
            } catch (IOException ignore) {

            }
        }
    }
}
