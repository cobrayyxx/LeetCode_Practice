package com.company.contains_duplicate;

import java.util.HashSet;
// This code TLE
public class solution_one {
    public static void main(String[] args) {
        int[] num = {1,2,3,1};
        System.out.println(containsDuplicate(num));
    }
    public static boolean containsDuplicate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int curr_val = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int next_val = nums[j];
                if (curr_val == next_val) {
                    return true;
                }

            }


        }
        return false;
    }
}