package com.luca.javalib.java.scanner;

import java.util.Scanner;
import static java.lang.System.out;

public class ScanReader {
    public static void main(String[] args) {
        try (var s = new Scanner(System.in)) {
            while (s.hasNext()) {
                while (s.hasNextInt()) {
                    out.println("int: " + s.nextInt());
                }
                while (s.hasNextBoolean()) {
                    out.println("boolean: " + s.nextBoolean());
                }
                while (s.hasNext()) {
                    out.println("anything: " + s.next());
                }
            }

        }
    }
}
