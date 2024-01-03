package Homework.ArraylistPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestStrings {
    public static void main(String[] args) {
        List<String> lst=new ArrayList<String>();
        Scanner scr=new Scanner(System.in);
        List<String> longest=new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            String val=scr.nextLine();
            lst.add(val);
        }
        System.out.println("the length of the longest string is: "+maxlen(lst));
        System.out.println("the longest strings are: "+maxStrings(lst));



    }
    public static int maxlen(List<String> lst){
        int maxlen=0;
        for (String s:lst) {
            if (maxlen<s.length())
                maxlen=s.length();
        }
        return maxlen;
    }

    public static List<String> maxStrings(List<String> lst){
        List<String> maxstrings=new ArrayList<String>();
        int maxlength=maxlen(lst);
        for (String s:lst ){
            if(s.length()==maxlength)
                maxstrings.add(s);
        }
        return maxstrings;
    }
}
