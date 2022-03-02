import java.util.ArrayList;
import java.util.List;

public class Java11Q3 {

	public static void main(String[] args) {

		List<String> m = new ArrayList<String>();
        m.add("A");
        m.add("quick");
        m.add("brown");
        m.add("fox");
        m.add("jumps");
        m.add("over");
        m.add("the");
        m.add("lazy");
        m.add("dog");
  
        String[] arr = new String[m.size()];
        arr = m.toArray(arr);
  
        for (String x : arr)
            System.out.print(x + " ");
	}

}
