package singleresponsibility;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StudentRepository {

    private static FakeStorage<Student> storage;

    public StudentRepository() {
        storage = new FakeStorage<>();
        initData();
    }

    private void initData() {
        storage.add(new Student(1, "Pepito Pérez", List.of(3.0, 4.5)));
        storage.add(new Student(2, "Mariana Lopera", List.of(4.0, 5.0)));
        storage.add(new Student(3, "José Molina", List.of(2.0, 3.0)));
    }

    public List<Student> getAll() {
        return storage.getAll();
    }

    public void export() {

        List<Student> students = this.getAll();
        StringBuilder sb = new StringBuilder();

        sb.append("Id;Fullname;Grades\n");

        for (Student student : students) {
            sb.append(student.getId())
              .append(";")
              .append(student.getFullname())
              .append(";")
              .append(
                  student.getGrades()
                         .stream()
                         .map(String::valueOf)
                         .reduce((a, b) -> a + "|" + b)
                         .orElse("")
              )
              .append("\n");
        }

        try {
            Files.write(
                Path.of("Students.csv"),
                sb.toString().getBytes(StandardCharsets.UTF_16)
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
