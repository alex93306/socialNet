package org.mycompany.controllers;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonono");
        Stream<String> infinite = Stream.generate(() -> "chimb");
        s.findAny().ifPresent(System.out::println);
    }
}

class My implements AutoCloseable {
    private static int count = 1;
    private int i = count++;
    @Override
    public void close() throws FileNotFoundException, SQLException {
        try {
            int d;
            if (true) {
                d= 34;
                throw new FileNotFoundException();
            } else {
                throw new SQLException();
            }
        } catch (Exception e) {
            System.out.println("kdsjf");
            throw e;
        }
        
    }
}

