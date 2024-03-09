package test;

import java.util.Arrays;

public class ArraysTest {

	/**
	 * containsDuplicates
	 * @param num
	 * @return
	 */
	public static boolean containsDuplicates(int[] num) {
		int count = 1;
		boolean flag = false;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j])
					count++;
			}
			if (count > 1) {
				flag = true;
				return flag;
			}
		}
		return flag;
	}

	/**
	 * checking prime
	 * @param number
	 * @return
	 */
	public static boolean isPrime(int number) {
		int count = 0;
		boolean flag = true;
		for (int i = 1; i <= number; i++)
			if (number % i == 0)
				count++;
		;
		if (count > 2) {
			flag = false;
		}
		return flag;
	}

	/**
	 *  Anagram or not
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean isAnagram(String s1, String s2) {
		boolean flag = false;

		if (s1.length() != s2.length())
			return flag;
		else {
			char[] cs = s1.toCharArray();
			char[] cs2 = s2.toCharArray();
			Arrays.sort(cs);
			Arrays.sort(cs2);
			for (int i = 0; i < cs2.length; i++)
				if (cs[i] != cs2[i])
					return flag;
			return flag = true;

		}
	}

	/**
	 * 
	 * @param arr
	 * @param target
	 * @return
	 */
	static public boolean arrayAddition(int[] arr, int target) {
		boolean flag = false;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				flag = true;
			for (int j = 0; j < arr.length; j++) {
				temp = temp + arr[j];
				if (temp == target)
					flag = true;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 25, 45, 8, 9 };
		System.out.println(arrayAddition(arr, 1));
	}

}
