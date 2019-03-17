package inner_nested;

public class App1i {
    private int field;
    private static int fieldStatic;

    static class Nested {
        Nested() {
//            final = 1;
            fieldStatic = 1;
        }
    }
}
