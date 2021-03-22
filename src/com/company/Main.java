package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();++i){
            if(s.charAt(i) == 'O'){
                if(st.empty() || st.peek() != 'L'){
                    st.push('O');
                }
            }
            else if(s.charAt(i) == 'T'){
                while(!st.empty() && st.peek() == 'O'){
                    st.pop();
                }
                st.push('T');
            }
            else if(s.charAt(i) == 'L'){
                st.push('L');
            }
        }
        System.out.println(st.size());
    }
}
