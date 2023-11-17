
import java.util.*; 
/*
 * Homework Assignment 4 Se320
 * KashPritt
 * 
 * 
 */
//This program tests 3 methods of UNion, difference, and intersection of a linked hashset and sees the output on sets.
public class LinkedHashSets 
{

	public static void main(String[] args)
	{
		HashSet<String> set_of_names = new LinkedHashSet<>();
		HashSet<String> set_of_names2 = new LinkedHashSet<>();
		
		try {
		set_of_names.add("George");
		set_of_names.add("Jim");
		set_of_names.add("John");
		set_of_names.add("Blake");
		set_of_names.add("Kevin");
		set_of_names.add("Michael");
		
		set_of_names2.add("George");
		set_of_names2.add("Katie");
		set_of_names2.add("Kevin");
		set_of_names2.add("Ryan");
		}
		catch(Exception e)
		{
			System.out.println("Not A string");
		}
		
		setUnion(set_of_names, set_of_names2);
		setDifference(set_of_names, set_of_names2);
		setIntersection(set_of_names, set_of_names2);
	
		
		
	}
	//This method gets all the possible items between the two sets, replaces
	public static void setUnion(HashSet<String> set1, HashSet<String> set2)
	{
		HashSet<String> clone_set1 = new LinkedHashSet<>(set1);
		//Hash Sets donnot allow for existing elements to be added again, so we check if a word is part of set, if not add
		for(String word:set2)
		{
			clone_set1.add(word);
		}
	
		
		System.out.print(clone_set1);
		
	}
	//This removes all set 2 from set 1
	public static void setDifference(HashSet<String> set1, HashSet<String> set2)
	{
		HashSet<String> clone_set1 = new LinkedHashSet<>(set1);
		clone_set1.removeAll(set2);
		
		System.out.print("\n"+clone_set1);
	}
//This function grabs the intersection of two sets using the retainAll
	public static void setIntersection(HashSet<String> set1,HashSet<String> set2)
	{
		HashSet<String> clone_set1 = new LinkedHashSet<>(set1);
		clone_set1.retainAll(set2);
		
		System.out.print("\n"+clone_set1);
	}
}
