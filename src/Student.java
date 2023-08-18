import java.time.LocalDate;
import java.time.Period;


class Student {
        private String firstName;
        private String lastName;
        private String gender;
        private LocalDate startDate;

        private Education education;

        private int year;


    public Student(String firstName, String lastName, String gender, LocalDate startDate, Education education) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.year = Period.between(startDate,LocalDate.now()).getYears();
        this.education = education;
    }
    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "         Студенты: " +
                "Имя: " +firstName + +'\n'+
                "Фамилия: " + lastName +'\n'+
                "Пол: " + gender +'\n'+
                "Учится: " + year + " лет"+'\n'+
                "Место учебы: " + education +'\n'+
                '\n'+'\n';
    }

}
