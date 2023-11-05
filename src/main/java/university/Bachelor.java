package university;

public class Bachelor extends Student {
    Bachelor(String name, String surname, Gender gender,
             String department, CourseNumber courseNumber) {
        super(name, surname, gender, department,
                courseNumber, Stage.BACHELOR);
    }
}