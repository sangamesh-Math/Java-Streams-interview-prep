//Program to find common elements in both the lists. 
import java.util.stream.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10,20,30,40);
        List<Integer> list2 = Arrays.asList(20, 30, 67, 100);

        List<Integer> common = list1.stream()
            .filter(list2 :: contains)
            .collect(Collectors.toList());
            
        System.out.println(common);
        
	}
}
