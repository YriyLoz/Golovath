package SerializationAndCopy;

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws ClassCastException, IOException, ClassNotFoundException {
        {
            Object[] src = new Object[0];
            Object[] dst = copy(src);
            System.out.println(src != dst);
        }
        {
            Object[] src0 = {new Object[1]};
            Object[] src1 = {src0};
            src0[0] = src1;
            Object[] dst = copy(src0);
            System.out.println(dst != src0);
        }

    }

    public static <T extends Serializable> T copy  (T ob) throws IOException, ClassCastException, ClassNotFoundException {
        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        ObjectOutputStream objectOut = new ObjectOutputStream(buff);
        objectOut.writeObject(ob);
        objectOut.flush();
        objectOut.close();

        byte[] rawDate = buff.toByteArray();
        ObjectInputStream objectInput = new ObjectInputStream(new ByteArrayInputStream(rawDate));
        return (T) objectInput.readObject();
    }
}

