package ms.springframework.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		int[] i = new int[]{2,1,2};
		int res = singleNumber(i);
	}

	public static int singleNumber(int[] nums) {
		int res = 0;
		for (int num : nums) {
			res = res ^ num;
		}
		return res;
	}

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>(nums.length);
		for(int i = 0; i < nums.length; i++){
			if(!set.add(nums[i])){
				return true;
			}
		}
		return false;
	}

	public static void rotate(int[] nums, int k) {
		int[] temp = new int[nums.length];
		for(int i = 0; i < nums.length; i++){
			temp[i] = nums[i];
		}
		for(int i = 0; i < temp.length; i++){
			nums[(i + k) % temp.length] = temp[i];
		}
	}

	public static int maxProfit(int[] prices) {
		int total = 0;
		for(int i = 0; i < prices.length - 1; i++){
			total += Math.max(prices[i + 1]  - prices[i], 0);
		}
		return total;
	}

	public static int removeDuplicates(int[] nums) {
		int left = 0;
		for(int right = 1; right < nums.length; right++){
			if(nums[left] != nums[right]){
				nums[++left] = nums[right];
			}
		}
		return ++left;
	}
}
