package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
//this must be imported to utilize HashSets
//import java.util.HashSet;
//import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class SetExample 
{
	public static void main(String[] args) 
	{
		//This is example code for a simple HashSet
//		Set<Integer> mySet = new HashSet<Integer>();
//		
//		mySet.add(1);
//		mySet.add(2);
//		mySet.add(3);
//		mySet.add(1);
//		System.out.println(mySet.size());
		
		//Queue
		Queue<String> myQueue = new LinkedList<String>();
		
		myQueue.offer("a");
		myQueue.offer("b");
		myQueue.offer("c");
		
		//peek looks to see if the queue has information in it
		//peek also looks at the top item
		while(myQueue.peek() != null)
		{
			//.poll takes the top item out of a queue and in this case prints it
			//once at the end of queue is becomes null and loop breaks
			System.out.println(myQueue.poll());
		}
		
		//example of combining collections
		Map<String, List<Integer>> testScores = new HashMap<String, List<Integer>>();
		
		List<Integer> joeScores = new ArrayList<Integer>();
		joeScores.add(80);
		joeScores.add(60);
		joeScores.add(97);
		joeScores.add(67);
		testScores.put("Joe", joeScores);
		
		List<Integer> amyScores = new ArrayList<Integer>();
		amyScores.add(82);
		amyScores.add(65);
		amyScores.add(96);
		amyScores.add(86);
		testScores.put("Amy", amyScores);
		
		List<Integer> fredScores = new ArrayList<Integer>();
		fredScores.add(80);
		fredScores.add(60);
		testScores.put("Fred", fredScores);
	
		printScores("Joe", testScores);
	}
	
	
	
	public static void printScores(String studentName, Map<String, List<Integer>> scoresMap)
	{
		
		List<Integer> scores = scoresMap.get(studentName);
		System.out.println(studentName);
		for(int score : scores)
		{
			System.out.println(score);
		}
	}
}
