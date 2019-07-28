package com.example.faizan;

import java.util.Scanner;

class Table {
    public void table() {
        Scanner S = new Scanner(System.in);
        System.out.println("Table of number ?");
        int a = S.nextInt();
        System.out.println("From ?");
        int b = S.nextInt();
        System.out.println("To ?");
        int c = S.nextInt();
        int d = b;
        int e;
        while (d <= c) {
            e = a * b;
            System.out.println(e);
            d++;
            b++;
            //___________________________________________________________________________________________________________
        }
    }

}