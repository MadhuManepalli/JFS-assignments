import java.util.TreeMap;
import java.util.*;
public class CollecQ1 {
	public static void main(String[] args)
	{
		TreeMap<Long,String> contact=new TreeMap<>();
		contact.put((long) 7095001796, "madhu");
		contact.put((long) 8106018644, "dhanu");
		contact.put((long) 7995801619, "Eswar");
		contact.put((long) 6303493393, "Naidu");
		System.out.println(contact.keySet());
		System.out.println(contact.values());
		System.out.println(contact);
	}
}
