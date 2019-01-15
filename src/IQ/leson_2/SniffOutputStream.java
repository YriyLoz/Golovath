package IQ.leson_2;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SniffOutputStream extends InputStream {
    private final InputStream deleges;

    public SniffOutputStream(InputStream deleges) {
        this.deleges = deleges;
    }

    @Override
    public int read(byte[] b) throws IOException {
        int read = deleges.read(b);
        System.out.println("read bytes = " + read);
        return read;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int read = deleges.read(b, off, len);
        System.out.println("read bytes = " + read);
        return deleges.read(b, off, len);
    }

    @Override
    public int read() throws IOException {
        System.out.println("ride: 1 byte");
        return this.deleges.read();
    }

}
