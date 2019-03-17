package IQ.Lab;

import java.io.*;
import java.net.URL;

public class DownLoadFromInternet_lab {
    public static void main(String[] args)throws IOException {
        URL url = new URL("http://www.google.com");
        OutputStream file = new BufferedOutputStream(new FileOutputStream(new File("D:/TEXT.html")));
        OutputStream file2 = new BufferedOutputStream(new FileOutputStream(new File("D:/TEXT2.html")));
        InputStream in = new BufferedInputStream(url.openStream());
        int b;
        try{
            while ((b = in.read()) != -1) {

                file.write(b);
                file2.write(b);
            }
            in.close();

            file.flush();
            file.close();

            file2.flush();
            file2.close();
        } catch (IOException e) {
            new File("D:/TEXT.html").delete();
            new File("D:/TEXT2.html").delete();

        }
    }
}
