import java.util.*;

class hashmap{
	public static void main(String[] args) {
		Map<String,Integer> hm=new Hashmap<String,Integer>();
		hm.put("suraj",10);
		hm.put("ajay",20);
		hm.put("aditya",30);
		
		for(Map Entry<String,Integer> e:hm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}	
	}
}