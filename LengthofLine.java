package org.example;

import java.util.Scanner;

public class LengthofLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x co-ordinate of first point ");
        int x1 = sc.nextInt();
        System.out.println("Enter the y co-ordinate of first point ");
        int y1 = sc.nextInt();
        System.out.println("Enter the x co-ordinate of Second point ");
        int x2 = sc.nextInt();
        System.out.println("Enter the y co-ordinate of Second point ");
        int y2 = sc.nextInt();
        System.out.println("Enter first Co-ordinate are (" + x1 + "," + y1 + ")");
        System.out.println("Enter Second Co-ordinate are (" + x2 + "," + y2 + ")");
        double length_of_line;
        double x = (x2 - x1);
        double y = (y2 - y1);
        x = x * x;
        y = y * y;
        double temp = x + y;
        length_of_line = Math.sqrt(temp);
        System.out.println("Length of line = "+length_of_line);
    }
}
