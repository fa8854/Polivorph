package Transport;

import java.util.Objects;

public class Mehanic <T extends Transport> {
    private final String name;
    private final String surname;
    private final String company;

    public Mehanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public boolean service(T t) {
        return t.service();
    }

    public void repair(T t) {
        t.repair();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mehanic<?> mehanic = (Mehanic<?>) o;
        return Objects.equals(name, mehanic.name) && Objects.equals(surname, mehanic.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}