package com.company.arrays_hashing.contains_duplicate;

import java.util.HashSet;
import java.util.Set;
// This code got TLE and Compile error
public class solution_two {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        System.out.println(containsDuplicate(num));
    }
    public static boolean containsDuplicate(int[] nums){
        Set<Integer> num_set = new HashSet<>();
        for(int i=0; i<nums.length;i++) {
            num_set.add(nums[i]);
        }
        if(num_set.size() == nums.length){
            return false;
        }else{
            return true;
        }
    }
}
