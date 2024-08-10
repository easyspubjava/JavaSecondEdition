package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍주광");
		treeSet.add("문찬욱");
		treeSet.add("조형준");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}
}
