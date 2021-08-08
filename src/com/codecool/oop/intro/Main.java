package com.codecool.oop.intro;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * https://www.tutorialspoint.com/java/java_documentation.htm
     *
     */
    public static void main(String[] args) {
        //helloWorld();
        //
        /* */
        readAndPrintNumbers();
    }

    private static void helloWorld() {
        System.out.print("What is your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }

    public static void basicDataTypes() {
        boolean b = true; // false
        int i = 153_000_000; // byte, short, long, 0xAF, 0b00001111, 1533L
        double d = 1.01e15; // flot, 1.01F
        char c = 'A';
        String str = "My string";
    }

    private static void readAndPrintNumbers() {
        var random = new Random(); // Math.random()

        System.out.print("Give me first number: ");
        var scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Give me second number: ");
        int b = scanner.nextInt();
        System.out.println("Now do some math...");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a / b = " + (a / (b * 1.0)));
        System.out.println("a pow b = " + Math.pow(a, b));
        System.out.println("random number = " + random.nextInt(10)); // Math.random() <0, 1)
    }

    private static void someOperators() {
        // https://www.javatpoint.com/operators-in-java
        var a = 5;
        // var b;
        final float PI = 3.14f; // const ...
        a++; --a;

        // << >> >>>
        // == !=
        // &, ^ | && || ?:
        // +=, -=, ...

        var c = 0b00001111;
        var d = 0b11110011;
        System.out.println(Integer.toBinaryString(c & d)); // toString + radix
        System.out.println(Integer.toBinaryString(c | d));
        System.out.println(Integer.toBinaryString(c ^ d));
    }

    private static void parseInput() {
        var scanner = new Scanner(System.in);
        try {
            System.out.print("Give me some number: ");
            String input = scanner.nextLine().strip();
            int number = Integer.parseInt(input);
            System.out.println("The number is/was: " + number);
        } catch (Exception e) {
            System.out.println("An error occurred: " + Arrays.toString(e.getStackTrace()));
        }
    }

    private static void conditionals() {
        int a = 5;
        int b = 6;

        if (a > b) { // >=, <=, !=, &&, ||, !
            System.out.println("a > b");
        } else if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a < b");
        }

        var d = (a > b) ? a : b;

        switch (a) {
            case 1: System.out.println("1"); break;
            case 2: System.out.println("2"); break;
            case 3:
            case 4: System.out.println("3 or 4"); break;
            default: System.out.println("I have no idea!");
        }
    }

    private static void loops() {
        int a = 5;
        int i = 0;

        while (i <= a) {
            System.out.println(i);
            i++;
        }

        int c = 0;
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < c);

        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }
    }

    private static void arrays() {
        int[] numbers = new int[10];
        String[] strings = {"One", "Two", "Three"};
        int[][] board = new int[10][5]; // int[10][]
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        for (var s : strings) {
            System.out.println(s);
        }
    }

    private static void commonStringOperations() {
        String s = "My very important string";
        // charAt, (char)intValue
        // strip, split()
        // == i equals isEmpty(), isBlank()
        // https://www.educba.com/java-string-operators/
        // s.length(), toUpperCase(), toLowerCase(), indexOf(), +, trim(), startsWith(),
        // endsWith(), matches(), replace()
    }
}
