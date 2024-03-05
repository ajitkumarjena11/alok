import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "shashidhar";
		Map<String, Long> collect = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
               System.out.println(collect);	
//               LinkedHashMap mp= new LinkedHashMap(collect);
               // find the first non repeating character in a string
               Entry<String, Long> entry = collect.entrySet().stream().filter(k->k.getValue()==1).findFirst().get();
               //find all the duplicate characters in a string
                Map<String, Long> collect2 = collect.entrySet().stream().filter(t->t.getValue()>1).collect(Collectors.toMap(r->r.getKey(),r->r.getValue()));
               System.out.println(collect2);
               //find the second highest number in an Array using Stream Api
               int [] ar= {5,9,11,2,8,21,1};
               int[] array = Arrays.stream(ar).sorted().toArray();
               System.out.println(array[array.length-2]);
           // find the longest string in an given array  
               String []str= {"java","techie","springboot","microservices"};
               Optional<String> reduce = Arrays.stream(str).reduce((w1,w2)->w1.length()>w2.length()? w1: w2);
           System.out.println(reduce.get());
           //find the length of the last word
      // System.out.println(str[str.length-1].length());
       
           
	}

}
