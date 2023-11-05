package university;

public enum CourseNumber {
    I("one"),
    II("two"),
    III("three"),
    IV("four"),
    V("five");

    private String string;

    CourseNumber(String string) { this.string = string; }

    public String toString() { return string; }
}
