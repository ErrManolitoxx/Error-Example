package org.example;

import lombok.extern.log4j.Log4j;

import java.util.InputMismatchException;
import java.util.Scanner;

@Log4j
public class StudentReader implements Reader<Student>{

    private static final Scanner scanner = new Scanner(System.in);


    @Override
    public Student read() {

        log.info("Introduzca los datos del estudiante: ");

        log.info("NIF del alumno: ");
        String nif = scanner.nextLine();

        log.info("Nombre del alumno: ");
        String name = scanner.nextLine();

        log.info("Apellidos: ");
        String surName = scanner.nextLine();

        Integer zipCode = null;

       try {
           log.info("Código postal del alumno: ");
           zipCode = scanner.nextInt();
           scanner.nextLine();

       }catch (InputMismatchException e) {
           log.error("Datos inválidos, inténtelo de nuevo.");
       }

       return new Student(nif, name, surName, zipCode);
    }
}
