
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDuplicates {
    public static void main(String[] args) throws Exception {
        List<String> arr = Arrays.asList("1","2","3","4","3","3","6");
        System.out.println(arr);
        // converting arr to set 
        Set<String> s = new LinkedHashSet<>(arr);
        System.out.println(s);

    }
}
