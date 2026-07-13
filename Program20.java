//Program to join Strings of a list
import java.util.stream.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Boot");
        
        String result = list.stream()
        .collect(Collectors.joining(", "));
        
        System.out.println(result);
        
        
	}
}
