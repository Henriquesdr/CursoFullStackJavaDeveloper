package generics;

import java.util.TreeSet;

public class ComparableTeste {

	public static void main(String[] args) {

		TreeSet<Integer> nums = new TreeSet<>();

		nums.add(1);
		nums.add(10);
		nums.add(100);
		nums.add(1000);
		nums.add(-1);

		for (Integer n : nums) {
			System.out.println(n);
		}
	}
}
