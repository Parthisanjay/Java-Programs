package Testpractices;

import java.util.Arrays;

public class Test16 {
	public static void main(String[] args) {
		int num[]= {94,95,96,97};
		int k=removeDuplicates(num);
		System.out.println(k);
	}
	 public static int removeDuplicates(int[] nums) {
	        int count=0;
	        int index=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]!='_'){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]==nums[j]){
	                    nums[j]='_';
	                }
	            }
	            nums[index++]=nums[i];
	            count++;
	            }
	        }
	        System.out.println(Arrays.toString(nums));
	        return count;
	    }
}
