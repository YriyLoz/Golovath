package IQ.Lab;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;
/*
public class FileLab_LookFor {
   private static File[] fileArray1;
    public static void main(String[] args) {
        File file = new File("C:/Users/yriyl/Pictures/image");
         File [] files =  print(file);
        System.out.println(Arrays.asList(files));



    }

    public static File[] print(File root) {
         fileArray1 = root.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                boolean result = false;
                if ( pathname.toString().endsWith(".jpg")) {
                    result = true;
                } else if (pathname.isDirectory()) {
                    result = false;
                    print (pathname);
                }
                return result;
            }
        });
        return fileArray1;

    }


    public static File[] concatenate(File[] file0, File[] file1) {
        File[] result = new File[file0.length + file1.length];
        System.arraycopy(file0, 0, result,0, file0.length);
        System.arraycopy(file1, 0, result, file0.length,file1.length);
        return result;
    }
}*/

