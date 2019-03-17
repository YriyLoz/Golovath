package IQ.Rider_Vriter;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class _1_Charset {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] rawDate = new byte[256];
        for (int k = 0; k < 256; k++) {
            rawDate[k] = (byte) (k - 128);
        }
        for (String name : Charset.availableCharsets().keySet()) {
            System.out.println(new String(rawDate,name));
            System.out.println("\n\n\n");
        }
    }
}
