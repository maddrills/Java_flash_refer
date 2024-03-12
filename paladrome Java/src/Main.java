import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<String> justArray = new ArrayList<>(List.of("one","two","three","four"));

        System.out.print(justArray);

        List<String> reversd = justArray.reversed();

        //System.out.print(reversedArray);
        System.out.print(reversd);

//        way 1
        List<String>reversing = Arrays.asList("hello".split(""));
        System.out.print(reversing.reversed());
//        long revers
        System.out.print(String.join("",reversing.reversed()));

//      way2
        String revrev = new StringBuilder("hello").reverse().toString();
        System.out.println("\n"+revrev);

    }
}