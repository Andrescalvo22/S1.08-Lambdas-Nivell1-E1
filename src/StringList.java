import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringList {

    List<String> names = Arrays.asList("Luis", "Gerard", "Mateo", "Felipe", "Robert");

    public List<String> namesWithOAndLength() {
        return names.stream()
                .filter(name -> name.contains("o") && name.length() > 5)
                .collect(Collectors.toList());
    }
}
