import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String novell = "London is a capital of Great Britain";
        String[] manyWords = novell.split(" ");//разделение через пробел

        System.out.println(novell);
        System.out.println(Arrays.toString(manyWords));
    }
}