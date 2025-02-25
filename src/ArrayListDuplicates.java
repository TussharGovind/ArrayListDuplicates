
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDuplicates {
    public static void main(String[] args) throws Exception {
        // Approach 1 - just using linkedhashset
        List<String> arr = Arrays.asList("1","2","3","4","3","3","6");
        System.out.println(arr);
        // // converting arr to set 
        // Set<String> s = new LinkedHashSet<>(arr);
        // System.out.println(s);

        //Approach 2 - using stream API
        // List<String> withoutDuplicateList = arr.stream().distinct().toList();
        // System.out.println(withoutDuplicateList);

        //Approach 3 - iterating over loop to find duplicates and store in new list, order O(n)

        List<String> newList = new ArrayList<>();
        for (String i : arr)
        {
            if(!newList.contains(i))
            {
                newList.add(i);

            }
            
        }

        System.out.println(newList);



    }
}
