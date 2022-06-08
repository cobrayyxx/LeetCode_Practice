package com.company.anagram;
import java.util.Arrays;
import java.util.Collections;

public class solution_one {
    public static void main(String[] args) {
        System.out.println(isAnagram("Halo", "Hoa"));
    }
    public static boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        String[] lst_s = s.split("");
        String[] lst_t = t.split("");
        if(lst_s.length != lst_t.length){
            return false;
        }
        System.out.println(Arrays.toString(lst_s));
        Arrays.sort(lst_s);
        Arrays.sort(lst_t);
        System.out.println();
        for(int i=0; i< lst_s.length;i++){
            if (!lst_s[i].equalsIgnoreCase(lst_t[i])){
                System.out.println(lst_s[i]+" = "+lst_t[i]);
                return false;
            }
        }
        return true;

    }
}
