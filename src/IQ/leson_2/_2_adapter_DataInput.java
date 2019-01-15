package IQ.leson_2;

import java.io.*;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class _2_adapter_DataInput {
    public static void main(String[] args) throws IOException {
        writeToFile();
        readFromFile();

    }

    private static void writeToFile() throws IOException {
        byte age = 45;
        String name = "Mike";
        int[] salaryArr = {200, 300, 250, 150};

        OutputStream OutputStream = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(new File("C:/Users/yriyl/Pictures/image/hig.jpg"))));
        DataOutput dateOutput = new DataOutputStream(OutputStream);
        dateOutput.writeByte(age);
        dateOutput.writeUTF(name);
        dateOutput.writeInt(salaryArr.length);
        for (int salaryElem : salaryArr) {
            dateOutput.writeInt(salaryElem);
        }
        OutputStream.flush();
        OutputStream.close();
    }

    private static void readFromFile() throws IOException {
        InputStream InputStream = new GZIPInputStream (new BufferedInputStream(new FileInputStream(new File("C:/Users/yriyl/Pictures/image/hig.jpg"))));
        DataInput dataInput = new DataInputStream(InputStream);
        byte age = dataInput.readByte();
        String name = dataInput.readUTF();
        int[] salaryArr = new int[dataInput.readInt()];
        for (int k = 0; k < salaryArr.length; k++) {
            salaryArr[k] = dataInput.readInt();
        }
        InputStream.close();
        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("salaryArr = "+ Arrays.toString(salaryArr));
    }
}
