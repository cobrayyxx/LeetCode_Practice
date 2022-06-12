package com.company.arrays_hashing.two_sum;

import java.util.Arrays;
import java.util.HashMap;
//pass
public class solution_one {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }
    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j< nums.length;j++){
                int sum = nums[i]+nums[j];
                if(sum == target ){
                    result[0] = i;
                    result[1] = j;
                    System.out.println(result[0]);
                    return result;
                }
            }
        }
        return result;
    }
}
