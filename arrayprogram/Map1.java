package arrayprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Map1 {

	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(2,"cccc");
		m.put("abcd","gjkl");
		m.put(1,"Test1");
	    m.put(4,"demo");
	    
	    System.out.println(m);
	   // System.out.println(m.keySet());
	   // System.out.println(m.values());
        Set set=m.entrySet();
        
        Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry map=(Map.Entry)itr.next();
		System.out.println("Key:-"+map.getKey()+"---"+"value:-"+map.getValue());


	}

}
}
