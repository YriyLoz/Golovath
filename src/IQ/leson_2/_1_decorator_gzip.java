package IQ.leson_2;

import javax.swing.*;
import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class _1_decorator_gzip {
    public static void main(String[] args) throws IOException {
        String fileFromName = "C:/Users/yriyl/Pictures/image/hi.jpg";
        String fileToName = "C:/Users/yriyl/Pictures/image/hik.jpg";
        String fileToName2 = "C:/Users/yriyl/Pictures/image/hik2.jpg";
        InputStream in = new SniffOutputStream((new BufferedInputStream(new FileInputStream(fileFromName))));
        OutputStream out = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(fileToName)));
        int count;
        byte[] buff = new byte[64 * 1025];
        while ((count = in.read(buff)) != -1) {
            out.write(buff, 0, count);
        }
        InputStream in2 = new GZIPInputStream(new BufferedInputStream(new FileInputStream(fileToName)));
        OutputStream out2 = new BufferedOutputStream(new FileOutputStream(fileToName2));

        while ((count = in2.read(buff)) !=-1) {
            out2.write(buff, 0, count);
        }
    }
}
