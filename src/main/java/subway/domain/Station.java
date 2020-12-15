package subway.domain;

import java.util.Objects;

public class Station {
    private StationName name;

    public Station(StationName name) {
        this.name = name;
    }

    public StationName getName() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Station) {
            Station anotherStation = (Station) object;
            return name.equals(anotherStation.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
