package tutorials;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

	public static void main(String[] args) {
List<Long> longs=new ArrayList<>();
Long[] s=new Long[4];
s[0]=null;
System.out.println(String.valueOf(null));
System.out.println(s.length);

longs.add(null);
System.out.println(longs.size());
	}

}
