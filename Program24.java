//Program to check whether any number is greater than 100
import java.util.stream.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40, 100, 120, 11);
        
        boolean result = list.stream().anyMatch(n -> n > 100);
        
        System.out.println(result);
        
	}
}
