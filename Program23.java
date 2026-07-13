//Program to whether all numbers are positive
import java.util.stream.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10,20,30,40);
        
        boolean result = list.stream().allMatch(n -> n > 0);
        
        System.out.println(result);
        
	}
}
