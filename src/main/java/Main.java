import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author lrudkova <Lyudmila.Rudkova@t-systems.com>
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list = list.subList(0,2);
        Stream<String> stream = list.stream();
        list.add("4");
        stream.forEach(System.out::println);
    }
}
