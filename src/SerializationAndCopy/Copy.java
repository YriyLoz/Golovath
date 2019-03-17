package SerializationAndCopy;

import java.io.IOException;

public class Copy {
   /* public static void main(String[] args) {
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

    public static <T extends Cloneable> T copy(T obj) throws NoSuchFieldException, IOException {

        Mathod m = Object.class.getDeclaredMethod("clone");
        m.setAccessible(true);

        return (T) m.invoke(obj);
    }*/
}

