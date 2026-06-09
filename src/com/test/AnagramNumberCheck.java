package com.test;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

/*
public class AnagramNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram = Arrays.equals(arr1, arr2);

        if (isAnagram) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
*/

/*public class AnagramNumberCheck{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first String : ");
        String str1 = sc.next();

        System.out.println("Enter a second String : ");
        String str2 = sc.next();

        char[] arr1=str1.toCharArray();
        char[] arr2=str1.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram=Arrays.equals(arr1, arr2);

        if(isAnagram){
            System.out.println(str1 + " And " + str2 + " are anagrams");
        }else{
            System.out.println(str1 + " And " + str2 + " are not anagrams ");
        }
    }
}*/


public class AnagramNumberCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first String : ");
        String str1=sc.next();

        System.out.println("Enter second string : ");
        String str2 = sc.next();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram = Arrays.equals(arr1,arr2);

        if(isAnagram){
            System.out.println(str1 + " And " + str2 + " are Anagrams");
        }else{
            System.out.println(str1 + " And " + str2 + " are not Anagrams");
        }

    }
}


/*
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram("anagram", "nagaram"));
// Output: true

        System.out.println(va.isAnagram("rat", "car"));
// Output: false
    }
}*/
