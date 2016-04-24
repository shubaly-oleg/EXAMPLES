package examples.SortItemRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import examples.collections.Item;

public class SortItemRunner 
{
    public static void main( String[] args )
    {
        ArrayList<Item> p = new ArrayList<Item>(){
        	{
	        	add(new Item(52201, 9.75f, "T-Shirt"));
	        	add(new Item(52127, 13.19f, "Dress"));
	        	add(new Item(47063, 45.95f, "Jeans"));
	        	add(new Item(90428, 69.9f, "Gloves"));
        	}
        };
        Comparator<Item> comp = new Comparator<Item>() {
        	public int compare (Item one, Item two){
        		return Double.compare(two.getPrice(),one.getPrice());
        	}
		};
        
		Collections.sort(p, comp);
		System.out.println(p);
    }
}
