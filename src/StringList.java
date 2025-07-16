import java.util.stream.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringList {

    List<String> names = Arrays.asList("Luis", "Gerard", "Mateo", "Felipe", "Robert");

    public void namesWithO() {

        List<String> withO = names.stream()
                .filter(name -> name.contains("o"))
                .collect(Collectors.toList());
        System.out.println(withO);
    }
}
