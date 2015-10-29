/*
Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are NOT zero-based.

Have you met this question in a real interview? Yes
Example
numbers=[2, 7, 11, 15], target=9

return [1, 2]

Note
You may assume that each input would have exactly one solution

Challenge
Either of the following solutions are acceptable:

O(1) Space, O(nlogn) Time
O(n) Space, O(n) Time
*/

public class Solution {
	//unsorted array, O(n)suntime, O(n)space 
	public int[] twoSum(int[] numbers, int target) {
	   if(numbers==null || numbers.length<2) return null;
        //hashtable, O(1) to search a value
        HashMap<Integer,Integer> sums = new HashMap<>();
        
        for(int i=0;i<numbers.length;i++){
            if(sums.containsKey(numbers[i])){
                int index = sums.get(numbers[i])+1;
                return new int[]{index,i+1};
            }else{
                sums.put(target-numbers[i],i);
            }
        }
        
        return null;
	}
	// sorted array O(n) runtime, O(1)space
	/**
             int i=0;
             int j=numbers.length-1;
             while(i<j){
             	int sum = numbers[i]+numbers[j];
             	if(sum == target){
                   return new int[]{i+1,j+1};
             	}else if (sum < target){
             	   i++;
             	}else{
             	   j++;
             	}
             }
             return null;
 	 * /
}
