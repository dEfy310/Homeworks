package pro.sky.java.course1.Homework8;
public class Author {
    private final String firstName;
    private final String middleName;

    public Author(String firstName, String middleName) {
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

}
