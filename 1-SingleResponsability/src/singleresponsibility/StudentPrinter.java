package singleresponsibility;

import java.util.List;

public class StudentPrinter {

    public void print(List<Student> students) {
        System.out.println("LISTA DE ESTUDIANTES:");
        for (Student s : students) {
            System.out.println(
                    "ID: " + s.getId() +
                            " | Nombre: " + s.getFullname());
        }
    }
}
