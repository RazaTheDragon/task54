package com.example.faizan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // What's wrong?
        class Table {
            public void table() {
           //every thing is fine here_______
           //                               |
           //                               V
           //___________________________________________________________________________________________________________
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

            Table(4,5,5);

        }
    }
}
