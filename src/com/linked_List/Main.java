package com.linked_List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start"); // UC 2
        System.out.println("Enter 2 to add the data at the End"); // UC 3
        System.out.println("Enter 3 to add the data at In Between ");
        System.out.println("Enter 4 to delete the data at first position");
        switch (scanner.nextInt()) {

            case 1:
                Operation.addDataAtStart();
                break;
            case 2:
                Operation.addDataAtEnd();
                break;
            case 3:
                Operation.insertInBetween();
                break;
            case 4:
                Operation.pop();
                break;
        }
        scanner.close();
    }
}