package Driver;

import Driver.Driver;
import Transport.Track;

public class DriverC extends Driver<Track> {


    public DriverC(String fio, int experience, Track track) {
        super(fio, "C", experience, track);
    }

}
