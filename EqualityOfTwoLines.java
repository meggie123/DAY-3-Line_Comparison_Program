package com.bridgelabz.line_comparison;
import java.util.Scanner;

public class EqualityOfTwoLines {
    public static void main(String args[]) {
        int x1, x2, y1, y2;

        double length;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter x1 point");

        x1 = sc.nextInt();

        System.out.println("enter y1 point");

        y1 = sc.nextInt();

        System.out.println("enter x2point");

        x2 = sc.nextInt();

        System.out.println("enter y2 point");

        y2 = sc.nextInt();

        length = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);

        System.out.println("Length of Lines is : " + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + length);

        System.out.println(" Checking Equality of Two Lengths:");
        System.out.println(x1 + " == " + y1 + " : " + (x1 == y1));
        System.out.println(x2 + " == " + y2 + " : " + (x2 == y2));

    }

}
