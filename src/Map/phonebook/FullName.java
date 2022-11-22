package Map.phonebook;

import java.util.Objects;

public class FullName {
    private final String name;
    private final String fullName;

    public FullName(String name, String fullName) {
        this.name = name;
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullName fullName1 = (FullName) o;
        return Objects.equals(name, fullName1.name) && Objects.equals(fullName, fullName1.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fullName);
    }

    @Override
    public String toString() {
        return fullName + " " + name;
    }
}
