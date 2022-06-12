package com.company.two_pointers.valid_palindrome;

public class solution_one {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String result ="";
        for(int i=0; i<s.length();i++){
            result = s.charAt(i)+result;
        }
        if(result.equals(s)){
            return true;
        }
        return false;
    }

}
