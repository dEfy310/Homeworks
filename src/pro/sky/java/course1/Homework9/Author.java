package pro.sky.java.course1.Homework9;
import java.util.Objects;
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

    @Override
    public String toString() {
        return "Author: " + firstName + " " + middleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstName.equals(author.firstName) && middleName.equals(author.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName);
    }
}

