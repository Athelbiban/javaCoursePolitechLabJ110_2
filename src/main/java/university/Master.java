package university;

class Master extends Student {
    Master(String name, String surname, Gender gender,
           String department, CourseNumber courseNumber) {
        super(name, surname, gender, department,
                courseNumber, Stage.MASTER);
    }
}