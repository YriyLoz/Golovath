package IQ.Lab;

import IQ.leson_2.SniffOutputStream;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class FileLab_CopyDir {
    public static void main(String[] args) throws IOException{
        copy(new File("C:/Users/yriyl/Pictures/image"),new File("C:/Users/yriyl/Pictures/image2"));

    }

    public static void copy(File sre, File dst) throws IOException {
        if (sre.isDirectory()) {
            if (!dst.exists()) {
                dst.mkdir();
            }
            for (File srcSudDir : sre.listFiles()) {
                String sudDirName = srcSudDir.getName();
                copy(srcSudDir, new File(dst, sudDirName));
            }
        }else{
            if (!dst.exists()) {
                InputStream in =new BufferedInputStream(new FileInputStream(sre));
                OutputStream out =new BufferedOutputStream(new FileOutputStream(dst));
                int count;
                byte[] buff = new byte[64 * 1025];
                while ((count = in.read(buff)) != -1) {
                    out.flush();
                    out.write(buff, 0, count);
                }
            }
        }
    }
}
