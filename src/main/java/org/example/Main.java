package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;


public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        log.info("INtroduce un número:");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number < 0 ) {
            log.warn("El número introducido es negativo.");
        }

        factorial(7);

    }

    public static int factorial(int number) {
        int res = number;
        log.debug("Empezamos con " + res);
        for (int i = 1; i < number; i++) {
            log.info("Lo multiplico por " + i + " y me da " + res);
            res *= i;
        }
        return res;
    }
}