package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionsExercices {
    private static final Logger log = LoggerFactory.getLogger(ExeptionsExercices.class);
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentReader studentReader = new StudentReader();
        var student = studentReader;

        log.info(studentReader.toString());
        readNumber();
    }

    public static int readNumber() {

        Integer number = null;
        do {
            try {
                log.info("Introduzca un número");
                number = scanner.nextInt();
            }catch (InputMismatchException e) {
                log.error("El valor introducido no es un número");
            }
            scanner.nextLine();

        }while (number == null);

        return number;
    }



}
