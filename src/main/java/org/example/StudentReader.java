package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentReader implements Reader<Student>{

    private static final Logger log = LoggerFactory.getLogger(StudentReader.class);
    private static final Scanner scanner = new Scanner(System.in);


    @Override
    public Student read() {

        log.info("Introduzca los datos de l estudiante: ");

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
