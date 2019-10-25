package com.turing;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("请输入");
        int count = 5;
        for (int i=0;i<count;i++){
            String next = s.next();
            if(next.equals("1")){
                System.out.print("hello");
            }else {
                System.out.print("hello2");
            }
        }

    }
}
