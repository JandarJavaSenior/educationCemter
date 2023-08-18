import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        School school = new School("Shkola 21", "ahunbaeva 21", LocalDate.of(1993, 3, 21));
        Univer univer = new Univer("Univer imeni Jandara Krasavchika", "kluchevaya 70", LocalDate.of(2020, 8, 28));
        College college = new College("Koleg imeni Koli", "Kolya 51", LocalDate.of(2016, 5, 21));

        Student student = new Student("Jandar", "Taalaybekov", "Men", LocalDate.of(2020, 8, 17), school);
        Student student1 = new Student("Jandar", "Taalaybekov", "Men", LocalDate.of(2020, 8, 17), univer);
        Student student2 = new Student("Jandar", "Taalaybekov", "Men", LocalDate.of(2020, 8, 17), college);
        Student student3 = new Student("Jandar", "Taalaybekov", "Men", LocalDate.of(2020, 8, 17), univer);
        Student student4 = new Student("Jandar", "Taalaybekov", "Men", LocalDate.of(2020, 8, 17), college);
        Student student5 = new Student("Jandar", "Taalaybekov", "Men", LocalDate.of(2020, 8, 17), school);
        Student student6 = new Student("Jandar", "Taalaybekov", "Men", LocalDate.of(2020, 8, 17), college);
        Student student7 = new Student("Jandar", "Taalaybekov", "Men", LocalDate.of(2020, 8, 17), univer);
        Student student8 = new Student("Jandar", "Taalaybekov", "Men", LocalDate.of(2020, 8, 17), school);
        Student student9 = new Student("Jandar", "Taalaybekov", "Men", LocalDate.of(2020, 8, 17), univer);

        Student[] students = {student,student1,student2,student3,student4,student6,student7,student8,student5,student9};
        for (Student currentStudent : students) {
            System.out.println(currentStudent);
        }



    }

}
