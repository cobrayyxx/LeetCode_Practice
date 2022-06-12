package com.company.arrays_hashing.contains_duplicate;

import java.util.HashSet;
import java.util.Set;
//acc
public class solution_three {
    public static void main(String[] args) {

    }
    public static boolean containsDuplicate(int[] nums){
        Set<Integer> num_set = new HashSet<>();
        for(int i=0; i<nums.length;i++) {
            if(num_set.contains(nums[i])) return true;
            num_set.add(nums[i]);
        }
        return false;
    }

}
