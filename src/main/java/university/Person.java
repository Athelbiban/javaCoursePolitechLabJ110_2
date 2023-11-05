package university;

abstract public class Person {
    private String name;
    private String surname;
    Gender gender;
    private String department;

    Person(String name, String surname, Gender gender, String department) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.department = department;
    }

    public void print() {
        System.out.printf("This is %s. %s %s at %s\n",
                name + " " + surname,
                gender.getPronoun(),
                this instanceof Teacher ? "teaches" : "studies",
                department);
}

    public static void printAll(Person[] persons) {
        files.Verification.dataVerification(persons);
        for (Person person : persons) {
            person.print();
        }
    }
}