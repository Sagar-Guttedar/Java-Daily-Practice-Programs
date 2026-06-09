package com.str;

/*public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = "sagar";
        int count = 0;

        char[] ch = str.toCharArray();
        for (int i=0;i<ch.length;i++){
            for (int   j= i+1; j<ch.length; j++){
                if (ch[i]==ch[j]){
                    System.out.println("Duplicate characters in String are  :"+ch[j]);
                    count++;
                }
            }
        }
            System.out.println("Duplicate characters count : "+count);
    }
}*/


/*
public class DuplicateCharacter{
    public static void main(String[] args) {
        String str="Bannaaaaa";
        int count=0;

        char[] ch=str.toCharArray();
        for (int i=0;i<ch.length;i++){
            for (int j=i+1; j<ch.length;j++){
                if (ch[i]==ch[j]){
                    System.out.println("Duplicate characters in given String :"+ch[j]);
                }
            }
        }
        System.out.println("Count the duplicate Character : "+count);
    }
}*/


/*public class DuplicateCharacter{
    public static void main(String[] args) {
        String str="Banana";
        String s="";
        int count=0;

        char[] ch=str.toCharArray();
        for (int i=0;i<ch.length;i++){
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    System.out.println("Duplicate Character in given String is :"+ch[j]);
                }
            }
        }
        System.out.println("Count the Duplicate Character :"+count);
    }
}*/

public class DuplicateCharacter{
    public static void main(String[] args) {
        String str="Banana";
        String s="";
        int count=0;

        char[] ch=str.toCharArray();
        for (int i=0;i<ch.length;i++){
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    System.out.println("Duplicate Character in given String :"+ch[j]);
                    count++;
                }
            }
        }
        System.out.println("Count the Duplicate character :"+count);
    }
}






















