package org.launchcode.exercises;

import org.launchcode.Temperature.TemperatureException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a value for x: ");
        int x = input.nextInt();

        System.out.println("Enter a value for y: ");
        int y = input.nextInt();
        input.close();

        Divide(x, y);


        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!

        CheckFileExtension("Program.java");
    }

    public static int Divide(int x, int y) {
        // Write code here!
        if (y == 0) {
            try {
                throw new ArithmeticException("Y cannot equal zero.");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }

        return x/y;

    }

    public static int CheckFileExtension(String fileName) {

        int point = 0;

        if (fileName.contains(".java")) {
            point = 1;
            return point;
        }
        if (!fileName.contains(".java")) {
            point = 0;
            return point;
        }
        if (fileName == null) {
            try {
                throw new ArithmeticException("File submitted is null or an empty string");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }

        return point;
    }

}
