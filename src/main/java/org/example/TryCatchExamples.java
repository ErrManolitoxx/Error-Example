package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExamples {
    private static final Logger log = LoggerFactory.getLogger(TryCatchExamples.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            log.info("Introduce un número");
            int number = scanner.nextInt();
            scanner.nextLine();

            log.info("Introduce otr número");
            int number2 = scanner.nextInt();
            scanner.nextLine();

            log.info("La division es " + number / number2);
        } catch (InputMismatchException e) {
            log.error("El valor introducido no es un número");
        } catch (ArithmeticException e) {
            log.error("No se puede dividir 0 entre 0");
        }
    }
}
