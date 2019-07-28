package com.example.faizan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // What's wrong?
        Scanner S = new Scanner(System.in);
        System.out.println("Table of number ?");
        int a = S.nextInt();
        System.out.println("From ?");
        int b = S.nextInt();
        System.out.println("To ?");
        int c = S.nextInt();
        Table table=new Table();
        table.table(a,b,c);
    }
}
