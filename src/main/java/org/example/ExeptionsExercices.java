package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionsExercices {
    private static final Logger log = LoggerFactory.getLogger(ExeptionsExercices.class);
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        readDoubleNumbers();
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

    public static double readDoubleNumbers(){

        double num1 = 1;
        double num2;

        try {
            log.info("Introduzca un número: ");
            num1 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            log.error("El valor introducido no es un número. ");
        } finally {
            scanner.nextLine();
        }

        num2 = aDoubleMoreZero();

        return num1 / num2;
    }

    public static double aDoubleMoreZero() {

        double num = 1;
            try{
                log.info("Introduzca un número distinto de 0");
                num = scanner.nextDouble();
                if (num == 0) {
                    log.info("El número es igual a cero, introduzca otro valor");
                }
            } catch (InputMismatchException e) {
                log.error("El valor introducido no es un número.");
            } finally {
                scanner.nextLine();
            }
        return num;
    }



}
