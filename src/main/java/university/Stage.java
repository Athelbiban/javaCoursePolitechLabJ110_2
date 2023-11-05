package university;

public enum Stage {
    BACHELOR("bachelor"),
    MASTER("master");

    private String string;

    Stage(String string) {
        this.string = string;
    }

    public String toString() { return string; }
}
