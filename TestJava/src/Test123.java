import java.util.*;

public class Test123 {
	public static boolean nametest(String search) {
     	List<String> myList = Arrays.asList("  A", "B  ", "  C  ");
		for(String str1: myList) {
		    if(str1.trim().contains(search))
		       return true;
		}
		return false;

	}
	
	public static String nametest1(String search) {
     	List<String> myList = Arrays.asList("jon", "john");
     	List<String> myList1 = Arrays.asList("chirs", "christopher","kris");
		for(String str1: myList) {
		    if(str1.trim().contains(search))
		       return "John";
		}
		for(String str1: myList1) {
		    if(str1.trim().contains(search))
		       return "Chris";
		}
		return search;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String Search ="jon";
List<String> list13 =Arrays.asList("jon", "john","chirs", "christopher","kris","pankaj","jon", "john","chirs", "christopher","kris","pankaj");
System.out.println(nametest(Search));
List<String> list = new ArrayList<String>();
for(String str1: list13) {

System.out.println(nametest1(str1));

list.add(nametest1(str1));

}
/*List<String> list = new ArrayList<String>();
list.add("aaa");
list.add("bbb");
list.add("aaa");*/
Set<String> unique = new HashSet<String>(list);
System.out.println("Result is::");
for (String key : unique) {
    System.out.println(key + ": " + Collections.frequency(list, key));
}


		
	}

}
