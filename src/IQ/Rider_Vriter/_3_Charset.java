package IQ.Rider_Vriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class _3_Charset {
    public static void main(String[] args) throws IOException {

        InputStream is = null;
        try {
            is = new URL("https://www.google.com/search?rlz=1C1SQJL_ruUA825UA825&ei=svE9XOL9OOmArwTaqYPgBQ&q=text&oq=text&gs_l=psy-ab.3..0j0i67j0l8.862.2706..2932...0.0..0.271.1027.0j3j2....2..0....1..gws-wiz.....0..35i39j0i131j0i131i67.AYsXBEtiLqA").openStream();

            Reader reader = new InputStreamReader(is, "windows-1251");
            char[] buff = new char[16];
            int count;
            while ((count = reader.read(buff)) != -1) {
                System.out.println(new String(buff, 0, count));
            }
        } finally {
            if (is != null) {
                try {
                    is.close();

                } catch (IOException ignore) {

                }
            }
        }
    }
}