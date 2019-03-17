package generics;

import java.util.Arrays;

public class GenericHolderTest {
    public static void main(String[] args) {

        _3_GenericHolder<String> strHolder = new _3_GenericHolder<>();
        strHolder.setDate("hello wold");


        String str = strHolder.getDate();
        System.out.println(str);


        _3_GenericHolder<int[]> strArrayHolder = new _3_GenericHolder<>();
        strArrayHolder.setDate(new int[]{10,11,12,13,14,15});

        int[] arr = strArrayHolder.getDate();
        System.out.println(Arrays.toString(arr));
    }
}
