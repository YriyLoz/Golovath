package generics;

import java.util.Arrays;

public class _3_HolderStrringTest {
    public static void main(String[] args) {
        _2_ObjectHolder holder = new _2_ObjectHolder();
        holder.setData("hello world");

        String str = (String) holder.getData();
        System.out.println(str);

        _2_ObjectHolder holder1 = new _2_ObjectHolder();
        holder1.setData(new int[]{10, 11, 12, 13});

        int[] str1 = (int[]) holder1.getData();
        System.out.println(Arrays.toString(str1));
    }

}
