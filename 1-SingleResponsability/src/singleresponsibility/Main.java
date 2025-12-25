package singleresponsibility;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentRepository repository = new StudentRepository();
        StudentPrinter printer = new StudentPrinter();

        List<Student> students = repository.getAll();
        printer.print(students);

        System.out.println("Proceso Completado");
    }
}
