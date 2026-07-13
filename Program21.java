//Program to calculate sum and average of a list. 
import java.util.stream.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40);

        long sum = list.stream().mapToInt(Integer :: intValue).sum();
        
        double avg = list.stream().mapToInt(Integer :: intValue).average().getAsDouble();
        
        System.out.println(sum);
        
        System.out.println(avg);
        
	}
}
