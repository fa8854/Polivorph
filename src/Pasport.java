import java.time.LocalDate;
import java.util.Objects;

public class Pasport {

    private final int number;
    private final String lastName;
    private final String name;
    private final String middleName;
   // private final LocalDate localDate;

    public Pasport(int number, String lastName, String name, String middleName) {
        this.number = number;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;

    }

    public int getNumber() {
        return number;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

//   public LocalDate getLocalDate() {
//        return localDate;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasport pasport = (Pasport) o;
        return number == pasport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
