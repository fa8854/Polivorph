import java.util.HashSet;
import java.util.Set;

public class PasportList {
    private final Set<Pasport> pasports = new HashSet<>();
    public void addOrUpdatePasport (Pasport pasport){
        this.pasports.add(pasport);
    }

    public Pasport findByNumber(int number){
        for (Pasport pasport : pasports){
            if (pasport.getNumber() == number){
                return pasport;
            }
        }
        return null;
    }

}